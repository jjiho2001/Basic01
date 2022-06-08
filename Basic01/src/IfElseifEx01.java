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
			System.out.println("국어점수 : " + Korean);
			English = Score.nextInt();
			System.out.println("국어점수 : " + English);
			Math = Score.nextInt();
			System.out.println("국어점수 : " + Math);
		} else {
			System.out.println("입력오류");
		}*/
		
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
				System.out.println("총점 : " + Total);
				System.out.println("평균 : " + Avg);
				System.out.printf("평균 : %.2f\n", Avg);
				System.out.println("학점 : " + Grade);
			}
			// switch 정수(byte, short, int), char, string 됨, 실수 안됨.
		Score.close();
	}

}
