import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner Score = new Scanner(System.in);
		
		int Korean, English, Math, Total;
		double Avg;
		String Grade;
		
		
		System.out.print("국어점수 : ");
		Korean = Score.nextInt();
		System.out.print("영어점수 : ");
		English = Score.nextInt();
		System.out.print("수학점수 : ");
		Math = Score.nextInt();
		
		Total = Korean + English + Math;
		Avg = (double)(Korean + English + Math) / 3;
		
		if(Korean < 0 || Korean > 100 || English < 0 || English > 100 || Math < 0 || Math > 100) {
			System.out.println("입력오류");
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
				System.out.println("총점 : " + Total);
				System.out.println("평균 : " + Avg);
				System.out.printf("평균 : %.2f\n", Avg);
				System.out.println("학점 : " + Grade);
			}
		Score.close();

	}

}
