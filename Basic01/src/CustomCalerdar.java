import java.util.Calendar;
import java.util.Scanner;

public class CustomCalerdar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calendar date = Calendar.getInstance();
		
		// input���� ��� ���� ����. �޴� ���� ���� �Է� �� ��,���� �´� ���� �Է��ߴ��� Ȯ��
		int year = 0;
		int month = 0;
		
		System.out.print("�� : ");
		if(input.hasNextInt()) {
			year = input.nextInt();
			if(year < 0) {
				System.out.println("���� ������ �Է��ϼ���.");
				return;
			}
		} else {
			System.out.println("������ �Է��ϼ���.");
			return;
		}
		System.out.print("�� : ");
		if(input.hasNextInt()) {
			month = input.nextInt() - 1;
			if(month < 0 || month >= 12) {
				System.out.println("���� �´� ���� �Է��ϼ���");
				return;
			}
		} else {
			System.out.println("������ �Է��ϼ���.");
			return;
		}
		
		// �޷� ��� ����, getActualMaximum() �� ������ �� ����
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DAY_OF_MONTH, 1);
		
		int day_of_week = date.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("\t\t%d�� %d��\n", year, month+1);
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "��","��","ȭ","��","��","��","��");
		for (int i = day_of_week; i >= 2; i--) {
			System.out.print("\t");
		}
		
		for (int i = 1;  ; i++) {
			date.set(Calendar.DAY_OF_MONTH, i);
			if(month == date.get(Calendar.MONTH)) {
				System.out.printf("%d\t", i );
				if(date.get(Calendar.DAY_OF_WEEK) == 7) {
					System.out.println();
				}
			} else {
				break;
			}
		}
		
		System.out.println();
		System.out.println();
		
		// �޷� ��� ����, getActualMaximum() �� �̿��� ����
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DAY_OF_MONTH, 1);
		
		day_of_week = date.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("\t\t%d�� %d��\n", year, month+1);
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "��","��","ȭ","��","��","��","��");
		for (int i = day_of_week; i >= 2; i--) {
			System.out.print("\t");
		}
		for (int i = 1; i <= date.getActualMaximum(Calendar.DATE); i++) {
				System.out.printf("%d\t", i );
				if(i % 7 == 8-day_of_week) {
					System.out.println();
			} 
		}
	}
}