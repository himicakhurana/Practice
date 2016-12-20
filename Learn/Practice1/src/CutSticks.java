import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CutSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		// int arr[] = new int[n];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr.add(in.nextInt());
		}
		int p = arr.size();
		int min = Collections.min(arr);
		while (arr.size() > 0) {
			System.out.println(arr.size());

			for (int x = 0; x < arr.size(); x++) {
				if (arr.get(x) <= min) {
					arr.remove(x);
					x--;
				} else {
					arr.set(x, arr.get(x) - min);
				}
			}
			
			if(arr.size()>0){
			min = Collections.min(arr);
			}
		}

	}

	private static int calcSize(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub

		int o = 0;
		for (int p : arr) {
			if (p > 0) {
				o++;
			}
		}

		return o;
	}

	private static void printArray(ArrayList<Integer> ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
