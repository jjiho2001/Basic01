import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		int sum = 0;
		int i;
		
		for (i = 0 ; sum < num; i++) {
			sum = sum + i;
		}
		
		System.out.printf("1~%d까지의 합은 %d", i, sum);
	}
}
