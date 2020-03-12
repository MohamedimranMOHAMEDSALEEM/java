import java.util.*;
import java.io.UnsupportedEncodingException;  
import java.net.URLEncoder;  
public class Encodenew
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String j = "https://こんにちわcalendar.googleこんにちわ.com/select~calender/#/march+dark";
		System.out.println(j);
		//System.out.println(URLEncoder.encode(j));
		StringBuffer strcpy = new StringBuffer();
		//String strcpy="null";
		for (int i = 0; i < j.length(); i++) {
			char c = j.charAt(i);
			String myStr =String.valueOf(c);
			int value = c;
			//System.out.println("Ascii : " + value);
			if(value>=127){
				//System.out.println("true");

				try {  
					String encodeURL=URLEncoder.encode( myStr, "UTF-8" );  
					//System.out.println(encodeURL);  
					strcpy = strcpy.append(encodeURL);

				} catch (UnsupportedEncodingException e) {  
					System.out.println("Issue while encoding"); 
				}  

			}
			else
			{
				strcpy = strcpy.append(c);
			}
		}
		System.out.println(strcpy);
	}
}
