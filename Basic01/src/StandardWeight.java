import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		
		Scanner info = new Scanner(System.in);
		
		int age, sex;
		double height = 0; 
		double weight = 0;
		double std_weight_index = 0;
		double std_weight = 0;
		String std_weight_cri = "";
		
		System.out.print("나이 = ");
		age = info.nextInt();
		System.out.print("성별(1.남성, 2.여성) = ");
		sex = info.nextInt();
		System.out.print("키 = ");
		height = info.nextDouble();
		System.out.print("현재체중 = ");
		weight = info.nextDouble();
		
		switch(sex){
		case 1 :
			if(age <= 35 && age >= 1) {
				std_weight = (height - 100) * 0.9;
			} else if(age > 35) {
				std_weight = (height - 100) * 0.95;
			} else {
				System.out.println("나이 입력오류");
				info.close();
				return;
			}
			break;
		case 2 :
			if(age <= 35 && age >= 1) {
				std_weight = (height - 100) * 0.85;
			} else if(age > 35) {
				std_weight = (height - 100) * 0.9;
			} else {
				System.out.println("나이 입력오류");
				info.close();
				return;
			}
			break;
		default :
			System.out.println("성별 입력오류");
			return;
		}
		
		std_weight_index = weight / std_weight * 100;
	
		
			if(std_weight_index >= 126) {
				std_weight_cri = "비만형";
			} else if(std_weight_index >= 116) {
				std_weight_cri = "조금 비만형";
			} else if(std_weight_index >= 96) {
				std_weight_cri = "표준형";
			} else if(std_weight_index >= 86) {
				std_weight_cri = "조금 마른형";
			} else {
				std_weight_cri = "마른형";
			}
			
			System.out.printf("표준체중 = %.2f\n", std_weight);
			System.out.printf("당신의 표중체중지수는 %f으로 %s입니다.", std_weight_index, std_weight_cri);
		info.close();	
	}

}
