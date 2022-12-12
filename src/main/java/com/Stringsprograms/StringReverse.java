package com.Stringsprograms;

import java.util.stream.IntStream;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(reverse("Ashoka"));

	}

	private static char[] reverse(String test) {
		return null;

		//return IntStream.range(0, test.length()).map(i -> test.charAt(test.length() - i - 1)).collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append).toString();
	}

}
