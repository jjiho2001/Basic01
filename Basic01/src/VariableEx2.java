import java.util.Scanner;

public class VariableEx2 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		int input = data.nextInt();
		
		data.close();
		
		int result = (input >= 1 && input <= 100) ? input * 100 : 0;
		
		
		System.out.println(result);
	}

}
