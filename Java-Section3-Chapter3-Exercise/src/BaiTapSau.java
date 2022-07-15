import java.util.Scanner;

public class BaiTapSau {

	public BaiTapSau() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số x =");
		float x = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập số mũ n =");
		float n = Float.parseFloat(scan.nextLine());
		System.out.println("Tổng là:\t" + tinhTong(x, n));
	}
	
	public static float luyThua (float x, float n) {
		if( n == 0) {
			return 1;
		}
		return luyThua(x, n-1)*x;
	}
	
	public static float tinhTong (float x, float n) {
		if (n == 1) {
			return x;
		}
		return tinhTong(x, n-1) + luyThua(x, n-1)*x;
	}

}
