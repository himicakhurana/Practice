import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACMICPC {
	static int acmIcpc(String str1, String str2, int length) {
		int topicsKnown = 0;
		for (int i = 0; i < length; i++) {
			if (str1.charAt(i) == '1' || str2.charAt(i) == '1') {
				topicsKnown += 1;
			}
		}
		return topicsKnown;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String topic[] = new String[n];
		for (int topic_i = 0; topic_i < n; topic_i++) {
			topic[topic_i] = in.next();
		}

		int maxKnown = 0, teamsCnt = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int knownForThisCombo = acmIcpc(topic[i], topic[j], m);
				if (knownForThisCombo > maxKnown) {
					maxKnown = knownForThisCombo;
					teamsCnt = 1;
				} else if (knownForThisCombo == maxKnown) {
					teamsCnt += 1;
				}
			}
		}

		System.out.println(maxKnown);
		System.out.println(teamsCnt);

	}
}
