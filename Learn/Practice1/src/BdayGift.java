import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BdayGift {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int b = in.nextInt();
			int w = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			long a2 = Math.min(x, z + y);
			long b2 = Math.min(y, z + x);

			System.out.println(b * a2 + w * b2);
		}
	}
}
