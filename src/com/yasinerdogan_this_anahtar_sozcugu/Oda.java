package com.yasinerdogan_this_anahtar_sozcugu;

public class Oda {
	
	double en;
	double boy;
	double y�kseklik;
	
	public Oda() {
		
	}
	
	public Oda(double en, double boy, double y�kseklik) {
		this.en = en;
		this.boy = boy;
		this.y�kseklik = y�kseklik;
	}
	
	double hacimHesapla(double en , double boy , double y�kseklik) {
		return en * boy* y�kseklik;
	}

}
