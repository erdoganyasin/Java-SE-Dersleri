package com.yasinerdoganKontrol�fadeleri;

public class _04_IfElse {

	public static void main(String[] args) {
		
		int sayi = 90;
		char harf = '-';
		
		if(sayi >=90) {
			harf = 'A';
		}else if (sayi >=80) {
			harf = 'B';
		}else if (sayi >=70) {
			harf = 'C';
		}else if(sayi >=60) {
			harf = 'D';
		}
		
		System.out.println("SONU�  =" + harf );
		
		
		
		
		
		
		int sayi1 = 571;
		int sayi2 = 632;
		
		if(sayi > sayi2) {
			System.out.println(sayi1 + " b�y�kt�r "  + sayi2 + " k���kt�r ");
		}
		else if(sayi1 < sayi2) {
			System.out.println(sayi1 + "k���kt�r " + sayi2 + " b�y�kt�r ");
		}
		else {
			System.out.println(sayi1 + " e�ittir " + sayi2);
		}

	}

}
