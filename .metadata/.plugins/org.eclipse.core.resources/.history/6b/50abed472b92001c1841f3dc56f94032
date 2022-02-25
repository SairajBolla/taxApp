package com.abc.ecom.client;

import java.util.Scanner;

import com.abc.ecom.service.OrderService;

public class OrderServiceClient {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product Id:");		
		int productId = sc.nextInt();
		
		System.out.println("Enter quantity:");	
		int quantity = sc.nextInt();
		
		sc.close();
		
		//total order amount including gst.
		
		OrderService orderService = new OrderService();
		double totalAmount = orderService.totalOrderAmount(productId, quantity);
		
		System.out.println("Your Order amount is : "+totalAmount);
		

	}

}
