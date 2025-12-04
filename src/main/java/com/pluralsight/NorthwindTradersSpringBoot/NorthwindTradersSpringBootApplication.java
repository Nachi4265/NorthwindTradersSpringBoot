package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {

	private static ProductDao productDao = new SimpleProductDao();

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);

		for (String bean: ac.getBeanDefinitionNames()){
			System.out.println(bean);
		}
//		String prompt = """
//
//				Please make a choice
//				1) List products
//				2) Add product
//				""";
//
//		while(true){
//
//			System.out.println(prompt);
//			int choice = InputCollector.promptForInt("Enter choice here");
//
//			switch (choice){
//				case 1:
//					dolistProducts();
//					break;
//				case 2:
//					doAddProducts();
//					break;
//				case 0:
//					return;
//				default:
//					System.out.println("Invalid entry");
//
//
//
//			}
//		}

	}

	private static void doAddProducts() {

		String productname = InputCollector.promptForString("Please enter name for the product ");
		String productCategory = InputCollector.promptForString("Please enter product category");
		double productPrice = InputCollector.promptForDouble("Please enter the Price of product");
		Product product = new Product(productPrice,productCategory,productname,0);

		productDao.add(product);

	}

	private static void dolistProducts() {

		List<Product> products = productDao.getALL();
		for(Product p : products){
			System.out.println(p);
		}
	}

}
