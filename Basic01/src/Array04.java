
public class Array04 {

	public static void main(String[] args) {
		
		// 2���� �迭 ����
		
		int data[][] = new int[4][3];
		
		data[2][1] = 60;
		data[1][0] = 80;
		
		//data.length : 2�����迭�� ���� ��
		for(int i = 0 ; i < data.length; i++) {
			//data[i].length : i���� ĭ��
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
