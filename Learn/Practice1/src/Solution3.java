import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			long p = 0;
			String s = "-1";
			if (n % 3 == 0) {
				String sp = "5";
				sp = repeatChar('5', n);

				// sp = new String(new char[n]).replace("\0", sp);

				// for(int i=0;i<n;i++)
				// sp=sp+"5";
				s = sp;
				System.out.println(s);
				continue;
				// p=Long.parseLong(s);
			}

			// for(int j=0;j<i;j++)
			// {
			// s1=s1+"5";
			// }

			int pq;

			for (int r = 5; r < n; r = r + 5) {
				// int pq=n%3;
				pq = n - r;

				if ((pq) % 3 == 0) {
					String s1 = "5";

					String s2 = "3";
					s1 = repeatChar('5', pq);

					// s1 = new String(new char[pq]).replace("\0", s1);

					// for(int k=0;k<(n-i);k++)
					// {
					// s2=s2+"3";
					// }
					s2 = repeatChar('3', r);

					// s2 = new String(new char[r]).replace("\0", s2);

					String s3 = s1 + s2;
					if (s3.compareTo(s) > 0) {

						s = s1 + s2;
						System.out.println(s);
						break;
					}

				}
			}
			/*
			 * while(r>0) { if((n-i)%3==0){ String s1="5";
			 * 
			 * String s2="3";
			 * 
			 * // for(int j=0;j<i;j++) // { // s1=s1+"5"; // } s1 = new
			 * String(new char[n-i]).replace("\0", s1);
			 * 
			 * // for(int k=0;k<(n-i);k++) // { // s2=s2+"3"; // } s2 = new
			 * String(new char[i]).replace("\0", s2);
			 * 
			 * 
			 * s=s1+s2;
			 * 
			 * 
			 * 
			 * }
			 */

			// }
			if (n % 5 == 0) {
				String s3 = "3";
				// for(int i=0;i<n;i++)
				// s3=s3+"3";
				// s3 = new String(new char[n]).replace("\0", s3);
				s3 = repeatChar('3', n);
				if (s3.compareTo(s) > 0) {
					s = s3;
					System.out.println(s);
				}

			}

		}

	}

	private static final String repeatChar(char c, int length) {
		char[] data = new char[length];
		Arrays.fill(data, c);
		return new String(data);
	}
}
