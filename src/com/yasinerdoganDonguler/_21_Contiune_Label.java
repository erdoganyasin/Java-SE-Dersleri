package com.yasinerdoganDonguler;

public class _21_Contiune_Label {

	public static void main(String[] args) {
		
		String cumle = "G�zel g�ren, g�zel d���n�r," + "g�zel d���nen, hayat�ndan lezzet al�r";
		
		String aranan = "g�ren";
		
		boolean durum = false;
		
		int uzunluk = cumle.length() - aranan.length();
		
		test: for(int i = 0; i <= uzunluk; i++) {
			int n = aranan.length();
			int j = i;
			int k = 0;
			while(n-- !=0) {
				if(cumle.charAt(j++) != aranan.charAt(k++)) {
					continue test;
				}
			}
			
				durum = true;
				break test;
		}
		
		System.out.println(durum? "Bulundu" : "Bulunamad�");

	}

}
