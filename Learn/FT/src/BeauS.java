import java.io.*;
import java.util.*;

public class BeauS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String B = in.next();
		int steps = 0;
		while (B.contains("010")) {
			int x = B.indexOf("010");
			B = B.replaceFirst("010", "000");
		}
		System.out.println(steps);
	}
}