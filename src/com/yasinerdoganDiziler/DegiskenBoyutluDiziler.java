package com.yasinerdoganDiziler;

public class DegiskenBoyutluDiziler {

	public static void main(String[] args) {
		int say��kiBoyutlu[][] = new int[3][]; // i j

		say��kiBoyutlu[0] = new int[1];
		say��kiBoyutlu[1] = new int[2];
		say��kiBoyutlu[2] = new int[3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				say��kiBoyutlu[i][j] = i + j * 2;

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(say��kiBoyutlu[i][j] + " ");

			}
			System.out.println();
		}

	}

}
