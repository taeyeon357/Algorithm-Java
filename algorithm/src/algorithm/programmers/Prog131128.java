package algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prog131128 {

	public static void main(String[] args) {
		String X = "100";
		String Y = "2345";
		
		
		char[] arr_x = X.toCharArray();
		char[] arr_y = Y.toCharArray();
		Arrays.sort(arr_x);
		Arrays.sort(arr_y);

		int i = X.length() - 1;
		int j = Y.length() - 1;

		List<String> pair = new ArrayList<>();
		while (i >= 0 && j >= 0) {
			char x = arr_x[i];
			char y = arr_y[j];

			if (x == y) {
				pair.add(Character.toString(x));
				i--;
				j--;
			} else if (x > y) {
				i--;
			} else {
				j--;
			}
		}

		Collections.sort(pair, Collections.reverseOrder());

		if (pair.size() == 0) {
			System.out.println("-1");
		} else {
			if ("0".equals(pair.get(0))) {
				System.out.println("0");
			} else {
				System.out.println(String.join("", pair));
			}
		}

	}

}
