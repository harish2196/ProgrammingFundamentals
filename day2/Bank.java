/**
 * 
 */
package com.chainsys.day2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the name of the bank: ");
	        String name = scanner.nextLine();
	    
	        System.out.print("Enter the location of the bank: ");
	        String location = scanner.nextLine();
	       
	        System.out.print("Enter the number of branches of the bank: ");
	        int branches = scanner.nextInt();
	      
	        System.out.println("\nBank Details:");
	      
	        System.out.println("Name : "+ name);
			System.out.println("Location :"+ location);
			System.out.println("Branches : "+ branches);

	        scanner.close();
	}

}
