import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaeserCipher {
	public abstract class CircularArrayQueue implements Queue {

		private static final int capacity = 5;
		private Object[] Q;
		private final int N; // capacity
		private int f = 0;
		private int r = 0;

		public CircularArrayQueue() {
			this(capacity);
		}

		public CircularArrayQueue(int capacity) {
			N = capacity;
			Q = new Object[N];
		}

		public int size() {
			if (r > f)
				return r - f;
			return N - f + r;
		}

		public boolean isEmpty() {
			return (r == f) ? true : false;
		}

		public boolean isFull() {
			int diff = r - f;
			if (diff == -1 || diff == (N - 1))
				return true;
			return false;
		}

		public void enqueue(Object obj) throws Exception {
			if (isFull()) {
				throw new Exception("Queue is Full.");
			} else {
				Q[r] = obj;
				r = (r + 1) % N;
			}
		}

		public Object dequeue() throws Exception {
			Object item;
			if (isEmpty()) {
				throw new Exception();
			} else {
				item = Q[f];
				Q[f] = null;
				f = (f + 1) % N;
			}
			return item;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		char[] c = s.toCharArray();
		int i = 0;
		for (char ch : c) {
			if (Character.isAlphabetic(ch)) {
				ch = transform(ch, k);
			}
			c[i] = ch;
			i++;
		}
		System.out.println(String.valueOf(c));
	}

	private static char transform(char ch, int k) {
		k = k % 26;
		// TODO Auto-generated method stub
		if (Character.isLowerCase(ch)) {
			if (ch + k > 'z') {
				ch = (char) ('a' + (k - ('z' - ch) - 1));

			} else {
				ch = (char) (ch + k);
			}
		} else {
			if (ch + k > 'Z') {
				ch = (char) ('A' + (k - ('Z' - ch)) - 1);

			} else {
				ch = (char) (ch + k);
			}
		}

		return ch;
	}
}
