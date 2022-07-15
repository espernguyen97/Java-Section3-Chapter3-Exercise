import java.util.Scanner;

public class BaiTapTam {

	public BaiTapTam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số n =");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Số chữ số của n là: \t" + demSoLuongChuSo(n));

	}public static int demSoLuongChuSo(int n) {
		if (n == 0) {
			return 0;
		}
		return demSoLuongChuSo(n/10)+1;
	}
	
	

}
