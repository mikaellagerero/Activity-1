package Activity1;

public class containsdigits {


public static void main(String[] args){
		String str = "4345752345";
		boolean result = str.matches("[0-9]+");
		System.out.println("Original String : " + str);
		System.out.println("Does string contain only Digits? : " + result);
	}
}