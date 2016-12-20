import java.io.*;import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EmptyString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        boolean changed;
        do {
            changed = false;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ((i+1) < s.length() && s.charAt(i+1) == s.charAt(i)) {
                    i++;
                    changed = true;
                }
                else {
                    sb.append(s.charAt(i));
                }
            }
            s = sb.toString();
        } while (changed);
                
        if (s.length() > 0) {
            System.out.println(s);
        }
        else {
            System.out.println("Empty String");
        }
    }
}