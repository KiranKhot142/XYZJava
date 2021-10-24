package com.csi.stringbasics;

public class RepeatedCharacterInString {
	public static void main(String[] args) {

		String str = "pratap";

		int i, j, cnt = 0;

		char charstr[] = str.toCharArray();
		System.out.println("\n Orignal String: ");
		System.out.println("\n Repeated Character are: ");
		for (i = 0; i < str.length(); i++) {
			for (j = i + 1; j < str.length(); j++) {
				if (charstr[i] == charstr[j]) {
					System.out.println(charstr[j]);
					cnt++;
					break;

				}
			}
		}
	}
}
