package com.yasinerdoganDonguler;

public class _18_For_Ile_AsalSayilariBulma {

	public static void main(String[] args) {
		
		int limit = 20;
		
		System.out.println("1 ile" + limit + "arasýndaki asal sayýlar");
		
		
		for(int i=1; i < limit ; i++) {
			
			boolean durum = true;
			
			for(int j = 2; j < i ; j++) {
				
				if(i % j == 0) {
					durum = false;
					break;
				}
			}
			
			if(durum)
				System.out.println(i + " ");
		}

	}

}
