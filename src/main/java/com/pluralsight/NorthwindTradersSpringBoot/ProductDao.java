package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;

import java.util.List;

public interface ProductDao {

    int add (Product product);
    List<Product> getALL();


}
