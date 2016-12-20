import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class reverseChar {

    public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s="We promptly judged antique ivory buckles for the next prize";
 //   while ((s = in.readLine()) != null && s.length() != 0)
   //{
  
        		//String s = "abcd";
	Set<Character> cSet=new HashSet<Character>();
	List<Character> cSet3=new ArrayList<Character>();

		Character a='a';
		for(int i=0;i<26;i++){
			cSet.add(a);
			a++;
		}
        System.out.println(cSet);
         System.out.println(s);
s=s.toLowerCase();
        s=s.replaceAll(" ","");
System.out.println(s);
        System.out.println(s.toCharArray());
		Set<Character> cSet2=new HashSet<Character>(Arrays.asList(s.toCharArray());
		char[] ch=s.toCharArray();
		s
            System.out.println(cSet.containsAll(Arrays.asList(s.toCharArray())));
       // }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 //   }
    }
}