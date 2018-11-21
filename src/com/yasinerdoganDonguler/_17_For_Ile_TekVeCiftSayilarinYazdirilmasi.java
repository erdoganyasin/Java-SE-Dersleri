package com.yasinerdoganDonguler;

public class _17_For_Ile_TekVeCiftSayilarinYazdirilmasi {

	public static void main(String[] args) {
		
		int limit = 20;
		
		for(int i=1; i <= limit ; i++) {
			
				if(i %2 !=0) {
					System.out.print(i + " ");
				}
		}
		
		
		System.out.println("");
		
		for(int i2 = 1; i2<=limit; i2++) {
			
			if(i2 % 2 == 0) {
				System.out.print(i2 + " ");
			}
		}

	}

}
