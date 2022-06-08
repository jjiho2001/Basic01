import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		//switch (변수 or 상수 or 수식) {}
		//byte, srhot, int, char, string
		
		Scanner input = new Scanner(System.in);
		
		int input_con = 0;
		input_con = input.nextInt();
		
		switch(input_con){
			case 1 :
				System.out.printf("%d는 %s\n", input_con, "해바라기");
				break;
			case 2 :
				System.out.printf("%d는 %s\n", input_con, "코스모스");
				break;
			case 3 :
				System.out.printf("%d는 %s\n", input_con, "장미");
				break;
			default :
				System.out.printf("%d는 %s\n", input_con, "그런건 없어");
		}

	}

}
