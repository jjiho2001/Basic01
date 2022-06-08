import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		
		Scanner dan = new Scanner(System.in);
		int dan_input = 0;
		
		System.out.print("단 = ");
		if(dan.hasNextInt()) {
			dan_input = dan.nextInt();
		} else {
			System.out.print("error");
			return;
		}
		dan.close();
		
		if(dan_input >= 2 && dan_input <= 9) {
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d x %d = %2d\n", dan_input, i, dan_input * i);
			}
		} else {
			System.out.println("단을 잘못입력하였다");
		}
		
	}
}
