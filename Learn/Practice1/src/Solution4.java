import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		mloop: for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			boolean found = false;
			for (int P_i = 0; P_i < r; P_i++) {

				P[P_i] = in.next();
			}			for (int P_i = 0; P_i < r; P_i++) {

				for (int G_i = 0; G_i < R; G_i++) {
					if (G[G_i].contains(P[P_i])) {

					//	System.out.println();
						int i=0;

						int x = G[G_i].indexOf(P[P_i]);
						for ( i = 1; i < r; i++) {

							++P_i;
							if (G[i+G_i].contains(P[P_i])
									&& x == G[i+G_i].indexOf(P[P_i])) {
								found = true;

							} else {
								System.out.println("NO");
								continue mloop;
							}
						}
						if(found&&(i==r)){
							System.out.println("YES");
							continue mloop;
						}else{
							
							System.out.println("NO");
							continue mloop;
						}
						
					
						
					}

					

                }}
			/*	if (found) {
					System.out.println("YES");

				} 
				else{
					System.out.println("NO");

				}*/
			}
	
	}
}
