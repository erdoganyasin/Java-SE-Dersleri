package com.yasinerdoganDonguler;

public class _20_Contiune {

	public static void main(String[] args) {
		
		int intArray[] = new int [] {1, 2, 3, 4, 5};
		
		System.out.println("3 hariç tüm numaralar");
		
		for(int j = 0; j< intArray.length ; j++) {
			
			if(intArray[j] == 3)
				continue;
			else
				System.out.println(intArray[j]);
		}
		
		
		
		
		String cumle = "Güzel gören, güzel düþünür," + "güzel düþünen, hayatýndan lezzet alýr";
		int uzunluk = cumle.length();
		int adet = 0;
		
		for(int m = 0; m<uzunluk ; m++) {
			
			if(cumle.charAt(m) != 'ü')
				continue;
			adet++;
		}
		System.out.println(adet + "tane bulundu");
		
		
		

	}

}
