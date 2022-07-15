import java.util.Scanner;

public class BaiTapMuoiHai {

	public BaiTapMuoiHai() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số n =");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Chữ số đầu tiên của n là: \t" + chuSoDauTien(n));

	}
	
	public static int chuSoDauTien(int n) {
		if (n/10 == 0) {
			return n;
		}

		return chuSoDauTien(n/10);
	}
	
	

}
