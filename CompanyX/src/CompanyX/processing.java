package CompanyX;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class processing {
	//private int processingTime;
// so the processing class adds them in the queue and i send the values to customer and than it calls it and adds it the queue
	private Queue<Customer> orderInfo; // adding the customer into a queue
	//constructor here 
	public processing(Queue<Customer> orderInfo) {
		super();
		this.orderInfo = new LinkedList<>();
	}
	void processingOrder(Customer customer) { // so this method take there ordertype and than assign the priorty
		int priorty = 0;
		String type = customer.getOrderType();
		
		if("bulk".equalsIgnoreCase(type)) {
			//System.out.println("order type bulk");
			priorty = 2; // if its bulk than 2 priorty
		}
		else if("rush".equalsIgnoreCase(type)) {
			priorty =3; // if its rush than 3 priorty
		}
		else if("favor".equalsIgnoreCase(type)){
			priorty = 1; // if its a favor than 1 priorty
		}
		else if ("".equalsIgnoreCase(type)){
			priorty = 0; // default 0
			//System.out.println("no priorty");
		}
		//customer.setOrderType(type);
		customer.setPriorty(priorty); // setting priorty
		
		  // Generate random processing time between 1 and 10 days
        Random random = new Random();
        int processingTime = random.nextInt(10) + 1;
        customer.setProcessingTime(processingTime);
		
		orderInfo.add(customer); // adding to the queue
		
		System.out.println("Adding your in the queue................"); // printing the stuff
		System.out.println("Customer name: " + customer.getName());
		System.out.println("Order Number: " + customer.getOrderNum());
		System.out.print("Order type: " + customer.getOrderType());
	    if ("".equalsIgnoreCase(type)) { // this if statement only works when there is no priorty given so if its bulk or any other priorty than it never gets excuted
	        System.out.println(" NO PRIORITY");
	    } else {
	        System.out.println();
	    }
		System.out.println("Priorty based on your order type: " + customer.getPriorty());
		System.out.println("processing time in days: " + customer.getProcessingTime());
		System.out.println("its processing........");
		System.out.println();
	}
	void processedOrder() {
		
		while(!orderInfo.isEmpty()) { // while oderInfo is not empty it will print all the stuff
			Customer currentCustomer = orderInfo.poll(); // this get the info for the order
			String orderType = currentCustomer.getOrderType(); // this get order type
			
			//printing the stuff
			System.out.println("Added in the queue...");
			System.out.println("Customer name: " + currentCustomer.getName());
			System.out.println("Order Number: " + currentCustomer.getOrderNum());
			System.out.print("Order type: " + currentCustomer.getOrderType());
			 if ("".equalsIgnoreCase(orderType)) {
			        System.out.println(" NO PRIORITY");
			    } else {
			        System.out.println();
			    }
			System.out.println("Priorty based on your order type: " + currentCustomer.getPriorty());
			//System.out.println("Processing Time: " + currentCustomer.getProcessingTime());
			System.out.println("it took " + currentCustomer.getProcessingTime() + " days");
			System.out.println("Its Processed");
			System.out.println();
		}
	}
}
