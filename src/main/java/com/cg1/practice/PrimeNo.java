package com.cg1.practice;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int n=4;
		boolean prime=true;
		
		if(n==1||n==0) {
			prime=false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				prime=false;
			}
		}
		
		if(prime==true) {
			
			System.out.println("Prime No");
			
		}
		else {
			System.out.println("Not a prime");
		}
	}

}
