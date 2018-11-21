package com.yasinerdoganKontrol�fadeleri;

public class _10_SwitchDongusundeStringKullan�m� {

	public static void main(String[] args) {
		
		String ay = "N�SAN";
		
		int geriDonenAy = aySayisiniAl(ay.toUpperCase());
		
		if(geriDonenAy == 0) {
			System.out.println("Ge�ersiz ay");
		}else {
			System.out.println(geriDonenAy);
		}

	}
	
	public static int aySayisiniAl(String ay) {
		
		int aySiras� = 0;
		
		if(ay == null) {
			return aySiras�;
		}
		switch(ay) {
		case "OCAK":
			aySiras� =1;
			break;
		case "�UBAT":
			aySiras� =2;
			break;
		case "MART":
			aySiras� =3;
			break;
		case "N�SAN":
			aySiras� =4;
			break;
		case "MAYIS":
			aySiras� =5;
			break;
		case "HAZ�RAN":
			aySiras� =6;
			break;
		case "TEMMUZ":
			aySiras� =7;
			break;
		case "AGUSTOS":
			aySiras� =8;
			break;
		case "EYL�L":
			aySiras� =9;
			break;
		case "EK�M":
			aySiras� =10;
			break;	
		case "KASIM":
			aySiras� =11;
			break;	
		case "ARALIK":
			aySiras� =12;
			break;	
		default:
			aySiras� =0;
			break;
			
		}
		return aySiras�;
	}

}
