import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum_cont = 0;
		int sum_odd = 0;
		int sum_even = 0;
		int num = 0;
		// 문자 입력 시 loop에 빠짐 수정 필요
		/*
		for(int i = 0; i <= 5; i++) {
			System.out.print("임의의 정수 = ");
			
			if(input.hasNextInt()){
				num = input.nextInt();
				if(num <= 0) {
					System.out.println("양의 정수를 입력하세요.");
					continue;
				}
				break;
			} else {
				System.out.print("정수를 입력하세요.\n");
				continue;
			}
		}
		*/
		
		for(int i = 0; i < 5; i++) {
			System.out.print("임의의 정수 = ");
			num = input.nextInt();
			if (i == 4 && num <= 0) {
				System.out.println("제대로 할 생각 없죠? 때려치십쇼~");
				return;
			}
			if(num <= 0) {
				System.out.println("양의 정수를 입력하세요.");
			} else {
				break;
			}
		}
		
		input.close();
		
		for (int i = 1 ; i <= num ; i++) {
			sum_cont = sum_cont + i;
			if(i % 2 == 0) {
				sum_even = sum_even + i;
			} else {
				sum_odd = sum_odd + i;
			}
		}
		
		System.out.printf("1~%d까지의 합은 %d\n", num, sum_cont);
		System.out.printf("1~%d까지의 홀수의 합은 %d\n", num, sum_odd);
		System.out.printf("1~%d까지의 짝수의 합은 %d\n", num, sum_even);
		
	}

}

/*
임의의 정수 = 100

1~100까지의 합은 ~~
1~100까지의 홀수 합 ~
1~100까지의 짝수 합 ~
*/