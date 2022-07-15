import java.util.Scanner;

public class BaiTapMot {

	public BaiTapMot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số n =");
		float n = Float.parseFloat(scan.nextLine());
		System.out.println("Tổng là: \t" +tinhTong(n));

	}
	
	public static float tinhTong(float n) {
		if (n == 1) {
			return (float) (0.5);
		}
		return tinhTong(n - 1) + n / (n + 1);
	}

}
