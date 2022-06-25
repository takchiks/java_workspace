package com.cogent.mock;

import java.util.ArrayList;

public class Result {
	private final static String wendy = "wendy";
	private final static String bob = "bob";
	private static String ans;

	public static String gameWinner(String colors) {
		colors = colors.toLowerCase();
		char[] arr = colors.toCharArray();
		int bobCount = 0, wendycount = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 'b') {
				if (arr[i] == arr[i - 1] && i != arr.length-1 ) {
					bobCount += 1;

				}
				if (arr[i-1] == 'w') {
					wendycount -= 1;

				}
			}
			else if (arr[i] == 'w') {
				if (arr[i] == arr[i - 1] && i != arr.length-1) {
					wendycount += 1;

				}
				if (arr[i-1] == 'b') {
					bobCount -= 1;

				}
			}
		}
		ans = bobCount>=wendycount?bob:wendy;

		return ans;
	}

}