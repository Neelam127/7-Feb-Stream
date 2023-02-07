package com.cg1.practice;

public class FindOccuranceOfChar {
	
	public static void main(String[] args) {
		String str="Neelam Kurhade";
		
		String str2=str.replaceAll("e", "");
		
		int occurance=str.length()-str2.length();
		System.out.println(occurance);
	}

}
