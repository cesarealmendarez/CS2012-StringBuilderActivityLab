// CESAR ALMENDAREZ
// INTRO TO PROGRAMMING II CS 2012-03

package stringclasses;

public class StringBuilderMethods {
	private StringBuilder stringBuilder = new StringBuilder("");
	
	public StringBuilderMethods(String stringInput) {
		stringBuilder.append(stringInput);
	}
		
	public void setStringBuilder(String stringInput) {
		stringBuilder.setLength(0);
		stringBuilder.append(stringInput);
	}
	
	public String getStringBuilder() {
		return stringBuilder.toString();
	}
	
	public StringBuilder sentenceBuilder(String wordArray[]) {
		
		
		StringBuilder stringBuilder = new StringBuilder("");
		
		for(int i = 0; i < wordArray.length; i++) {
			if(i == wordArray.length - 1) {
				stringBuilder.append(wordArray[i]);	
			}else {
				stringBuilder.append(wordArray[i] + " ");
			}
		}
		
		String sentence = stringBuilder.toString().substring(0, 1).toUpperCase() + stringBuilder.toString().substring(1) + ".";
		
		StringBuilder finalSentence = new StringBuilder(sentence);
		
		return finalSentence;
	}
	
	public StringBuilder paragraphBuilder(String sentenceArray[]) {
		StringBuilder stringBuilder = new StringBuilder("");
		
		for(int i = 0; i < sentenceArray.length; i++) {
			if(i == 0) {
				stringBuilder.append("     " + sentenceArray[i] + "\n");	
			}else {
				stringBuilder.append(sentenceArray[i] + " " + "\n");
			}
		}
		
		String sentence = stringBuilder.toString();
		
		StringBuilder finalParagraph = new StringBuilder(sentence);
		
		return finalParagraph;
	}
	
	public void printThis() {
		System.out.print(stringBuilder.toString());
	}
	
	
}
