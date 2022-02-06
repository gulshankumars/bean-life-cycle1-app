package com.sunglowsys.test;

import com.sunglowsys.bean.Customer;
import com.sunglowsys.config.JavaConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        System.out.println("Surendra Singh");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Customer customer = context.getBean(Customer.class);
        customer.getCustId();
        customer.getEmail();
        customer.getMobile();
        customer.getName();

        System.out.println(customer);
    }
}
