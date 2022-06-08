import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		
		System.out.println(13.1 % 10);
		
		Scanner data = new Scanner(System.in);

		System.out.print("금액입력 = ");
		int int_money = data.nextInt();
		System.out.print("Double_money = ");
		double double_money = data.nextDouble();
		System.out.print("Double_money2 = ");
		double double_money2 = data.nextDouble();
		
		if (int_money >= 10000) {
			int_money = int_money / 10 * 10;
			System.out.println(int_money);
			
			double_money = double_money - double_money % 10;
			System.out.println(double_money);
			
			double_money2 = double_money2 - (double_money2 / 100 % 10 * 100);
			System.out.println(double_money2);
		}
		data.close();
	}

}
