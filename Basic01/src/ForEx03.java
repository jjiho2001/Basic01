import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum_cont = 0;
		int sum_odd = 0;
		int sum_even = 0;
		int num = 0;
		// ���� �Է� �� loop�� ���� ���� �ʿ�
		/*
		for(int i = 0; i <= 5; i++) {
			System.out.print("������ ���� = ");
			
			if(input.hasNextInt()){
				num = input.nextInt();
				if(num <= 0) {
					System.out.println("���� ������ �Է��ϼ���.");
					continue;
				}
				break;
			} else {
				System.out.print("������ �Է��ϼ���.\n");
				continue;
			}
		}
		*/
		
		for(int i = 0; i < 5; i++) {
			System.out.print("������ ���� = ");
			num = input.nextInt();
			if (i == 4 && num <= 0) {
				System.out.println("����� �� ���� ����? ����ġ�ʼ�~");
				return;
			}
			if(num <= 0) {
				System.out.println("���� ������ �Է��ϼ���.");
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
		
		System.out.printf("1~%d������ ���� %d\n", num, sum_cont);
		System.out.printf("1~%d������ Ȧ���� ���� %d\n", num, sum_odd);
		System.out.printf("1~%d������ ¦���� ���� %d\n", num, sum_even);
		
	}

}

/*
������ ���� = 100

1~100������ ���� ~~
1~100������ Ȧ�� �� ~
1~100������ ¦�� �� ~
*/