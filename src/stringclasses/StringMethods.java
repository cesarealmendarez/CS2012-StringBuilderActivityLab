// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package stringclasses;

import java.util.Arrays;

public class StringMethods {
	// private instance String	
	private String stringInstance;
		
	// constructor takes String literal and assigns to stringInstance	
	public StringMethods(String stringInput) {
		stringInstance = stringInput;
	}
	
	// getters and setters for stringInstance	
	public String getString() {
		return stringInstance;
	}
	
	public void setString(String string) {
		stringInstance = string;
	}
	
	public boolean reallyEquals(String string) {
		if(string.equals("Java")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean caselessEquals(String string) {
		if(string.equalsIgnoreCase("Java")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean internedEquals(String string) {
		if(string == "Java") {
			return true;
		}else {
			return false;
		}
	}
	
	public void printThis(String string) {
		System.out.println(string);
	}
	
	public String printAlpha(String string) {
		char[] charArray = string.toCharArray();
		Arrays.sort(charArray);
		String sortedString = new String(charArray);
		
		return sortedString;
	}
	
	public String getSubstring(String string, int startIndex, int endIndex) {
		String finalSubstring = string.substring(startIndex, endIndex);
		
		return finalSubstring;
	}
}
