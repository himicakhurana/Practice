import java.util.*;

public class QuickSort2 {

	public static void quickSort(int[] array, int start, int end, StringBuffer str) {
		printArray(array);
	//	System.out.println(end);
	//	System.out.println(start);
		if (end - start < 2) {
			return;
		}
		if (start < end) {
			int part1 = partition(array, start, end);
		//	System.out.println(part1);
			quickSort(array, start, part1,str);
			quickSort(array, part1 + 1, end,str);
			print(array,start,end,str);

		}
	}

	public static void print(int[] ar, int start, int end, StringBuffer str) {
		while (start < end) {
			str.append(ar[start++] + " ");
		}
		str.append("\n");
	}

	static int partition(int[] ar, int start, int end) {
		int len = end - start;
		int[] par1 = new int[len];
		int j = 0, k = 0;
		int[] par2 = new int[len];

		for (int i = start + 1; i < end; i++) {
			if (ar[i] < ar[start]) {
				par1[j] = ar[i];
				j++;
			} else {
				par2[k] = ar[i];
				k++;

			}

		}

		par1[j] = ar[start];
		int x = start;
		for (int p = j + 1; x < k; p++) {
			par1[p] = par2[x];
			x++;
		}
		
		return j;
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = in.nextInt();
		}
        StringBuffer str = new StringBuffer();

		quickSort(input, 0, n,str);
	}
}
