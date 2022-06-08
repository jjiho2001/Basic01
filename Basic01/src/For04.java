
public class For04 {

	public static void main(String[] args) {
		/*
		for(int i = 5 ; i >= 1 ; i--) {
			for(int j = 1; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 다른 방식
		String str = "";
		
		for(int i = 1 ; i <= 5 ; i++) {
			str += "*";
			
			System.out.printf("%5s\n", str);
		}
		
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= 5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
