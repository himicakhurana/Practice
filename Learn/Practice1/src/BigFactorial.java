import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigFactorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();

		BigInteger n2 = BigInteger.ONE;
		for (BigInteger i = n; i.compareTo(BigInteger.ONE) > 0; i = i
				.subtract(BigInteger.ONE)) {
			n2 = n2.multiply(i);
		}
		System.out.println(n2);

	}
}
