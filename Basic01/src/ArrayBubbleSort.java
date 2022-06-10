
public class ArrayBubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {56,85,61,15,4,78,95,42};
		int temp = 0;
		int num = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		for (int i = 0 ; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				num++;
			}
		}
		
		System.out.println();
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "\t");
		} 
		System.out.println("\n½ÇÇàÈ½¼ö : " + num);
	}
}
