
public class Variable01 {
	//멤버변수 = 전역변수
	int variable01 = 100;
	
	public static void main(String[] args) {
		
		//변수 생성 규칙
		//1. 소문자, _ , $로 시작한다.
		//2. 영어 대소문자, _, $, 숫자를 허용한다.
		//3. 합성어일 경우 두 번째 단어부터 첫 번쨰 글자는 대문자로 한다. ex) multicampusKorea
		//4. 변수의 길이는 256글자까지 허용된다.
		
		byte kor = 80;
		int eng = 90;
		short math = 75;
		
		int total = kor + eng + math; // data type issue
		short total_casting = (short)(kor + eng + math); // data type change
		
		
		System.out.println(kor+10); // 문자열과 어떤 데이터형을 더하든지 문자열이 된다.
		System.out.println(eng+20);
		System.out.println(math+30);
		System.out.print(total_casting + total);

	}

}
