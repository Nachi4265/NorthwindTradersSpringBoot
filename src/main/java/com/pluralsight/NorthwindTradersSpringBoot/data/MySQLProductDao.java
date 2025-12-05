package com.pluralsight.NorthwindTradersSpringBoot.data;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLProductDao implements ProductDao {


    DataSource dataSource;

    @Autowired
    public MySQLProductDao(DataSource dataSource){
        this.dataSource =dataSource;
    }

    @Override
    public int add(Product product) {
        return 0;
    }

    @Override
    public List<Product> getALL() {
        //System.out.println("From the MySQLProductDao" + dataSource.getConnection().toString());
       return new ArrayList<Product>();

    }


}
