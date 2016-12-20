import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
	static int lonelyinteger(int[] a) {
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res = 0;

		int _a_size = Integer.parseInt(in.nextLine());
		int[] _a = new int[_a_size];
		int _a_item;
		Set<Integer> s = new HashSet<Integer>();
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
			if (s.contains(_a_item)) {
				s.remove(_a_item);
			} else {
				s.add(_a_item);
			}

		}
		for (int r : s) {
			res = r;
		}

		System.out.println(res);

	}
}
