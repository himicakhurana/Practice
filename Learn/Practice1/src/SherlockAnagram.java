import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherlockAnagram {
	public static void main(String[] args) throws IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			String s1, s2;
			s1 = in2.readLine();
			int pair = 0;
			Set<String> c1 = new HashSet<String>();
			c1 = getStringSet(s1);
			for (String s : c1) {
				for (String ss : c1) {

					if (!s.equals(ss)) {
						if (isAngram(s, ss)) {
							pair++;
						}
					}
				}
			}
			System.out.println(pair);
		}
	}

	private static boolean isAngram(String s1, String s2) {

		// char[] chArr = s.toCharArray();
		if (s1.length() == s2.length()) {
			char[] chArr1 = s1.toCharArray();
			char[] chArr2 = s2.toCharArray();
			Map<Character, Integer> ch1 = new HashMap<Character, Integer>();
			Map<Character, Integer> ch2 = new HashMap<Character, Integer>();

			int del = 0;
			for (int i = 0; i < chArr1.length; i++) {
				if (ch1.containsKey(chArr1[i])) {

					ch1.put(chArr1[i], ch1.get(chArr1[i]) + 1);
				} else {
					ch1.put(chArr1[i], 1);

				}
			}
			for (int i = 0; i < chArr2.length; i++) {
				if (ch2.containsKey(chArr2[i])) {

					ch2.put(chArr2[i], ch2.get(chArr2[i]) + 1);
				} else {
					ch2.put(chArr2[i], 1);

				}
			}
			// System.out.println(ch1);
			// System.out.println(ch2);

			Set<Character> c1 = new HashSet<Character>();
			c1.addAll(ch1.keySet());
			Set<Character> c2 = new HashSet<Character>();
			c2.addAll(ch2.keySet());
/*			c1.removeAll(c2);

			// System.out.println(c1);
			if (null != c1)
				for (Character s : c1) {
					del = del + ch1.get(s);

				}
			c1.clear();
			c2.clear();

			c1.addAll(ch1.keySet());
			c2.addAll(ch2.keySet());
			c2.removeAll(c1);
			// int x = c1.size();
			// System.out.println(c2);
			//
			if (null != c2)
				for (Character s : c2) {
					del = del + ch2.get(s);

				}
			c1.clear();
			c2.clear();*/

			c1.addAll(ch1.keySet());
			c2.addAll(ch2.keySet());
			c1.retainAll(c2);
			// System.out.println(c1);
			if (c2.size()==c1.size()) {
				for (Character s : c1) {
					del = del + Math.abs(ch1.get(s) - ch2.get(s));

				}
				if (del == 0) {
					return true;
				}
			}
		}
		return false;
	}

	private static Set<String> getStringSet(String s1) {
		Set<String> c1 = new HashSet<String>();
		for (int i = 0; i < s1.length(); ++i) {
			for (int j = 0; j < (s1.length() - i); ++j) {
				c1.add(s1.substring(j, i + j + 1));
			}
		}

		return c1;
	}
}