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

public class Anagram {
	public static void main(String[] args) throws IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));

		String s1, s2;
		s1 = "cde";
		s2 = "abc";
		// char[] chArr = s.toCharArray();

	
		char[] chArr2 = s2.toCharArray();
		Map<Character, Integer> ch1 = new HashMap<Character, Integer>();
		Map<Character, Integer> ch2 = new HashMap<Character, Integer>();

		int del = 0;
		char[] chArr1 = s1.toCharArray();
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
	//	System.out.println(ch1);
	//	System.out.println(ch2);

		Set<Character> c1 = new HashSet<Character>();
		c1.addAll(ch1.keySet());
		Set<Character> c2 = new HashSet<Character>();
		c2.addAll(ch2.keySet());
		c1.removeAll(c2);

	//	System.out.println(c1);
		if (null != c1)
			for (Character s : c1) {
				del = del + ch1.get(s);

			}
		c1.clear();
		c2.clear();

		c1.addAll(ch1.keySet());
		c2.addAll(ch2.keySet());
		c2.removeAll(c1);
	//	int x = c1.size();
//		System.out.println(c2);
//
		if (null != c2)
			for (Character s : c2) {
				del = del + ch2.get(s);

			}
		c1.clear();
		c2.clear();

		c1.addAll(ch1.keySet());
		c2.addAll(ch2.keySet());
		c1.retainAll(c2);
	//	System.out.println(c1);

		for (Character s : c1) {
			del = del + Math.abs(ch1.get(s) - ch2.get(s));

		}

		System.out.println(del);
	}

}