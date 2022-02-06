package com.sunglowsys.config;

import com.sunglowsys.bean.Customer;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class JavaConfiguration {

    @Bean
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Customer getCustomer(){
        return new Customer();
    }
}
