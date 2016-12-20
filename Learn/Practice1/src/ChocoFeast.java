import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocoFeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int c1 = (int) n / c;
			int c2 = (int) c1 / m;
			c1 = c1 + c2;
			while (m - c2 > 0) {
				 c2 = (int) c1 / m;
			}
			System.out.println((int) (c1));

		}
	}
}
