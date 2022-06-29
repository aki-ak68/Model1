import java.util.Arrays;

public class Stringg {
public static void main(String[] args) {
	String a = "Gogul";
	String b = "Gogul,Krish";
	
	
	//to find length
	System.out.println(a.length());
	//to find first chararcter in string or any char using index
	System.out.println(a.charAt(0) + a.charAt(3));
	//to Make it uppercase
	System.out.println(a.toUpperCase());
	//Make ti lower
	System.out.println(a.toLowerCase());
	// Append with string
	System.out.println(a.concat("Krish"));
	//Get particular value from inside the string
	System.out.println(a.substring(2, 4));
	//Split by ,    it split one string int two string by split so we have to set muktiple strings in string array
	String arr[] = b.split(",");
	System.out.println(Arrays.toString(arr));
}
		
}
