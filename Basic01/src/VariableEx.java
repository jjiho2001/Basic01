import java.util.*;

public class VariableEx {

	public static void main(String[] args) {
		
		// ctrl + space : import ����Ű
		
		Scanner data = new Scanner(System.in);
		
		int box = 0; 
		int box_size = 10;
		int apple = 3109;
		
		System.out.print("���� : ");
		box = data.nextInt();
		
		System.out.print("������ : ");
		box_size = data.nextInt();
		
		System.out.print("��� : ");
		apple = data.nextInt();
		
		data.close();
		
		box = (apple % box_size == 0) ? apple / box_size : apple / box_size + 1;
		
		System.out.println("box = " + box);
		
		
		// �ٸ� �˰���
		
		int box02 = 0;
		
		box02 = apple/box_size + ((apple % box_size > 0) ? 1 : 0) ;
		
		System.out.println("box02 = " + box02);
	}

}
