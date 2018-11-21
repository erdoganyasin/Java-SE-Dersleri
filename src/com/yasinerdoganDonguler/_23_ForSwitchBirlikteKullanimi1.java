package com.yasinerdoganDonguler;

public class _23_ForSwitchBirlikteKullanimi1 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5 ; i++) {
			switch(i) { 
			case 0:
				System.out.println("SIFIR");
				break;
			case 1:
				System.out.println("BÝR");
				break;
			case 2:
				System.out.println("ÝKÝ");
				break;
			case 3:
				System.out.println("ÜÇ");
				break;
				default:
					System.out.println("ÜÇ SAYISINDAN FARKLI BÝR SAYI GÝRÝLDÝ");
			}
		}

	}

}
