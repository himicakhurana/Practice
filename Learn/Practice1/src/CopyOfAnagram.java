import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CopyOfAnagram {
	public static void main(String[] args) throws IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			String s1, s2;
			s1 = in2.readLine();
			int del = -1;
			int del1 = 0;

			if (s1.length() % 2 == 0) {
				s2 = s1.substring((s1.length() / 2), s1.length() - 1);
				s1 = s1.substring(0, s1.length() / 2 - 1);
				char[] chArr1 = s1.toCharArray();
				char[] chArr2 = s2.toCharArray();
				Map<Character, Integer> ch1 = new HashMap<Character, Integer>();
				Map<Character, Integer> ch2 = new HashMap<Character, Integer>();

				del = 0;
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
				/*
				 * c1.removeAll(c2);
				 * 
				 * // System.out.println(c1); del1 = 0; if (null != c1) for
				 * (Character s : c1) { del1 = del1 + ch1.get(s);
				 * 
				 * } c1.clear(); c2.clear();
				 * 
				 * c1.addAll(ch1.keySet()); c2.addAll(ch2.keySet());
				 */
				c2.removeAll(c1); // int x = c1.size(); //
				System.out.println(c2); //
				if (null != c2)
					for (Character s : c2) {
						del = del + ch2.get(s);

					}
				c1.clear();
				c2.clear();

				c1.addAll(ch1.keySet());
				c2.addAll(ch2.keySet());
				c1.retainAll(c2);
				// System.out.println(c1);

				for (Character ss : c1) {
					if (ch1.get(ss) != ch2.get(ss))
						del = del + Math.abs(ch2.get(ss) - ch1.get(ss));

				}
				del = Math.abs(del - del1);

			} else {
				String s;
				s2 = s1.substring((s1.length() / 2 + 2), s1.length()-1);
				s = s1.substring(0, s1.length() / 2+1);
				String s3 = s1.substring((s1.length() / 2 + 3), s1.length());
				String s4 = s1.substring(0, s1.length() / 2+2);
				char[] chArr1 = s.toCharArray();
				char[] chArr2 = s2.toCharArray();
				Map<Character, Integer> ch1 = new HashMap<Character, Integer>();
				Map<Character, Integer> ch2 = new HashMap<Character, Integer>();

				del = 0;
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
				c1.removeAll(c2);

				// System.out.println(c1);
				del1 = 0;
				if (null != c1)
					for (Character sy : c1) {
						del1 = del1 + ch1.get(sy);

					}
				c1.clear();
				c2.clear();

				/*
				 * c1.addAll(ch1.keySet()); c2.addAll(ch2.keySet());
				 * c2.removeAll(c1); // int x = c1.size(); //
				 * System.out.println(c2); // if (null != c2) for (Character s :
				 * c2) { del = del + ch2.get(s);
				 * 
				 * } c1.clear(); c2.clear();
				 */
				c1.addAll(ch1.keySet());
				c2.addAll(ch2.keySet());
				c1.retainAll(c2);
				// System.out.println(c1);

				for (Character ss : c1) {
					if (ch1.get(ss) != ch2.get(ss))
						del = del + Math.abs(ch2.get(ss) - ch1.get(ss));

				}
				del = Math.abs(del - del1);

			}
			// s2 = in2.readLine();
			// char[] chArr = s.toCharArray();

			// del=Math.min(del,del1);

			// }
			System.out.println(del);
		}
	}
}