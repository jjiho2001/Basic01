import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.print("정수입력 = ");
		int number = data.nextInt();
		
		if (number >= 1 && number <= 100) {
			System.out.print(number);
		} else {
			System.out.println((number < 0) ? -number : number);
			System.out.print(Math.abs(number));
		}
		
		data.close();
	}

}
