import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoStrings {
	public static void main(String[] args) throws IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			String s1, s2;
			s1 = in2.readLine();

			s2 = in2.readLine();
			char[] chArr1 = s1.toCharArray();
			char[] chArr2 = s2.toCharArray();
			Set<Character> c1 = new HashSet<Character>();
			// c1.addAll(ch1.keySet());
			Set<Character> c2 = new HashSet<Character>();
			// c2.addAll(ch2.keySet());
			// c1.removeAll(c2);

			for (int i = 0; i < chArr1.length; i++) {
				c1.add(chArr1[i]);

			}
			for (int i = 0; i < chArr2.length; i++) {
				c2.add(chArr2[i]);
			}
			c1.retainAll(c2);
			// System.out.println(c1);
			if (c1.size() > 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");

			}
		}
	}
}