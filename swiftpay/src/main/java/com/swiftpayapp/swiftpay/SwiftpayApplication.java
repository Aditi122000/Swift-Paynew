package com.swiftpayapp.swiftpay;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com")
class SwiftpayApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SwiftpayApplication.class, args);

		
	}

}
