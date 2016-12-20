import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxXOR {
	/*
	 * Complete the function below.
	 */

	static int maxXor(int l, int r) {
		int max = Integer.MIN_VALUE;
		for (int i = l; i < r + 1; i++) {
			for (int j = l; j < r + 1; j++) {
				int m = i ^ j;
				if (m > max) {
					max = m;
				}

			}
		}
		return max;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		int _l;
		_l = Integer.parseInt(in.nextLine());

		int _r;
		_r = Integer.parseInt(in.nextLine());

		res = maxXor(_l, _r);
		System.out.println(res);

	}
}
