package com.yasinerdogan_parametresiz_void_metod_tanimlama_bir_nesneli;

public class Ev {
	
	
	double en;
	double boy;
	double y�kseklik;
	
	
		void hacimHesaplama() {
			System.out.print("Metodun i�in den yap�lan hacim hesab� : ");
			System.out.println(en*boy*y�kseklik);
		}

	public static void main(String[] args) {
		
		Ev evnesnesi = new Ev();
		
		System.out.println("evNesnesi ve degerleri");
		evnesnesi.en = 6;
		evnesnesi.boy =3;
		evnesnesi.y�kseklik = 2;
		
		
		System.out.println("EN     :" +evnesnesi.en);
		System.out.println("BOY     :" +evnesnesi.boy);
		System.out.println("Y�KSEKL�K     :" +evnesnesi.y�kseklik);
		
		double hacim = evnesnesi.en * evnesnesi.boy * evnesnesi.y�kseklik;
		System.out.println("EV�N HACM� : " +hacim);
		
		evnesnesi.hacimHesaplama();
		
		

	}

}
