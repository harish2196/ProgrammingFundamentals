package com.chainsys.day2;



public class Operations {

	public static void main(String[] args) {
		
	  
		String str = "Hello";
        boolean isString = str instanceof String;
        System.out.println("\ninstanceof Operator:");
        System.out.println("Is str a String? " + isString);
        
   
        int age = 20;
        String result = (age >= 18) ? "Eligible for voting" : "Not eligible for voting";
        System.out.println("\nConditional Operator:");
        System.out.println(result);
        
    
        boolean x = true, y = false;
        boolean logicalAnd = x && y;
        boolean logicalOr = x || y;
        boolean logicalNot = !y;
        
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);
        
        int num = 10;
        num += 5; 
        System.out.println("\nAssignment Operators:");
        System.out.println("Value of num: " + num);


		       
	}

	}


