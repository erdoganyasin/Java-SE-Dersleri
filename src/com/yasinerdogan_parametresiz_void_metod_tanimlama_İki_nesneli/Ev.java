package com.yasinerdogan_parametresiz_void_metod_tanimlama_�ki_nesneli;

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
		
		
		System.out.println("------------------------");
		System.out.println("Ev nesnesi2 ve degerleri");
		
		
		Ev evnesnesi2 = new Ev();
		
		
		evnesnesi2.en = 5;
		evnesnesi2.boy = 7;
		evnesnesi2.y�kseklik = 1;
		
		
		System.out.println("EN2    :" + evnesnesi2.en);
		System.out.println("BOY2    :" + evnesnesi2.boy);
		System.out.println("Y�KSEKL�K2    :" + evnesnesi2.y�kseklik);
		
		hacim = evnesnesi2.en * evnesnesi2.boy * evnesnesi2.y�kseklik;
		System.out.println("EV�N HAC�M�2 : " + hacim);
		
		evnesnesi2.hacimHesaplama();
		
		

	}

}
