
public class Array05 {

	public static void main(String[] args) {
		//2���� �迭�� �ʱⰪ ����
		
		int score[][] = new int[][] { {90,50,60} , 
									  {50,50,60} , 
									  {90,80,70} ,
									  {80,90,50}};
		String subject[] = {"����","����","����","����","���"};
		int total = 0; 
		int average = 0;
		
		// Ȯ��� �ݺ���
		// ������Ÿ�� ���� : �迭, �÷���
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
