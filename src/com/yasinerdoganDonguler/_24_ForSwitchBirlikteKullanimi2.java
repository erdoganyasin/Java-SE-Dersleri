package com.yasinerdoganDonguler;

public class _24_ForSwitchBirlikteKullanimi2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10 ; i++) {
			switch(i) { 
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Beþten küçük : " + i);
				break;
			case 5:
			case 6:
				System.out.println("Yediden küçük : " + i);
				break;
			case 7:
				System.out.println("Yedi sayýsý : " + i);
				break;
				default:
					System.out.println("Yediden BÜYÜK" + i);
			}
		}

	}

}
