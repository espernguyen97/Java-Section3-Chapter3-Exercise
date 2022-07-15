import java.util.Scanner;

public class BaiTapHai {

	public BaiTapHai() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số n =");
		float n = Float.parseFloat(scan.nextLine());
		System.out.println("Kết quả:\t" + doubleFunction(n));

	}
	
	public static double doubleFunction (double n) {
		if (n == 1) {
			return 1;		
		}
		return Math.sqrt(n + doubleFunction(n-1));
	}

}
