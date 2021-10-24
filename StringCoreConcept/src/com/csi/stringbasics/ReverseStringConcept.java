package com.csi.stringbasics;

public class ReverseStringConcept {

	public static void main(String[] args) {

		String str = "Komal";

		StringBuffer sb = new StringBuffer(str);
		System.out.println("\n Reverse a String: " + sb.reverse());

		String companyName = "  ";

		if (companyName != "") {
			System.out.println("Not Empty");

		} else {
			System.out.println("Empty !!!");
		}

		if (companyName.isEmpty()) {
			System.out.println("Empty");
		} else {
			System.out.println("Not Empty");
		}
	}
}