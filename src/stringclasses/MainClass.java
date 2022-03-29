// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package stringclasses;

public class MainClass {

	public static void main(String[] args) {
		String[] wordArray = new String[]{"hello", "yes", "but", "new", "panda"};
		
		StringBuilder stringBuilder = new StringBuilder("");
		
		for(int i = 0; i < wordArray.length; i++) {
			if(i == wordArray.length - 1) {
				stringBuilder.append(wordArray[i]);	
			}else {
				stringBuilder.append(wordArray[i] + " ");
			}
		}
		
		String finalString = stringBuilder.toString().substring(0, 1).toUpperCase() + stringBuilder.toString().substring(1) + ".";
		
		System.out.println(finalString);
		
	}
}
