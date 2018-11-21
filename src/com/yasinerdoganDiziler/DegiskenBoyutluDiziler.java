package com.yasinerdoganDiziler;

public class DegiskenBoyutluDiziler {

	public static void main(String[] args) {
		int sayıİkiBoyutlu[][] = new int[3][]; // i j

		sayıİkiBoyutlu[0] = new int[1];
		sayıİkiBoyutlu[1] = new int[2];
		sayıİkiBoyutlu[2] = new int[3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				sayıİkiBoyutlu[i][j] = i + j * 2;

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(sayıİkiBoyutlu[i][j] + " ");

			}
			System.out.println();
		}

	}

}
