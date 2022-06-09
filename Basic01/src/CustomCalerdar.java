import java.util.Calendar;
import java.util.Scanner;

public class CustomCalerdar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calendar date = Calendar.getInstance();
		
		// 입력 구간, input으로 년과 월을 받음. 받는 순간 정수 입력 및 년,월에 맞는 값을 입력했는지 확인
		int year = 0;
		int month = 0;
		
		System.out.print("년 : ");
		if(input.hasNextInt()) {
			year = input.nextInt();
			if(year < 0) {
				System.out.println("양의 정수를 입력하세요.");
				return;
			}
		} else {
			System.out.println("정수를 입력하세요.");
			return;
		}
		
		System.out.print("월 : ");
		if(input.hasNextInt()) {
			month = input.nextInt() - 1;
			if(month < 0 || month >= 12) {
				System.out.println("월에 맞는 값을 입력하세요");
				return;
			}
		} else {
			System.out.println("정수를 입력하세요.");
			return;
		}
		
		// 달력 출력 구간, 1. getActualMaximum() 을 몰랐을 때 만듬
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DAY_OF_MONTH, 1);
		
		int day_of_week = date.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("\t\t%d년 %d월\n", year, month+1);
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "일","월","화","수","목","금","토");
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
		
		// 달력 출력 구간, 2. getActualMaximum() 을 이용해 만듬
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DAY_OF_MONTH, 1);
		
		day_of_week = date.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("\t\t%d년 %d월\n", year, month+1);
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "일","월","화","수","목","금","토");
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
		
		// 달력 출력 구간, 3. 월 마지막날 직접 구하기
		
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
		
		System.out.printf("\t\t%d년 %d월\n", year, month+1);
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "일","월","화","수","목","금","토");
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