
package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the name of the hospital: ");
	        String name = scanner.nextLine();
	       	System.out.print("Enter the location of the hospital: ");
	        String location = scanner.nextLine();
	       	System.out.print("Enter the capacity of the hospital: ");
	        int capacity = scanner.nextInt();
	    

	       
	        System.out.println("\nHospital Details:");
	        System.out.println("Name : "+ name);
			System.out.println("Location :"+ location);
			System.out.println("Capacity : "+ capacity);

	        scanner.close();

	}

}
