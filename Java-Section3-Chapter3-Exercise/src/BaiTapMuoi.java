import java.util.Scanner;

public class BaiTapMuoi {

	public BaiTapMuoi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số n =");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Tích các chữ số nguyên dương n là:\t" + tinhTichNguyenDuong(n));

	}
	
	public static int tinhTichNguyenDuong(int n) {
		if (n == 0) {
			return 1;
		}
		return tinhTichNguyenDuong(n/10)* (n%10);
	}

}
