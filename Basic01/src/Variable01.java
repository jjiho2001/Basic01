
public class Variable01 {
	//������� = ��������
	int variable01 = 100;
	
	public static void main(String[] args) {
		
		//���� ���� ��Ģ
		//1. �ҹ���, _ , $�� �����Ѵ�.
		//2. ���� ��ҹ���, _, $, ���ڸ� ����Ѵ�.
		//3. �ռ����� ��� �� ��° �ܾ���� ù ���� ���ڴ� �빮�ڷ� �Ѵ�. ex) multicampusKorea
		//4. ������ ���̴� 256���ڱ��� ���ȴ�.
		
		byte kor = 80;
		int eng = 90;
		short math = 75;
		
		int total = kor + eng + math; // data type issue
		short total_casting = (short)(kor + eng + math); // data type change
		
		
		System.out.println(kor+10); // ���ڿ��� � ���������� ���ϵ��� ���ڿ��� �ȴ�.
		System.out.println(eng+20);
		System.out.println(math+30);
		System.out.print(total_casting + total);

	}

}
