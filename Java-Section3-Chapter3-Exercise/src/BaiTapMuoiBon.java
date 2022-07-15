import java.util.Scanner;

public class BaiTapMuoiBon {

	public BaiTapMuoiBon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số n=");
		int n = Integer.parseInt(scan.nextLine());
		
		System.out.println("Tổng các chữ số chẵn của n là: \t" + tinhTongSoChan(n));

	}
	
	
	public static int tinhTongSoChan( int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n%2 == 0) {
			return tinhTongSoChan(n/10) + (n%10);
		}

		
		return tinhTongSoChan(n/10);
	}

}
