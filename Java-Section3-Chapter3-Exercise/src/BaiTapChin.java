import java.util.Scanner;

public class BaiTapChin {

	public BaiTapChin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số n =");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Tổng là:\t" + tinhTongCacChuSoDuong(n));

	}
	
	public static int tinhTongCacChuSoDuong(int n) {
		if (n == 0) {
			return 0;
		}
		return tinhTongCacChuSoDuong(n/10)+ n%10;
	}

}
