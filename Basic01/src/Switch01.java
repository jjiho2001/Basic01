import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		//switch (���� or ��� or ����) {}
		//byte, srhot, int, char, string
		
		Scanner input = new Scanner(System.in);
		
		int input_con = 0;
		input_con = input.nextInt();
		
		switch(input_con){
			case 1 :
				System.out.printf("%d�� %s\n", input_con, "�عٶ��");
				break;
			case 2 :
				System.out.printf("%d�� %s\n", input_con, "�ڽ���");
				break;
			case 3 :
				System.out.printf("%d�� %s\n", input_con, "���");
				break;
			default :
				System.out.printf("%d�� %s\n", input_con, "�׷��� ����");
		}

	}

}
