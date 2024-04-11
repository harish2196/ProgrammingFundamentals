/**
 * 
 */
package com.chainsys.day2;
import java.util.Scanner; 
/**
 * 
 */
public class StudentDetails {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Gender: ");
		String gender=sc.nextLine();
		System.out.println("Enter Dept: ");
		String Dept=sc.nextLine();
		System.out.println("Enter Regno: ");
		int Reg=sc.nextInt();
		System.out.println("Enter Mobieno: ");
		int Mobileno=sc.nextInt();
		System.out.println("Enter Location: ");
		String location=sc.next();
		
		System.out.println("\nName: " + name + "!");
		System.out.println("Gender : "+ gender);
		System.out.println("Dept :"+ Dept);
		System.out.println("Reg No : "+ Reg);
		System.out.println("MobileNo : "+ Mobileno);
		System.out.println("Location : "+ location);
		

	}

}
