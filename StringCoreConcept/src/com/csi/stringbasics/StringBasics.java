package com.csi.stringbasics;

public class StringBasics {
	public static void main(String[] args) {

		String s1 = "CREDIT"; // SCP Memory
		String s2 = new String("CREDIT"); // Heap Memory

		System.out.println("\n ==: " + s1 == s2); // actual Address
		System.out.println("\n s1 .equals: " + s1.equals(s2)); // actual
																// Value/Content
		System.out.println("\n s1 equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));
		System.out.println("\n s1 Length: " + s1.length());
		System.out.println("\n s1.charAt(5): " + s1.charAt(5));
		System.out.println("\n s1 CompareTo s2: " + s1.compareTo(s2));
		System.out.println("\n toLowerCase: " + s1.toLowerCase());
		// System.out.println("\n s1.concat: "+s1.concat(s2));

		s1 = s1.concat(s2);
		System.out.println("\n s1: " + s1);

		s1.concat(s2); // immutable
		System.out.println("\n s1: " + s1);

		StringBuffer sBuffer1 = new StringBuffer("CSI");		//mutable
		StringBuffer sBuffer2 = new StringBuffer("Pune");
		sBuffer1.append(sBuffer2);
		System.out.println("String Buffer Output: " + sBuffer1);

		StringBuilder sBuilder1 = new StringBuilder("FULLSTACK");		//mutable
		StringBuilder sBuilder2 = new StringBuilder("JAVADEVELOPER");
		sBuilder1.append(sBuilder2);
		System.out.println("\n String Builder Output: " + sBuilder1);

	}
}
