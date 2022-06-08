import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner Score = new Scanner(System.in);
		
		int Korean, English, Math, Total;
		double Avg;
		String Grade;
		
		
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
			int Avg_int = (int)Avg;
			
				switch(Avg_int / 10) {
				case 10 :
				case 9 :
					Grade = "A";
					break;
				case 8 :
					Grade = "B";
					break;
				case 7 : 
					Grade = "C";
					break;
				case 6 : 
					Grade = "D";
					break;
				default :
					Grade = "F";
					break;	
				}
				System.out.println("���� : " + Total);
				System.out.println("��� : " + Avg);
				System.out.printf("��� : %.2f\n", Avg);
				System.out.println("���� : " + Grade);
			}
		Score.close();

	}

}
