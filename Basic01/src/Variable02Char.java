
public class Variable02Char {

	public static void main(String[] args) {
		
		//아스키코드
		
		char a = 'A';
		
		String grade = "";
		// char b = ''; 에러남
		
		//
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		a = (char)(a+1); // 가능
		System.out.println(a);
		
		int b = a + 1;
		System.out.println(b);
	}
}
