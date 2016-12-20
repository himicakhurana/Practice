import java.math.BigInteger;
import java.util.Scanner;

public class CounterGame {
	static boolean IsPowerOfTwo(long n) {

		return ((n & (n - 1)) == 0);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
				n = checkWin(n,1);

			if (n == 1) {
				System.out.println("Richard");
			} else {
				
					System.out.println("Louise");

			}
			}
		}
	

	private static long checkWin(long n, long p) {
		if (n == 1)
			return p;
		p = (p == 1) ? 0 : 1;
		if (IsPowerOfTwo(n)) {
			n =n- n / 2;
		} else {
			long x=n;
			n--;
			n |= n >> 1;
			n |= n >> 2;
			n |= n >> 4;
			n |= n >> 8;
			n |= n >> 16;
			n++;
			n >>= 1;
			
			n=x-n;
		}
		n = checkWin(n, p);

		// TODO Auto-generated method stub
		return n;
	}

}
