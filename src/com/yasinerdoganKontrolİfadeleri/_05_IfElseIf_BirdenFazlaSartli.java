package com.yasinerdoganKontrol�fadeleri;

public class _05_IfElseIf_BirdenFazlaSartli {

	public static void main(String[] args) {
		
		
		int ay = 4;
			String mevsim;
			if (ay==12 || ay == 1 || ay == 2)
				mevsim = "KI�";
			else if (ay == 3 || ay == 4 || ay == 5)
				mevsim = "�LKBAHAR";
			else if (ay == 6 || ay == 7 || ay == 8)
				mevsim = "YAZ";
			else if (ay == 9 || ay == 10 || ay == 11)
				mevsim = "SONBAHAR";
			else
				mevsim = "Ge�ersiz bir ay se�tiniz";
			
			System.out.println("SONUC : " + mevsim);
			
			
			int yil = 1453;
			
			if((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0)))
				System.out.println(yil + "senesi art�k bir y�ld�r");
			else
				System.out.println(yil + "senesi art�k bir y�l degildir");
			

	}

}
