import java.util.Scanner;

public class IfElseifEx01 {

	public static void main(String[] args) {
		
		Scanner Score = new Scanner(System.in);
		
		int Korean, English, Math, Total;
		double Avg;
		String Grade;
		/*
		if (Score.hasNextInt()) {
			Korean = Score.nextInt();
			System.out.println("�������� : " + Korean);
			English = Score.nextInt();
			System.out.println("�������� : " + English);
			Math = Score.nextInt();
			System.out.println("�������� : " + Math);
		} else {
			System.out.println("�Է¿���");
		}*/
		
		System.out.print("�������� : ");
		Korean = Score.nextInt();
		System.out.print("�������� : ");
		English = Score.nextInt();
		System.out.print("�������� : ");
		Math = Score.nextInt();
		
		Total = Korean + English + Math;
		Avg = (double)(Korean + English + Math) / 3;
		
		if(Korean < 0 || Korean > 100 || English < 0 || English > 100 || Math < 0 || Math > 100) {
			System.out.println("�Է¿���");
			}
		else {
				if(Avg >= 90 && Avg <= 100) {
					Grade = "A";
				}else if(Avg >= 80 && Avg < 90) {
					Grade = "B";
				}else if(Avg >= 70 && Avg < 80) {
					Grade = "C";
				}else if(Avg >= 60 && Avg < 70) {
					Grade = "D";
				}else {
					Grade = "F";
				}
				System.out.println("���� : " + Total);
				System.out.println("��� : " + Avg);
				System.out.printf("��� : %.2f\n", Avg);
				System.out.println("���� : " + Grade);
			}
			// switch ����(byte, short, int), char, string ��, �Ǽ� �ȵ�.
		Score.close();
	}

}
