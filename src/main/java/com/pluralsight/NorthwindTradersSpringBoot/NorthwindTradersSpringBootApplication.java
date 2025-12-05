package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.data.ProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.data.SimpleProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import com.pluralsight.NorthwindTradersSpringBoot.userinterface.CommandLineUI;
import com.pluralsight.NorthwindTradersSpringBoot.userinterface.InputCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {

//	public static ProductDao productDao = new SimpleProductDao();


	public static void main(String[] args) {

		SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);

	}

}
