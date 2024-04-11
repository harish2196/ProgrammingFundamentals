package com.chainsys.day5;
import java.util.Scanner;

public class CabFareCalculator2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cab micro = new Cab("Micro", 10);
		Cab mini = new Cab("Mini", 15);
		Cab prime = new Cab("Prime", 20);
		int i=0;
		System.out.println("Enter Name(abcd): ");
		String name=scanner.nextLine();
		while (i < name.length()) {
			char ch = name.charAt(i);
			if (!Character.isLetter(ch)) {
				System.out.println("Only In Alphabet");
				System.out.println("Enter Name(Ex:abcd): ");
				name=scanner.nextLine();
				System.out.println("Valid name: " + name);
			}
			i++;
		}
		
		System.out.print("Enter Cab Type (Micro, Mini, Prime): ");
		String cabType = scanner.next().toLowerCase();
		if (!cabType.equals("micro") && !cabType.equals("mini") && !cabType.equals("prime")) {
			 i=0;
			while (i < cabType.length()) {
				char ch = cabType.charAt(i);
				if (!Character.isLetter(ch)) {
					System.out.println("Only In Alphabet");
					System.out.print("Enter Cab Type (Micro, Mini, Prime): ");
					cabType = scanner.next().toLowerCase();
				}
				i++;
			}
		}
		System.out.print("Enter the km: ");
		int km = scanner.nextInt();
		while (km < 0) {
			System.out.println("Please Re-enter Positive number");
			System.out.print("Enter the km: ");
			km = scanner.nextInt();
		}

		

		Cab selectedCab;
		switch (cabType) {
		case "micro":
			selectedCab = micro;
			break;
		case "mini":
			selectedCab = mini;
			break;
		case "prime":
			selectedCab = prime;
			break;
		default:
			System.out.println("Invalid cab type entered. Using default fare of Prime cab.");
			selectedCab = prime;
		}

		double totalFare = selectedCab.calculateFare(km);
		System.out.println("Total fare without discount: Rs." + totalFare);

		double discount = Cab.calculateDiscount(totalFare); 
		double discountedBill = totalFare - discount;
		System.out.println(String.format("Discount applied: Rs. %.2f", discount));

		System.out.println("Total bill after discount: Rs." + discountedBill);




		scanner.close();
	}
}
