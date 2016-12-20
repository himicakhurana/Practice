import java.util.Scanner;
import java.util.TreeSet;

public class Mansa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();

			TreeSet<Integer> tSet = new TreeSet<Integer>();
			int x = 0;
			for (int i = 0; i <= n - 1; i++) {
				x = x + i * a + (n - 1 - i) * b;
				tSet.add(x);
				// System.out.println(x);
				x = 0;
			}
			for (int n1 : tSet) {
				System.out.print(n1 + " ");
			}
			System.out.println("");

		}
	}
}
