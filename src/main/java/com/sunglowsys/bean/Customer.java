package com.sunglowsys.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Customer implements InitializingBean, DisposableBean {
    private String custId;
    private String name;
    private String email;
    private String mobile;

    public Customer() {
        System.out.println("Customer object is created");
    }

        public String getCustId() {
        return custId;
    }
    @Value("SGS123")
    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }
    @Value("Gulshan Kumar")
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    @Value("gk@gmail.com")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }
    @Value("8057657807")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


   // @PostConstruct
    //public void init(){
       // System.out.println("initilige the object");
   // }
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy object");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initialize the object");

    }


   // @PreDestroy
  //  public void destroy(){
       // System.out.println("destroy  the object");
   // }


    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
