package com.example;

import com.example.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.AnnotationInterceptors;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
    public static void main(String[] args) {
        String address = "http://localhost:8080/services/hello";
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloServiceImpl.class);
        factory.setAddress(address);
        factory.create();
        System.out.println("WSDL: " + address + "?wsdl");
    }


}


