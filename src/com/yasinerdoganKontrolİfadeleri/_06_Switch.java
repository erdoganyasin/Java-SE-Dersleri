package com.yasinerdoganKontrol�fadeleri;

public class _06_Switch {

	//break b�rak�lmad�g� �c�n tum sartlar yazd�r�ld�.
	
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
				System.out.println("Varsay�lan mesaj");

	}
		
		int ay = 5;
		String ayString;
		
		switch (ay) {
		case 1:
			ayString = "Ocak";
			break;
		case 2:
			ayString = "�ubat";
			break;
		case 3:
			ayString = "Mart";
			break;
		case 4:
			ayString = "Nisan";
			break;
		case 5:
			ayString = "May�s";
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
			ayString = "Eyl�l";
			break;
		case 10:
			ayString = "Ekim";
			break;
		case 11:
			ayString = "Kas�m";
			break;
		case 12:
			ayString = "Aral�k";
			break;	
		default :
			ayString ="Ge�ersiz bir ay girdiniz!";	
			break;
		
	}		
		System.out.println(ayString);
}
}