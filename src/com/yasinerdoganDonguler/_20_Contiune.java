package com.yasinerdoganDonguler;

public class _20_Contiune {

	public static void main(String[] args) {
		
		int intArray[] = new int [] {1, 2, 3, 4, 5};
		
		System.out.println("3 hari� t�m numaralar");
		
		for(int j = 0; j< intArray.length ; j++) {
			
			if(intArray[j] == 3)
				continue;
			else
				System.out.println(intArray[j]);
		}
		
		
		
		
		String cumle = "G�zel g�ren, g�zel d���n�r," + "g�zel d���nen, hayat�ndan lezzet al�r";
		int uzunluk = cumle.length();
		int adet = 0;
		
		for(int m = 0; m<uzunluk ; m++) {
			
			if(cumle.charAt(m) != '�')
				continue;
			adet++;
		}
		System.out.println(adet + "tane bulundu");
		
		
		

	}

}
