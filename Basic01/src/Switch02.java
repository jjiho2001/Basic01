import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner date = new Scanner(System.in);
		
		int month = date.nextInt();
		
		String season = "";
		
		switch(month) {
		case 11:
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
			season = "��";
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
			season = "����";
			break;
		}
		System.out.printf("%d�� %s", month, season);

	}

}
