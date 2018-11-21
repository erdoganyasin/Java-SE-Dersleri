package com.yasinerdogan_parametresiz_void_metod_tanimlama_Ýki_nesneli;

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
		
		
		System.out.println("------------------------");
		System.out.println("Ev nesnesi2 ve degerleri");
		
		
		Ev evnesnesi2 = new Ev();
		
		
		evnesnesi2.en = 5;
		evnesnesi2.boy = 7;
		evnesnesi2.yükseklik = 1;
		
		
		System.out.println("EN2    :" + evnesnesi2.en);
		System.out.println("BOY2    :" + evnesnesi2.boy);
		System.out.println("YÜKSEKLÝK2    :" + evnesnesi2.yükseklik);
		
		hacim = evnesnesi2.en * evnesnesi2.boy * evnesnesi2.yükseklik;
		System.out.println("EVÝN HACÝMÝ2 : " + hacim);
		
		evnesnesi2.hacimHesaplama();
		
		

	}

}
