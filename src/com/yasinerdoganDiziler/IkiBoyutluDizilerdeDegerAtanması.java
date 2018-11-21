package com.yasinerdoganDiziler;

public class IkiBoyutluDizilerdeDegerAtanmasý {

	public static void main(String[] args) {
		double sayi[][]= {
				{1299.0, 1071.0, 1923.0, 1453.0},
				{5.71, 6.22,6.323,  10.71},
				{1,2,3.0,4.7},
				{2+4.0, 6*2, 5-.2, 1453-2016}
		};
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print( sayi[i][j] + "  ");

			}
			System.out.println();
		}

	}

}

