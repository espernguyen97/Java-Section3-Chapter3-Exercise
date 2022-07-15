import java.util.Scanner;

public class BaiTapMuoiBa {

	public BaiTapMuoiBa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số n =");
		int n = Integer.parseInt(scan.nextLine());
		int Max = n%10;
		System.out.println("Chữ số lớn nhất của n là: \t" + timChuSoLonNhat(Max, n));

	}public static int timChuSoLonNhat(int Max, int n) {
		if (n%10 == 0) {
			return Max;
		}

		Max = (Max>n%10)? Max: n%10;
		return timChuSoLonNhat(Max, n/10);
	}
	

}
