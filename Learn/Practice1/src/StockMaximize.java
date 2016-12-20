import java.util.Arrays;
import java.util.Scanner;

public class StockMaximize {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        		int x = in.nextInt();
		for (int p = 0; p < x; p++) {

		int s = in.nextInt();
        
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		 int currMax = Integer.MIN_VALUE;
         String sw="dd";
  Arrays.sort(sw.toCharArray());
         
         long profit=0;
		for (int j = s - 1; j >= 0; j--) {
               if (currMax < ar[j]) {
                      currMax = ar[j];
               }
               profit += (currMax - ar[j]);
         }
         System.out.println(profit);
		

        }}
}
