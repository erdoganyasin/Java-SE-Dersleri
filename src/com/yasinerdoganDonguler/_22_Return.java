package com.yasinerdoganDonguler;

public class _22_Return {
	
	public static void main(String[] args) {
		
		boolean durum = true;
		
		for(int i = 0; i<2; i++) {
			
			System.out.println("return öncesi");
			if(durum)
				return;
			System.out.println("return sonrasý");
		}

}
}