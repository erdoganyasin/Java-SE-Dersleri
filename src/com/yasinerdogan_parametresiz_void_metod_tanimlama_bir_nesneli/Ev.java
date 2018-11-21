package com.yasinerdogan_parametresiz_void_metod_tanimlama_bir_nesneli;

public class Ev {
	
	
	double en;
	double boy;
	double yükseklik;
	
	
		void hacimHesaplama() {
			System.out.print("Metodun için den yapýlan hacim hesabý : ");
			System.out.println(en*boy*yükseklik);
		}

	public static void main(String[] args) {
		
		Ev evnesnesi = new Ev();
		
		System.out.println("evNesnesi ve degerleri");
		evnesnesi.en = 6;
		evnesnesi.boy =3;
		evnesnesi.yükseklik = 2;
		
		
		System.out.println("EN     :" +evnesnesi.en);
		System.out.println("BOY     :" +evnesnesi.boy);
		System.out.println("YÜKSEKLÝK     :" +evnesnesi.yükseklik);
		
		double hacim = evnesnesi.en * evnesnesi.boy * evnesnesi.yükseklik;
		System.out.println("EVÝN HACMÝ : " +hacim);
		
		evnesnesi.hacimHesaplama();
		
		

	}

}
