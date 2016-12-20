import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sansa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			int _a_size = Integer.parseInt(in.nextLine());
			int[] _a = new int[_a_size];
			int _a_item;
			Set<Integer> s = new HashSet<Integer>();
			String next = in.nextLine();
			String[] next_split = next.split(" ");

			for (int _a_i = 0; _a_i < _a_size; _a_i++) {
				_a_item = Integer.parseInt(next_split[_a_i]);
				_a[_a_i] = _a_item;

			}
			int res = getStringSet(_a);
			System.out.println(res);
		}
	}

	private static int getStringSet(int[] s1) {
		Set<String> c1 = new HashSet<String>();
		int res = s1[0];
		for (int i = 0; i < s1.length; ++i) {
			for (int j = 0; j < (s1.length - i); ++j) {

				int[] p = subsarray(s1, j, i + j + 1);

				for (int k = 0; k < p.length; ++k) {
					res = res ^ p[k];
				}

			}
		}

		return res;
	}

	private static int[] subsarray(int[] s1, int j, int i) {
		int p[] = new int[i + 2];
		for (int k = j, l = 0; k <= i + j + 1; k++, l++) {
			p[l] = s1[k];
		}

		return p;
	}
}
