package map;
import java.io.UnsupportedEncodingException;  
import java.net.URLDecoder;  
import java.net.URLEncoder;  
public class Encodenew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String url="https://こんにちわcalendar.googleこんにちわ.com";  
        String encode = encode(url);  
        System.out.println("Encoded URL: "+encode);  
        String decode = decode(encode);  
        System.out.println("Decoded URL: "+decode);  
	}
	public static String decode(String url)  
    {  
              try {    
                   String decodeURL=URLDecoder.decode( url, "UTF-8" );   
                   return decodeURL;  
              } catch (UnsupportedEncodingException e) {  
                   return "Issue while decoding";  
              }  
    }  
    public static String encode(String url)  
    {  
              try {  
                   String encodeURL=URLEncoder.encode( url, "UTF-8" );  
                   return encodeURL;  
              } catch (UnsupportedEncodingException e) {  
                   return "Issue while encoding";  
              }  
    }  

}
