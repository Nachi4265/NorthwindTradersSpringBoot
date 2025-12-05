package com.pluralsight.NorthwindTradersSpringBoot.data;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {

    public SimpleProductDao(){
        add(new Product(1.99,"apple", "fruit", 1));
        add(new Product(1.99,"bannana", "fruit", 2));
        add(new Product(1.99,"orange", "fruit", 3));
        add(new Product(1.99,"graps", "fruit", 4));
    }

    List<Product> products = new ArrayList<>();

    int counter = 1;


    @Override
    public int add(Product product) {
        product.setProductID(counter++);
        products.add(product);
        return product.getProductID();
    }

    @Override
    public List<Product> getALL() {
        return products;
    }
}
