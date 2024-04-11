package com.chainsys.day5;



import java.util.Scanner;

class Cab {
	private String cabType;
	private double farePerKm;

	public Cab(String cabType, double farePerKm) {
		this.cabType = cabType;
		this.farePerKm = farePerKm;
	}

	public double calculateFare(int km) {
		return km * farePerKm;
	}

	public String getCabType() {
		return cabType;
	}

	public static double calculateDiscount(double num) {
		double discount = 0.0;
		Scanner scanner = new Scanner(System.in);
		if (num > 5000) {
			System.out.println("Enter CouponCode: ");
			String code=scanner.nextLine();
			if(code.equals("COUP_5")) {
				discount = 0.05 * num;
			}else {
				System.out.println("Sorry Not Valid");
			}

		} else if (num > 2000 &&  num<5000) {

			System.out.println("Enter CouponCode: ");
			String code=scanner.nextLine();
			if(code.equals("COUP_2")) {
				discount = 0.02 * num;
			}else {
				System.out.println("Sorry Not Valid");
			}
			return discount;
		}
		return discount;

	}
}

