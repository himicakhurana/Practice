import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunnyString {
	public static void main(String[] args) throws IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			String s, r;
			s = in2.readLine();
			StringBuilder input1 = new StringBuilder();
			input1.append(s);

			input1 = input1.reverse();
			r = input1.toString();

			boolean funny = false;
			for (int i = 1; i < s.length(); i++) {
				char q1 = s.charAt(i - 1);
				char q = s.charAt(i);
				char p1 = r.charAt(i - 1);
				char p = r.charAt(i);
			/*	System.out.println("---------");
				System.out.println(q);
				System.out.println(q1);
				System.out.println(q1-q);
				System.out.println(p);
				System.out.println(p1);
				System.out.println(p1-p);
				System.out.println("---------");*/

				if (Math.abs(q1-q) == Math.abs(p1-p)) {
					funny = true;
				} else {
					funny = false;
					break;

				}
			}
			if (funny) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");

			}
		}
	}
}
