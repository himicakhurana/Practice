import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrConst {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String s = in.next();
			System.out.println(strConst(s));
		}
	}

	private static int strConst(String s) {
		int cost = 0;
		Set<Character> set=new HashSet<>();
		for(int i = 0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		cost=set.size();
	/*	StringBuilder output = new StringBuilder();
		output.append(s.charAt(0));
		cost++;
		int i = 1;
		while (s.compareTo(output.toString()) != 0) {
			char c = s.charAt(i);
			if (output.toString().contains(Character.toString(c))) {
				output.append(c);
			} else {
				output.append(c);
				cost++;
			}
			i++;
		}*/
		return cost;
	}
}
