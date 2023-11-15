package com.infinite.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BillingSystemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingSystemsApplication.class, args);	
			    invoice i = new invoice();
			    i.getdata();
			    i.WriteInvoice();
			    System.out.println("Invoice Generated!");
			  }
	}
