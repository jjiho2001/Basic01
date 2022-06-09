import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		String title[] = {"국어", "영어", "수학", "대충"};
		int score[] = new int[title.length];
		
		for(int i = 0; i < title.length; i++) {
			System.out.printf("%s점수 : ", title[i]);
			score[i] = data.nextInt();
		}
		
		int total = 0;
		for(int i = 0; i < title.length ; i++) {
			total += score[i];
		}
		
		int average = total / title.length;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
	}
}
