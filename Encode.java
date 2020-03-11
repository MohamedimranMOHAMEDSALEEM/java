package encode;

import java.util.*;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String j = "https://こんにちわcalendar.googleこんにちわ.com";
		String encode = Base64.getUrlEncoder().encodeToString(j.getBytes());
		String x = null;
		System.out.println("Encoded String:\n" + encode);

		for (int i = 0; i < j.length(); i++) {
			Character c = j.charAt(i);
			int value = c;

			System.out.println("Ascii : " + value);
//			System.out.println("Ascii : " + (int) c);
			if (value <= 127) {
				System.out.println("true");
				System.out.println(encode.charAt(i));
				char[] myNameChars = j.toCharArray();
				myNameChars[i] = encode.charAt(i);
				j = String.valueOf(myNameChars);

			} else {
				System.out.println("false");
				System.out.println(j.charAt(i));
			}
		}
		System.out.println("Encoded string only single byte: ");
		System.out.println(j);
	}

}
