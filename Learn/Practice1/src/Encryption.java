import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int len = s.length();
		int row = (int) Math.floor(Math.sqrt(len));
		int col = (int) Math.ceil(Math.sqrt(len));
		int newrow = 0, newcol = 0;
        //some times we can fit in the the word with given col find and increase the row
        if (len / row >= col)
               row += 1;

        String result = "";

        char[][] secret = null;
        //find the correction col and row or not equal
        int correction = Math.abs(col - row);
         // if row is greater, correct the col and make it equal to row
        if (row > col)
        {
               secret = new char[row][col + correction];
               newcol = col + correction;
               newrow = row;
        }
        //if col is greater, correct the row and make it equal to col
        else if (col > row)
        {

               secret = new char[row + correction][col];
               newrow = row + correction;
               newcol = col;
        }
        //else row and col are equal
        else
        {
               secret = new char[row][col];
               newrow = row;
               newcol = col;

        } 
		char[][] p = new char[row][col];
		
		int k = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < newrow; i++) {
			for (int j = 0; j < newcol; j++) {
				if (k < len)
					p[i][j] = ch[k];
				k++;
			}

		}
		p = trasposeMatrix(p);
		for (int i = 0; i < col; i++) {
			System.out.print(String.valueOf(p[i]).trim()+" ");
		}
		System.out.println("");
	}

	public static char[][] trasposeMatrix(char[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		char[][] trasposedMatrix = new char[n][m];

		for (int x = 0; x < n; x++) {
			for (int y = 0; y < m; y++) {
				trasposedMatrix[x][y] = matrix[y][x];
			}
		}

		return trasposedMatrix;
	}

}
