package com.yasinerdoganKontrolÝfadeleri;

public class _10_SwitchDongusundeStringKullanýmý {

	public static void main(String[] args) {
		
		String ay = "NÝSAN";
		
		int geriDonenAy = aySayisiniAl(ay.toUpperCase());
		
		if(geriDonenAy == 0) {
			System.out.println("Geçersiz ay");
		}else {
			System.out.println(geriDonenAy);
		}

	}
	
	public static int aySayisiniAl(String ay) {
		
		int aySirasý = 0;
		
		if(ay == null) {
			return aySirasý;
		}
		switch(ay) {
		case "OCAK":
			aySirasý =1;
			break;
		case "ÞUBAT":
			aySirasý =2;
			break;
		case "MART":
			aySirasý =3;
			break;
		case "NÝSAN":
			aySirasý =4;
			break;
		case "MAYIS":
			aySirasý =5;
			break;
		case "HAZÝRAN":
			aySirasý =6;
			break;
		case "TEMMUZ":
			aySirasý =7;
			break;
		case "AGUSTOS":
			aySirasý =8;
			break;
		case "EYLÜL":
			aySirasý =9;
			break;
		case "EKÝM":
			aySirasý =10;
			break;	
		case "KASIM":
			aySirasý =11;
			break;	
		case "ARALIK":
			aySirasý =12;
			break;	
		default:
			aySirasý =0;
			break;
			
		}
		return aySirasý;
	}

}
