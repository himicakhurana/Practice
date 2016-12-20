import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoChar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		String s = in.next();
		String regex = "";
		Set<Character> cSet = new HashSet<>();
		for (int i = 0; i < len; i++) {
			if (!cSet.contains(s.charAt(i)))
				regex = regex + s.charAt(i);
			cSet.add(s.charAt(i));
		}
		if (cSet.size() == 2 && !repeats(s)) {
			System.out.println(2);
		} else {
			String test = "", max = "";
			for (int i = 0; i < len; i++) {
				test = regex;
				for (char c : cSet) {
					test = regex;
					if (c != s.charAt(i)) {
						test = test.replaceAll("[" + c + s.charAt(i) + "]", "");
						String temp = s.replaceAll("[" + test + "]", "");
						if (temp.length() > max.length() && !repeats(temp)) {
							max = temp;
							test = regex;
						}
					}
				}
			}
			System.out.println(max.length());
		}
	}

	private static boolean repeats(String temp) {
		// TODO Auto-generated method stub
		for (int i = 0; i < temp.length() - 1; i++) {
			if (temp.charAt(i) == temp.charAt(i + 1))
				return true;
		}
		return false;
	}
}
