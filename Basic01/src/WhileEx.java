import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int money_num = 0;
		int money_div = 50000;
		int num = 0;
		for (;;) {
			System.out.print("±Ý¾× : ");
			int money = input.nextInt();
			if(money < 0) {
				System.out.println("µ·¿¡ À½¼ö°¡ ¾îµø½¿±î?");
			} else {
				while(money != 0) {
					money_num = money / money_div;
					if(money_num != 0) {
						System.out.printf("%d¿ø = %d%s\n", money_div, money_num, (money_div >= 1000)?"Àå":"°³");
					}
					
					money %= money_div;
					if(num % 2 == 0) {
						money_div /= 5;
					} else {
						money_div /= 2;
					}
					num++;
				}
			}
			money_num = 0;
			money_div = 50000;
			num = 0;
		}
	}
}
