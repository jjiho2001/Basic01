
public class Array04 {

	public static void main(String[] args) {
		
		// 2차원 배열 선언
		
		int data[][] = new int[4][3];
		
		data[2][1] = 60;
		data[1][0] = 80;
		
		//data.length : 2차원배열의 행의 수
		for(int i = 0 ; i < data.length; i++) {
			//data[i].length : i행의 칸수
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
