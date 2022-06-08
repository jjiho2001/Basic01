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
		
		System.out.print("���� = ");
		age = info.nextInt();
		System.out.print("����(1.����, 2.����) = ");
		sex = info.nextInt();
		System.out.print("Ű = ");
		height = info.nextDouble();
		System.out.print("����ü�� = ");
		weight = info.nextDouble();
		
		switch(sex){
		case 1 :
			if(age <= 35 && age >= 1) {
				std_weight = (height - 100) * 0.9;
			} else if(age > 35) {
				std_weight = (height - 100) * 0.95;
			} else {
				System.out.println("���� �Է¿���");
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
				System.out.println("���� �Է¿���");
				info.close();
				return;
			}
			break;
		default :
			System.out.println("���� �Է¿���");
			return;
		}
		
		std_weight_index = weight / std_weight * 100;
	
		
			if(std_weight_index >= 126) {
				std_weight_cri = "����";
			} else if(std_weight_index >= 116) {
				std_weight_cri = "���� ����";
			} else if(std_weight_index >= 96) {
				std_weight_cri = "ǥ����";
			} else if(std_weight_index >= 86) {
				std_weight_cri = "���� ������";
			} else {
				std_weight_cri = "������";
			}
			
			System.out.printf("ǥ��ü�� = %.2f\n", std_weight);
			System.out.printf("����� ǥ��ü�������� %f���� %s�Դϴ�.", std_weight_index, std_weight_cri);
		info.close();	
	}

}
