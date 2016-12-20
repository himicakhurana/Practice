import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BracsSol {
	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		stack.push(expression.charAt(0));
		for (int i = 1; i < expression.length(); i++) {
			char x = ' ';
			if (!stack.empty()) {
				x = stack.peek();
			}
			if (isReflection(x, expression.charAt(i))) {
				stack.pop();
			} else {
				stack.push(expression.charAt(i));
			}
		}
		return stack.isEmpty();

	}

	static boolean isReflection(char x, char y) {
		if ((x == '(' && y == ')') || (x == '[' && y == ']')
				|| (x == '{' && y == '}'))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			boolean answer = isBalanced(expression);
			if (answer)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
