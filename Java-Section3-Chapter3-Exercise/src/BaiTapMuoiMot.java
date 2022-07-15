import java.util.Scanner;

public class BaiTapMuoiMot {

	public BaiTapMuoiMot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số n =");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Số lượng số lẻ là: \t" + demSoLe(n));

	}

	public static int demSoLe(int n) {
		if (n == 0) {
			return 0;
		}
		if (n % 2 == 1) {
			return demSoLe(n / 10) + 1;
		}
		return demSoLe(n / 10);
	}

}
