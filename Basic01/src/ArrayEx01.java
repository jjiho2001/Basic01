import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		String title[] = {"����", "����", "����", "����"};
		int score[] = new int[title.length];
		
		for(int i = 0; i < title.length; i++) {
			System.out.printf("%s���� : ", title[i]);
			score[i] = data.nextInt();
		}
		
		int total = 0;
		for(int i = 0; i < title.length ; i++) {
			total += score[i];
		}
		
		int average = total / title.length;
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);
	}
}
