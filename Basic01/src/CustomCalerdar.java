import java.util.Calendar;
import java.util.Scanner;

public class CustomCalerdar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calendar date = Calendar.getInstance();
		
		// �Է� ����, input���� ��� ���� ����. �޴� ���� ���� �Է� �� ��,���� �´� ���� �Է��ߴ��� Ȯ��
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
		
		// �޷� ��� ����, 1. getActualMaximum() �� ������ �� ����
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
		
		// �޷� ��� ����, 2. getActualMaximum() �� �̿��� ����
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
		
		
		System.out.println();
		System.out.println();
		
		// �޷� ��� ����, 3. �� �������� ���� ���ϱ�
		
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DAY_OF_MONTH, 1);
		
		int lastday = 31;
		
		switch(month + 1) {
			case 4: case 6: case 9: case 11:
				lastday = 30; 
				break;
			case 2:
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					lastday = 29;
				} else {
					lastday = 28;
				} 
				break;
			default : 
				break;
		}
		
		day_of_week = date.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("\t\t%d�� %d��\n", year, month+1);
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "��","��","ȭ","��","��","��","��");
		for (int i = day_of_week; i >= 2; i--) {
			System.out.print("\t");
		}
		for (int i = 1; i <= lastday; i++) {
				System.out.printf("%d\t", i );
				if(i % 7 == 8-day_of_week) {
					System.out.println();
			} 
		}
		
	}
}