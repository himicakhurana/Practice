import java.io.*;
import java.util.*;

public class InsertArray2 {

	public static void insertionSortPart2(int[] ar) {
		int x = 0;
		for (int j = 1; j < ar.length; j++) // Start with 1 (not 0)
		{
			int key = ar[j];
			int i;
			for (i = j - 1; (i >= 0) && (ar[i] > key); i--) // Smaller values
															// are moving up
			{
				ar[i + 1] = ar[i];
				x++;
			}
			ar[i + 1] = key;
			// Put the key in its proper location
		}
		System.out.println(x);
	}

	// Fill up the code for the required logic here
	// Manipulate the array as required
	// The code for Input/Output is already provided

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
