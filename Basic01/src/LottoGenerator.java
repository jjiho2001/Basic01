import java.util.Arrays;
import java.util.Scanner;

public class LottoGenerator {

	public static void main(String[] args) {
		
		Scanner game = new Scanner(System.in);
		
		for(;;) {
			System.out.print("게임수 : ");
			int game_num = game.nextInt();
			
			int[] Lotto_num = new int[6];
			
			for (int j = 0; j < game_num; j++) {
				int bonus_num = (int)(Math.random() * 45) + 1;
				
				for(int i = 0; i < Lotto_num.length; i++) {
					
					Lotto_num[i] = (int)(Math.random() * 45) + 1;
					if(Lotto_num[i] == bonus_num) i--;
					for(int k = 0; k < i; k++) {
						if(Lotto_num[i] == Lotto_num[k]) i--;
					}
				}
				

					Arrays.sort(Lotto_num);
					System.out.printf("%d게임 : %s, bonus : %d\n",j+1, Arrays.toString(Lotto_num), bonus_num);

			
			}
			
			System.out.print("계속하시겠습니까? (1.예, 2.아니요)");
			
			if(game.nextLine().equals("1")) {
				continue;
			} else if(game.nextLine().equals("2")) {
				break;
			}
		}
	}

}
