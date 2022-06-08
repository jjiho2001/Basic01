import java.util.Scanner;

public class IfElseEx01 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.print("원하는 메누선택(1.사각현의 넓이, 2.원의 넓이) = ");
		int mode = data.nextInt();
		
		if (mode == 1 || mode == 2) {
			if (mode == 1) {
				int width = 0;
				int height = 0;
				
				System.out.print("밑변 = ");
				width = data.nextInt();
				System.out.print("높이 = ");
				height = data.nextInt();
				
				System.out.print("사각형의 넓이 = " + width * height);
			} else {
				int rad = 0;
				
				System.out.print("반지름 = ");
				rad = data.nextInt();
				
				System.out.print("원의 넓이 = " + rad * rad * Math.PI);
				
				// final 이 붙으면 변경 불가
				// PI : 상수화된 변수
				// math 도 class로 정의되어 있지만, PI를 쓸 때 static으로 선언되어 있기 때문에, 객체를 선언할 필요가 없음.
				// static은 static 메모리에서 관리. Garbage collector가 관리하지않음.
				// Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재하게 됩니다.ㅅ
			}
		}else {
			System.out.print("메뉴 선택이 잘못되었습니다");
		}
		
		data.close();
	}

}
