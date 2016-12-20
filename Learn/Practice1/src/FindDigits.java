import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int count = 0;
			String dig = Integer.toString(n);
			char[] chArr1 = dig.toCharArray();
			Set<Integer> cSet2 = new HashSet<Integer>();

			for (int i = 0; i < chArr1.length; i++) {

				cSet2.add(Integer.parseInt(Character.toString(chArr1[i])));

			}
			for (int digit : cSet2) {
				if (digit != 0)
					if ((n % digit) == 0)
						count++;
			}

			System.out.println(count);
		}
	}
}
