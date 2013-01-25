import java.util.StringTokenizer;

public class ReadabilityStatistics {
	public static int wordCount(String str) {
	
		//Trim string
		str = str.trim();
		
		//StringTokenizer using default constructor
		StringTokenizer strTokenizer = new StringTokenizer(str, " :.!?,\r\n\t");
		
		//return the number of tokens (words)
		return strTokenizer.countTokens();
	}
	
	public static int characterCount(String str) {
	
		//Trim string
		str = str.trim();
		
		//StringTokenizer using default constructor
		StringTokenizer strTokenizer = new StringTokenizer(str);
		
		//hold copy of tokens only, no delimeters
		StringBuilder noSpaces = new StringBuilder();
		
		//Get total tokens for use in for loop control
		int totalTokens = strTokenizer.countTokens();
		
		//for as long as there are tokens, add them to noSpaces
		for(int i = 0; i < totalTokens; i++){
			noSpaces.append(strTokenizer.nextToken());
		}
		
		//return number of characters
		return noSpaces.length();
	}
	
	public static int paragraphCount(String str) {
	
		//Trim string
		str = str.trim();
		
		//String Tokenizer using paragraphs as delimeters
		StringTokenizer strTokenizer = new StringTokenizer(str, "\r\n");
		
		//return number of tokens (paragraphs)
		return strTokenizer.countTokens();
	}
	
	public static int sentenceCount(String str) {
	
		//Trim string
		str = str.trim();
		
		//String Tokenizer using sentence ending punctuation as delimeters
		StringTokenizer strTokenizer = new StringTokenizer(str, ".!?");
		
		//return number of tokens (sentences)
		return strTokenizer.countTokens();
	}
	
	public static double sentencesPerParagraph(String str) {
	
		//Trim string
		str = str.trim();
		
		//average number of sentences per paragraph
		return (double)sentenceCount(str)/paragraphCount(str);
	}
	
	public static double wordsPerSentence(String str) {
	
		//Trim string
		str = str.trim();

		//return average number of words per sentence
		return (double)wordCount(str)/sentenceCount(str);
	}
	
	public static double charactersPerWord(String str) {
		
		//Trim string
		str = str.trim();

		//StringTokenizer using punctuation as delimeter
		StringTokenizer strTokenizer = new StringTokenizer(str, " :.!?,\r\n\t");
		
		//hold copy of tokens only, no delimeters
		StringBuilder noPunctuation = new StringBuilder();
		
		//Get total tokens for use in for loop control
		int totalTokens = strTokenizer.countTokens();
		
		//for as long as there are tokens, add them to noPunctuation
		for(int i = 0; i < totalTokens; i++){
			noPunctuation.append(strTokenizer.nextToken());
		}
		
		return (double)noPunctuation.length()/wordCount(str);
	}
}