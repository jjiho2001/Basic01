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
			season = "겨울";
			break;
		case 3:
		case 4:
			season = "봄";
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
			season = "가을";
			break;
		}
		System.out.printf("%d는 %s", month, season);

	}

}
