
public class Array03Copy {

	public static void main(String[] args) {
		
		//�迭�� ����
		//�迭�� ���� �� ũ�⸦ ������ �� ����.
		
		int arr[] = {60, 80, 61, 85, 95, 34, 26, 94};
		
		int arr2[] = new int[20];
		
		System.arraycopy(arr, 1, arr2, 2, 4);
		
		for (int i = 0 ; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
