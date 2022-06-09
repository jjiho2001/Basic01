
public class Array05 {

	public static void main(String[] args) {
		//2차원 배열의 초기값 설정
		
		int score[][] = new int[][] { {90,50,60} , 
									  {50,50,60} , 
									  {90,80,70} ,
									  {80,90,50}};
		String subject[] = {"국어","영어","수학","총점","평균"};
		int total = 0; 
		int average = 0;
		
		// 확장된 반복문
		// 데이터타입 변수 : 배열, 컬렉션
		for (String t : subject) {
			System.out.print(t + "\t");
		}
		System.out.println();
		
		for (int row = 0; row < subject.length; row++) {
			System.out.print(subject[row] + "\t");
		}
		
		System.out.println();
		
		for (int row = 0; row < score.length; row++) {
			
			for(int col = 0; col < score[row].length; col++) {
				System.out.print(score[row][col] + "\t");
				total += score[row][col];
			}
			average = total / 3;
			System.out.print(total + "\t" + average);
			System.out.println();
		}
	}
	
}
