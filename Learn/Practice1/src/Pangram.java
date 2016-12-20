import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null && s.length() != 0)
   {
  
        		//String s = "abcd";
		List<Character> cSet=new ArrayList<Character>();
		Character a='a';
		for(int i=0;i<26;i++){
			cSet.add(a);
			a++;
		}
     //   System.out.println(cSet);
       //  System.out.println(s);
         s=s.toLowerCase();
        s=s.replaceAll(" ","");
        char[] chArr1 = s.toCharArray();
		Set<Character> cSet2=new HashSet<Character>();

		for (int i = 0; i < chArr1.length; i++) {
			cSet2.add(chArr1[i]);
			
		}
		cSet.retainAll(cSet2);
        if(cSet.size()==26){
        System.out.println("pangram");      
        }
        else{
                   System.out.println("not pangram");      
 
            
        }
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    }
