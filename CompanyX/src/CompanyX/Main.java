package CompanyX;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// so this is going to use an queue
// need a class for the customer and pass in the name, priorty, type of order and maybe the processing time also need setters and getters
// so the processing class will add the orders in a queue and than it will print out the order number and time and other stuff
// main class should pass in the value and than they will be printed out

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Customer> orderQueue = new LinkedList<>();
		processing processingSystem = new processing(new LinkedList<>()); // calling the processing class
/*
        // creating some orders for the customer
		// can read this through a file to look more professional
        Customer order1 = new Customer(12345, "John", "Bulk", 5);
        Customer order2 = new Customer(824875782, "Abhi", "", 7);
        Customer order3 = new Customer(8248757, "James", "Rush", 3);
        Customer order4 = new Customer(8248711, "Anna", "Favor", 2);
        
       // Customer customer = new Customer();
        
        
        
        processingSystem.processingOrder(order1); // printing order 1
       // System.out.println();
        processingSystem.processingOrder(order2);// printing order 2
        processingSystem.processingOrder(order3);// printing order 3
        processingSystem.processingOrder(order4);// printing order 4
        
        System.out.println("AFTER THE PROCESSED");
        System.out.println("--------------------");
        
        processingSystem.processedOrder(); // orders being processed
        
        // this code was generated without any loops and we had to manually give values to it but 
//with loops below we give names in one method and than it takes names from there and a random order 
//type so then it calls the loop and it generate only up to 5 orders randomly.
        */
		
		// generating a random number of orders between 1 and 5 
        Random random = new Random(); // ramdom number creater
        int numberOfOrders = random.nextInt(1,5); // pass in the value how many orders i want to run between 1 and 5

        System.out.println("Generating " + numberOfOrders + " random orders..."); // print a line saying this so ik how many orders i am printing
        System.out.println("-------------");

        for (int i = 1; i <= numberOfOrders; i++) {
            Customer randomOrder = generateRandomOrder(i); // generating orders
            processingSystem.processingOrder(randomOrder);
        } // generating random orders and printing them out by calling processing order in customer class

        System.out.println("AFTER THE PROCESSED"); 
        System.out.println("--------------------");

        processingSystem.processedOrder(); // calling the processed order method in customer

	}
	private static Customer generateRandomOrder(int orderNumber) { //A method to generate a 
//random Customer object with random attributessends value to the customer class than it gets 
//processed in the processing class
        Random random = new Random();

        int orderNum = random.nextInt(1, 1000000); // randomizing orderId between 1 and 1000000
        String[] names = {"John", "Abhi", "James", "Anna", "Emma"}; // names for people to add into the queue or the line for the priorty
        String customerName = names[random.nextInt(names.length)]; // this gets a random name from the array above
        String[] orderTypes = {"Bulk", "Rush", "Favor", ""}; // order type "" - is means default
        String orderType = orderTypes[random.nextInt(orderTypes.length)]; // this gets random order listed above
        int processingTime = random.nextInt(10) + 1; // Random processing time between 1 and 10 days

        return new Customer(orderNum, customerName, orderType, processingTime); // returning the orderNum, name, type and the time than this 
    }
	

}
