package Practice7;

import java.util.Scanner;

import javax.swing.Spring;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui long nhap do dai chuoi ban muon:");
		int doDaiChuoi = scanner.nextInt();

		int[] chuoiSoNguyen = new int[doDaiChuoi];

		// Câu 1:
		nhapMang(chuoiSoNguyen);
		System.out.println("Thong tin mang so nguyen cua ban: ");
		xuatMang(chuoiSoNguyen);

		System.out.println();
		// Câu 2:
		System.out.println("Gia tri lon nhat:" + timGiaTriLonNhat(chuoiSoNguyen));

		System.out.println();
		// Câu 3:
		timGiaTriDuongNhoNhat(chuoiSoNguyen);

		System.out.println();
		// Câu 4:
		timViTriCoGiaTriNhoNhat(chuoiSoNguyen);
		
		System.out.println();
		// Câu 5:
		viTriGiaTriChanDauTien(chuoiSoNguyen);
		
		System.out.println();
		// Câu 6:
		timSoChanCuoiCung(chuoiSoNguyen);
		
		System.out.println();
		// Câu 7:
		soNguyenToLonNhat(chuoiSoNguyen);
		
		System.out.println();
		// Câu 8:
		System.out.println("Uoc chung lon nhat trong mang : " + uocChungLonNhatTrongMang(chuoiSoNguyen));
		
		System.out.println();
		// Câu 9:
		System.out.println("Boi so chung nho nhat trong mang : " + boiChungNhoNhatTrongMang(chuoiSoNguyen));
		
		System.out.println();
		// Câu 10:
		lietKeCacSoNguyen(chuoiSoNguyen, 7, 20);
	}

	// Câu 1:
	public static void nhapMang(int[] chuoiSoNguyen) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < chuoiSoNguyen.length; i++) {
			System.out.printf("SoNguyen[%d]= ", i);
			chuoiSoNguyen[i] = scanner.nextInt();
		}
	}

	public static void xuatMang(int[] chuoiSoNguyen) {
		for (int i = 0; i < chuoiSoNguyen.length; i++) {
			System.out.printf("SoNguyen[%d]= ", i);
			System.out.println(chuoiSoNguyen[i]);
		}
	}

	// Câu 2:
	public static int timGiaTriLonNhat(int[] chuoiSoNguyen) {
		int maxNumber = chuoiSoNguyen[0];
		for (int i = 1; i < chuoiSoNguyen.length; i++) {
			if (chuoiSoNguyen[i] > maxNumber) {
				maxNumber = chuoiSoNguyen[i];
			}
		}
		return maxNumber;
	}

	// Câu 3
	public static void timGiaTriDuongNhoNhat(int[] chuoiSoNguyen) {
		int result = chuoiSoNguyen[0];
		for (int i = 1; i < chuoiSoNguyen.length; i++) {
			if (chuoiSoNguyen[i] < result && chuoiSoNguyen[i] >= 0) {
				result = chuoiSoNguyen[i];
			}
		}
		if (result <= 0) {
			System.out.println("Mảng không có giá trị dương");
		} else {
			System.out.println("Giá trị dương nhỏ nhất là: " + result);
		}
	}

	// Câu 4
	public static void timViTriCoGiaTriNhoNhat(int[] chuoiSoNguyen) {
		int index = 0;
		int minNum = chuoiSoNguyen[0];
		for (int i = 1; i < chuoiSoNguyen.length; i++) {
			if (chuoiSoNguyen[i] < minNum) {
				minNum = chuoiSoNguyen[i];
				index = i;
			}
		}
		System.out.println("Vi tri co gia tri nho nhat: SoNguyen[" + index + "]");
	}

	// Câu 5
	public static void viTriGiaTriChanDauTien(int[] chuoiSoNguyen) {
		for (int i = 0; i < chuoiSoNguyen.length; i++) {
			if (chuoiSoNguyen[i] % 2 == 0) {
				System.out.println("Vi tri co gia tri chan la: " + i);
				return;
			}
		}
		System.out.println("Mang khong co gia tri chan");
	}

	// Câu 6
	public static void timSoChanCuoiCung(int[] chuoiSoNguyen) {
		for (int i = chuoiSoNguyen.length - 1; i >= 0; i--) {
			if (chuoiSoNguyen[i] % 2 == 0) {
				System.out.println("So chan cuoi cung trong mang 1 chieu : " + chuoiSoNguyen[i]);
				return;
			}
		}
		System.out.println("Mang khong co gia tri chan");
	}

	// Câu 7
	public static boolean kiemTraSoNguyenTo(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void soNguyenToLonNhat(int[] chuoiSoNguyen) {
		int result = chuoiSoNguyen[0];
		for (int i = 1; i < chuoiSoNguyen.length; i++) {
			if (kiemTraSoNguyenTo(chuoiSoNguyen[i]) && chuoiSoNguyen[i] > result) {
				result = chuoiSoNguyen[i];
			}
		}
		if (kiemTraSoNguyenTo(result)) {
			System.out.println("So nguyen to lon nhat trong mang : " + result);
		} else {
			System.out.println("Mang khong co so nguyen to");
		}

	}

	// Câu 8
	public static int gcd(int a, int b) {
		while (a % b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return b;
	}

	public static int uocChungLonNhatTrongMang(int[] chuoiSoNguyen) {
		int uocChung = 1;
		for (int i = 0; i < chuoiSoNguyen.length - 1; i++) {
			int uocChungLonNhat = gcd(chuoiSoNguyen[i], chuoiSoNguyen[i + 1]);
			if (uocChungLonNhat % uocChung == 0) {
				uocChung = uocChungLonNhat;
			} else {
				uocChung = 1;
			}
		}
		for (int i = 0; i < chuoiSoNguyen.length; i++) {
			if (chuoiSoNguyen[i] % uocChung != 0) {
				return 1;
			}
		}
		return uocChung;
	}

	// Câu 9
	public static int boiChungNhoNhatTrongMang(int[] chuoiSoNguyen) {
		int tichCacPhanTu = 1;
		for (int i = 0; i < chuoiSoNguyen.length; i++) {
			tichCacPhanTu *= chuoiSoNguyen[i];
		}
		return tichCacPhanTu / uocChungLonNhatTrongMang(chuoiSoNguyen);
	}

	// Câu 10
	public static void lietKeCacSoNguyen(int[] chuoiSoNguyen, int x, int y) {
		for (int i = 0; i < chuoiSoNguyen.length; i++) {
			if (chuoiSoNguyen[i] >= x && chuoiSoNguyen[i] <= y) {
				System.out.print(chuoiSoNguyen[i] + " ");
			}
		}
	}
}
