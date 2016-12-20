import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		int fine = 0;
		if ((d1 >= d2 && m1 == m2 && y1 == y2)||( y1 > y2)||(m1 >= m2 && y1 >= y2)) {
			fine = 0;
		} else if (m1 == m2 && y1 == y2 &&d2 > d1) {
			fine = (d2 - d1 ) * 15;
		} else if (y1 == y2 && m1 < m2) {
			fine = (m2 - m1) * 500;
		} else if (y1 < y2) {
			fine = 10000;
		}

		System.out.println(fine);
	}
}
