import java.io.*;
import java.util.*;

public class LoveLetter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String B = in.next();
			System.out.println(minPallindrome(B));

		}
	}

	private static int minPallindrome(String s) {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		int b = 0, e = s.length() - 1;
		int cost = 0;
		StringBuilder myName = new StringBuilder(s);
		while (b <= e) {
			if (myName.charAt(b) == myName.charAt(e)) {
				b++;
				e--;
			} else {
				char c = myName.charAt(e);
				char bc = myName.charAt(b);
				int i = alphabets.indexOf(c);
				int j = alphabets.indexOf(bc);
				cost = cost + Math.abs(i - j);
				b++;
				e--;
			}
		}

		return cost;
	}

	static String rearrangeWord(String word) {
		/*
		 * String alphabets = "abcdefghijklmnopqrstuvwxyz";
		 */
		int p = -1, q = -1;
		for (int i = word.length() - 1; i >0; i--) {
			if (word.charAt(i-1) < word.charAt(i)) {
				p = i;
				q = i + 1;
				break;
			}		
		}
		StringBuilder myName = new StringBuilder(word);
		if(p>-1&&q>-1){
	
			char x=word.charAt(p-1);
			int smallest=p;
			  for (int j = p+1; j < word.length(); j++)
			        if (word.charAt(j) > x && word.charAt(j)< word.charAt(p))
			        	smallest = j;
			 	
				myName.setCharAt(p-1, word.charAt(smallest));
				myName.setCharAt(smallest, word.charAt(p-1));
				char[] cArray=myName.toString().toCharArray();
				Arrays.sort(cArray, p, word.length());
				
				return new String(cArray);
		
		}

		return "no answer";

	}
	
	
	void findNext(char number[], int n)
	{
	    int i, j;
	 
	    // I) Start from the right most digit and find the first digit that is
	    // smaller than the digit next to it.
	    for (i = n-1; i > 0; i--)
	        if (number[i] > number[i-1])
	           break;
	 
	    // If no such digit is found, then all digits are in descending order
	    // means there cannot be a greater number with same set of digits
	    if (i==0)
	    {
	        return;
	    }
	 
	    // II) Find the smallest digit on right side of (i-1)'th digit that is
	    // greater than number[i-1]
	    int x = number[i-1], smallest = i;
	    for (j = i+1; j < n; j++)
	        if (number[j] > x && number[j] < number[smallest])
	            smallest = j;
	 
	    // III) Swap the above found smallest digit with number[i-1]
	    swap(&number[smallest], &number[i-1]);
	    
	 
	    // IV) Sort the digits after (i-1) in ascending order
	    sort(number + i, number + n);
	 
	 
	    return;
	}
}