import java.util.Scanner;

public class VariableEx3 {

	public static void main(String[] args) {
		// �Է��� 1,2�� ����, ���� ����� ���, 1,2�� �ƴϸ� error
		Scanner data = new Scanner(System.in);
		
		System.out.print("�޴�(1.�簢���� ����, 2. �簢���� �ѷ�)? : ");
		int mode = data.nextInt();
		
		boolean mode_check = (mode == 1 || mode == 2) ? true : false;
		
		int width = 0;
		int height = 0;
		
		System.out.print( (mode_check == true) ? "����(�غ�) : " : "");
		width = (mode_check == true) ? data.nextInt() : 99999 ;
		
		System.out.print( (mode_check == true) ? "����(����) : " : "");
		height = (mode_check == true) ? data.nextInt() : 99999;
		
		int result_t = (mode == 1) ? width * height : ((mode == 2) ? 2 * (width + height) : 99999) ;
		
		String mode_answer = (mode == 1) ? "����" : "�ѷ�";
		
		System.out.println((result_t != 99999) ? 
				"�簢���� " + mode_answer + " : " + result_t : "error");
	
		data.close();
	}

}
