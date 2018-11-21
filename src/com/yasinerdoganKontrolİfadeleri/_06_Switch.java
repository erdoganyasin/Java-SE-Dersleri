package com.yasinerdoganKontrolÝfadeleri;

public class _06_Switch {

	//break býrakýlmadýgý ýcýn tum sartlar yazdýrýldý.
	
	public static void main(String[] args) {
		int i = 0;
		
		switch(i) 
		{
			case 0:
				System.out.println("i 0");
			case 1:
				System.out.println("i 1");
			case 2 :
				System.out.println("i 2");
				
			default:
				System.out.println("Varsayýlan mesaj");

	}
		
		int ay = 5;
		String ayString;
		
		switch (ay) {
		case 1:
			ayString = "Ocak";
			break;
		case 2:
			ayString = "Þubat";
			break;
		case 3:
			ayString = "Mart";
			break;
		case 4:
			ayString = "Nisan";
			break;
		case 5:
			ayString = "Mayýs";
			break;
		case 6:
			ayString = "Haziran";
			break;
		case 7:
			ayString = "Temmuz";
			break;
		case 8:
			ayString = "Agustos";
			break;
		case 9:
			ayString = "Eylül";
			break;
		case 10:
			ayString = "Ekim";
			break;
		case 11:
			ayString = "Kasým";
			break;
		case 12:
			ayString = "Aralýk";
			break;	
		default :
			ayString ="Geçersiz bir ay girdiniz!";	
			break;
		
	}		
		System.out.println(ayString);
}
}