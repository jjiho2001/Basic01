import java.util.Scanner;

public class VariableEx3 {

	public static void main(String[] args) {
		// 입력이 1,2면 가로, 세로 물어보고 계산, 1,2가 아니면 error
		Scanner data = new Scanner(System.in);
		
		System.out.print("메뉴(1.사각형의 넓이, 2. 사각형의 둘레)? : ");
		int mode = data.nextInt();
		
		boolean mode_check = (mode == 1 || mode == 2) ? true : false;
		
		int width = 0;
		int height = 0;
		
		System.out.print( (mode_check == true) ? "가로(밑변) : " : "");
		width = (mode_check == true) ? data.nextInt() : 99999 ;
		
		System.out.print( (mode_check == true) ? "세로(높이) : " : "");
		height = (mode_check == true) ? data.nextInt() : 99999;
		
		int result_t = (mode == 1) ? width * height : ((mode == 2) ? 2 * (width + height) : 99999) ;
		
		String mode_answer = (mode == 1) ? "넓이" : "둘레";
		
		System.out.println((result_t != 99999) ? 
				"사각형의 " + mode_answer + " : " + result_t : "error");
	
		data.close();
	}

}
