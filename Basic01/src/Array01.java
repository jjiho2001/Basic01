
public class Array01 {

	public static void main(String[] args) {
		
		//배열 선언하기
		// 기본값 정수 : 0, 실수 : 0.0, 논리 : false, char : 아무값도 안들어있음, String : null
		
		int kor[] = new int[10]; // 메모리 할당은 객체 생성을 하면서 // 0 들어가있음
		int[] eng;
		
		eng = new int[5]; // 0 들어가있음
		
		int[] mat;
		
		String[] name = new String[10]; // null 들어가있음
		
		System.out.println(kor);
		// System.out.println(mat); 메모리 할당이 안되서 에러남
		System.out.println(name);
		
		kor[2] = 85;
		kor[6] = 90;
		
		name[1] = "홍길동";
		
		// 배열의 크기 : kor.length
		for(int idx = 0; idx < kor.length; idx++) {
			System.out.println(kor[idx]);
		}
		for(int idx = 0; idx < name.length; idx++) {
			System.out.println(name[idx]);
		}
	}
}
