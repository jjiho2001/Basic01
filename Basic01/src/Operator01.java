
public class Operator01 {

	public static void main(String[] args) {
		// ��� ������ %(������)
		int num01 = 10;
		int num02 = 3;
		
		int result01 = num01 / num02;
		double result02 = num01 / (double)num02;
		double result03 = (double)num01 / num02;
		
		System.out.println(result01);
		System.out.println(result02);
		System.out.println(result03);
		
		result01++;
		System.out.println(result01++);
		System.out.println(++result01);
		
		int num03 = 5;
		int result04 = num03++ + 100;
		int result05 = ++num03 + 100;
		
		System.out.println(result04);
		System.out.println(result05);
		
		int num04 = 3;
		int num05 = 5/7 + 10%2 - 3 + num04++*2;
		System.out.println(num05);
		
		// and�� or���� �켱 ������ ����, 1 < variable < 100 -> error��
		
		int num06 = 100;
		boolean data = num06 > 1 && num06 < 10; 
		System.out.println(data);
		
		// ���� ������ = (���ǽ�) ? true : false ;
		int num07 = 100;
		String data01 = (num07%2 == 1) ? "odd" : "even";
		System.out.println(data01);
		
		int num08 = -3;
		double num09 = 3.0;
		
		boolean data02 = num08 == num09;
		System.out.println(data02);
		
		// ���� ������ ����
		String data03 = (num08 > 0) ? "positive" : (num08 < 0) ? "negative" : "zero" ;
		System.out.println("num03 = " + data03);
	}

}
