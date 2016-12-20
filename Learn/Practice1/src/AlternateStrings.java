import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AlternateStrings {
	public static void main(String[] args) throws IOException {
		   BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			    String s;
			    while ((s = in2.readLine()) != null && s.length() != 0){
			    			//char[] chArr = s.toCharArray();

			char[] chArr = s.toCharArray();

			int del = 0;
			for (int i = 0; i < chArr.length-1; i++) {
			
					if (chArr[i + 1] == chArr[i]) {
						del++;
						
						
					}
			}
			System.out.println(del);
			    }	  
	}
}
}