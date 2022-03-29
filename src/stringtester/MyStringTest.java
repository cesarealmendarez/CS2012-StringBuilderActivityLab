// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package stringtester;

import stringclasses.StringBuilderMethods;
import stringclasses.StringMethods;

public class MyStringTest {

	public static void main(String[] args) {
		StringMethods stringMethodsObject = new StringMethods("Ukelele");
		stringMethodsObject.setString("Ukelele");
		
		String stringMethodsString = stringMethodsObject.getString();
	
		System.out.println(stringMethodsString + " reallyEquals Java");
		System.out.println(stringMethodsObject.reallyEquals(stringMethodsString));
		System.out.println(stringMethodsObject.reallyEquals(stringMethodsString));
		System.out.println("------------------------");
		
		System.out.println(stringMethodsString + " caselessEquals Java");
		System.out.println(stringMethodsObject.caselessEquals(stringMethodsString));
		System.out.println("------------------------");
		
		System.out.println(stringMethodsString + " internedEquals Java");
		System.out.println(stringMethodsObject.internedEquals(stringMethodsString));
		System.out.println("------------------------");
		
		System.out.println("PrintThis()");
		stringMethodsObject.printThis(stringMethodsString);
		System.out.println("------------------------");
		
		System.out.println("PrintAlpha()");
		System.out.println(stringMethodsObject.printAlpha(stringMethodsString));
		System.out.println("------------------------");
		
		System.out.println("GetSubstring");
		System.out.println(stringMethodsObject.getSubstring(stringMethodsString, stringMethodsString.length() - 3, stringMethodsString.length()));
		System.out.println("------------------------");
		
		StringBuilderMethods stringBuilderMethodsObject = new StringBuilderMethods("Incomprehensibility"); 
		stringBuilderMethodsObject.setStringBuilder("Incomprehensibility");

		
		System.out.println("SentenceBuilder");
		String[] wordArray = {"hello", "yes", "but", "new", "panda"};
		System.out.println(stringBuilderMethodsObject.sentenceBuilder(wordArray));
		System.out.println("------------------------");
		
		System.out.println("ParagraphBuilder");
		String[] sentenceArray = {"I call it...the wheel.", "Why don't you take a seat.", "I'm here in my backyard smoking these meats.", "Do you want to invest in my NFT startup?", "The singularity is near."};
		System.out.println(stringBuilderMethodsObject.paragraphBuilder(sentenceArray));
		System.out.println("------------------------");
		
		System.out.println("PrintThis()");
		stringBuilderMethodsObject.printThis();
	}

}