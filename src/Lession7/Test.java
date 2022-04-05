package Lession7;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui long nhap do dai chuoi ban muon:");
		int doDaiChuoi = scanner.nextInt();
		
		int[] chuoiSoNguyen = new int[doDaiChuoi];
		
		
		for (int i = 0; i < chuoiSoNguyen.length; i++) {
			System.out.printf("arr[%d]: ", i);
			 chuoiSoNguyen[i] = scanner.nextInt();

		}
	}

}
