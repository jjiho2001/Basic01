import java.util.Scanner;

public class IfElseEx01 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.print("���ϴ� �޴�����(1.�簢���� ����, 2.���� ����) = ");
		int mode = data.nextInt();
		
		if (mode == 1 || mode == 2) {
			if (mode == 1) {
				int width = 0;
				int height = 0;
				
				System.out.print("�غ� = ");
				width = data.nextInt();
				System.out.print("���� = ");
				height = data.nextInt();
				
				System.out.print("�簢���� ���� = " + width * height);
			} else {
				int rad = 0;
				
				System.out.print("������ = ");
				rad = data.nextInt();
				
				System.out.print("���� ���� = " + rad * rad * Math.PI);
				
				// final �� ������ ���� �Ұ�
				// PI : ���ȭ�� ����
				// math �� class�� ���ǵǾ� ������, PI�� �� �� static���� ����Ǿ� �ֱ� ������, ��ü�� ������ �ʿ䰡 ����.
				// static�� static �޸𸮿��� ����. Garbage collector�� ������������.
				// Static������ �ִ� ������� ���α׷��� ����ñ��� �޸𸮰� �Ҵ�� ä�� �����ϰ� �˴ϴ�.��
			}
		}else {
			System.out.print("�޴� ������ �߸��Ǿ����ϴ�");
		}
		
		data.close();
	}

}
