package com.yasinerdogan_this_anahtar_sozcugu;

public class Oda {
	
	double en;
	double boy;
	double yükseklik;
	
	public Oda() {
		
	}
	
	public Oda(double en, double boy, double yükseklik) {
		this.en = en;
		this.boy = boy;
		this.yükseklik = yükseklik;
	}
	
	double hacimHesapla(double en , double boy , double yükseklik) {
		return en * boy* yükseklik;
	}

}
