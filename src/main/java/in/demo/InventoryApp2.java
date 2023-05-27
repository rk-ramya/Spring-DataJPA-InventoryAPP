package in.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.demo.bo.Inventory;
import in.demo.service.IInventoryservice;

@SpringBootApplication
public class InventoryApp2 {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(InventoryApp2.class, args);
		IInventoryservice service = context.getBean(IInventoryservice.class);
		List<Integer> id = new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		Inventory in=new Inventory();
		in.setId(1);
		in.setItemsInStock(40);
		in.setPrice(9000.0);
		in.setProductName("Mobiles");
		in.setUserID(200);
		System.out.println(service.registerItem(in));
		in.setId(2);
		in.setItemsInStock(50);
		in.setPrice(5000.0);
		in.setProductName("pc");
		in.setUserID(500);
		System.out.println(service.registerItem(in));
		
		System.out.println("enter no. of users to fetch details");
		int numOfUsers=sc.nextInt();
		System.out.println("Enter the "+numOfUsers+" IDs to fetch details");
		for(int i=0;i<numOfUsers;i++)
			id.add(sc.nextInt());
		Iterable results=service.fetchUsersById(id);
		results.forEach(System.out::println);
	}
}