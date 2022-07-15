import java.util.Scanner;

public class BaiTapBay {

	public BaiTapBay() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào n =");
		float n = Float.parseFloat(scan.nextLine());
		System.out.println("Kết quả là:\t" + tinhTongPhanChia(n));
	}
	
	public static float tinhTong(float n) {
		if (n == 1) {
			return n;
		}
		return tinhTong(n - 1) + n;
	}

	public static float tinhTongPhanChia(float n) {
		if (n == 1) {
			return 1;
		}
		return tinhTongPhanChia(n - 1) + 1 / (tinhTong(n - 1) + n);
	
	}
}
