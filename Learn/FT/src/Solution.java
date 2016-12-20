import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String a, String b) {
       HashSet<Character> aSet=new HashSet(Arrays.asList(a.toCharArray()));
                HashSet<Character> bSet=new HashSet(Arrays.asList(b.toCharArray()));
      //  HashSet<Character> cSet=aSet;
        //aSet.retainAll(bSet);
        int p=aSet.size();

        aSet.addAll(bSet);
        int q=bSet.size();
        return p;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));

       

    }
}
