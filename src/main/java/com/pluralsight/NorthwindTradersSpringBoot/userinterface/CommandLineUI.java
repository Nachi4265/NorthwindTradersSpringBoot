package com.pluralsight.NorthwindTradersSpringBoot.userinterface;

import com.pluralsight.NorthwindTradersSpringBoot.NorthwindTradersSpringBootApplication;
import com.pluralsight.NorthwindTradersSpringBoot.data.ProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CommandLineUI implements CommandLineRunner {


    private ProductDao productDao;

    @Autowired
    public CommandLineUI(ProductDao productDao){
        this.productDao = productDao;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hello from CommandLineUI.run");

        String prompt = """

				Please make a choice
				1) List products
				2) Add product
				""";

        while(true){

            System.out.println(prompt);
            int choice = InputCollector.promptForInt("Enter choice here");

            switch (choice){
                case 1:
                    dolistProducts();
                    break;
                case 2:
                    doAddProducts();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    private  void dolistProducts() {

        List<Product> products = productDao.getALL();
        for(Product p : products){
            System.out.println(p);
        }
    }

    private  void doAddProducts(){

        String productname = InputCollector.promptForString("Please enter name for the product ");
        String productCategory = InputCollector.promptForString("Please enter product category");
        double productPrice = InputCollector.promptForDouble("Please enter the Price of product");
        Product product = new Product(productPrice,productCategory,productname,0);

        productDao.add(product);

    }
}
