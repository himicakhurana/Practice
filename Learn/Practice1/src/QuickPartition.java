import java.util.*;

public class QuickPartition {

	static void partition(int[] ar) {
		int[] par1 = new int[ar.length];
		int j = 0, k = 0;
		int[] par2 = new int[ar.length];

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < ar[0]) {
				par1[j] = ar[i];
				j++;
			} else {
				par2[k] = ar[i];
				k++;

			}
		}

		printArray(par1, j);
		System.out.print(ar[0] + " ");
		printArray(par2, k);

		System.out.print("" + "\n");

	}

	private static void printArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
	}
}
