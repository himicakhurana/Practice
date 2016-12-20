import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class camelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int c = 0;
		if (s.length() > 0 && Character.isLowerCase(s.charAt(0))) {
			c = 1;
			for (int i = 1; i < s.toCharArray().length; i++) {
				if (Character.isUpperCase(s.charAt(i))) {
					c++;
				}
			}
		}
		System.out.println(c);
	}

}
