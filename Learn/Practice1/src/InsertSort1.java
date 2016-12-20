import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertSort1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		// int x = Integer.parseInt(in2.readLine());

		int y = Integer.parseInt(in2.readLine());
		String s = in2.readLine();
		String[] nos = s.trim().split(" ");
		int[] arr = new int[y];

		mloop: for (int i = 0; i < y; i++) {
			// TODO Auto-generated method stub
			arr[i] = Integer.parseInt(nos[i].trim());
		}
		int x = arr[y - 1];
		arr[y - 1] = arr[y - 2];
	
		boolean placed = false;
		mloop: for (int i = y - 2; i > -1; i--) {
			// TODO Auto-generated method stub
			//System.out.println(i);

			if (x <= arr[i]) {
				arr[i+1] = arr[i];

			} else if (x >= arr[i] && !placed) {
				placed = true;
				arr[i+1] = x;
				printArray(arr, y);

				break;

			}
			

			printArray(arr, y);
		}
		if(!placed){
			placed = true;
			arr[0] = x;
			printArray(arr, y);

	
		}

	}

	private static void printArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			if (i != n - 1)
				System.out.print(arr[i] + " ");
			else
				System.out.print(arr[i] + "\n");

		}
	}

}