import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        int n = 6;
        int i,j;
        for(i=1;i<=6;i++){
        	
            
            for(int k=0;k<(n-i);k++){
                System.out.print(" ");
            }
                 for(int l=0;l<i;l++){
                System.out.print("#");
            }
                            System.out.print("\n");
        }
    }
}
