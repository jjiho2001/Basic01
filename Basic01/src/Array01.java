
public class Array01 {

	public static void main(String[] args) {
		
		//�迭 �����ϱ�
		// �⺻�� ���� : 0, �Ǽ� : 0.0, �� : false, char : �ƹ����� �ȵ������, String : null
		
		int kor[] = new int[10]; // �޸� �Ҵ��� ��ü ������ �ϸ鼭 // 0 ������
		int[] eng;
		
		eng = new int[5]; // 0 ������
		
		int[] mat;
		
		String[] name = new String[10]; // null ������
		
		System.out.println(kor);
		// System.out.println(mat); �޸� �Ҵ��� �ȵǼ� ������
		System.out.println(name);
		
		kor[2] = 85;
		kor[6] = 90;
		
		name[1] = "ȫ�浿";
		
		// �迭�� ũ�� : kor.length
		for(int idx = 0; idx < kor.length; idx++) {
			System.out.println(kor[idx]);
		}
		for(int idx = 0; idx < name.length; idx++) {
			System.out.println(name[idx]);
		}
	}
}
