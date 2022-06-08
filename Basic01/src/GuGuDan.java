
public class GuGuDan {

	public static void main(String[] args) {
		
		String line = "==";
		
		System.out.printf("\t%s\n","구구단");
		for(int a = 0 ; a <= 2; a++) {
			for(int i = 1 ; i <= 9 ; i++) {
				if(i == 1) {
					for(int k = 1; k <= 3 ; k++) {
						System.out.printf("%s%d단%s\t", line, k+3*a, line);
					}
				} else {
					for(int j = 1 ; j <= 3 ; j++) {
						System.out.printf("%dx%d=%-3d\t", j+3*a, i, i*(j+3*a));
					}
				}
				System.out.println();
			}
		}
		/*
		for(int i = 1 ; i <= 9 ; i++) {
			if(i == 1) {
				for(int k = 1 ; k <= 3; k++) {
					System.out.printf("%s%d단%s", line, k+3, line);
				}
			} else {
				for(int j = 1 ; j <= 3 ; j++) {
					System.out.printf("%dx%d=%-3d", j+3, i, i*(j+3));
				}
			}
			System.out.println();
		}
		for(int i = 1 ; i <= 9 ; i++) {
			if(i == 1) {
				for(int k = 1 ; k <= 3; k++) {
					System.out.printf("%s%d단%s", line, k+6, line);
				}
			} else {
				for(int j = 1 ; j <= 3 ; j++) {
					System.out.printf("%dx%d=%-3d", j+6, i, i*(j+6));
				}
			}
			System.out.println();
		}
		*/
		
		for (int i = 1 ; i < 10 ; i+=3) {
			System.out.println("\t구구단");
			for(int j = i; j < i + 3 ; j++) {
				System.out.print("="+j+"단=\t");
			}
			System.out.println();
			for(int x = 2; x <= 9; x++) {
				for(int y=i; y<i+3; y++) {
					System.out.print(y+"*"+x+"="+(y*x)+"\t");
				}
				System.out.println();
			}
		}
	}
}
