import java.util.*;
import java.io.*;

public class ReadabilityDemo {
	public static void main(String[] args) throws FileNotFoundException {
		
		//Scan file contents into memory
		File file = new File(args[0]);
		Scanner inputFile = new Scanner(file);
		inputFile.useDelimiter("\\Z");
		String str = inputFile.next();
		inputFile.close();
		
		//Print the Readability Statistics
		System.out.println("Readability Statistics\n");
		System.out.println("Counts-------------------------------");
		System.out.print("Words\t\t\t\t");
		System.out.println(ReadabilityStatistics.wordCount(str));
		System.out.print("Characters\t\t\t");
		System.out.println(ReadabilityStatistics.characterCount(str));
		System.out.print("Paragraphs\t\t\t");
		System.out.println(ReadabilityStatistics.paragraphCount(str));
		System.out.print("Sentences\t\t\t");
		System.out.println(ReadabilityStatistics.sentenceCount(str));
		System.out.println("\nAverages-----------------------------");
		System.out.print("Sentences per Paragraph\t\t");
		System.out.println(ReadabilityStatistics.sentencesPerParagraph(str));
		System.out.print("Words per Sentence\t\t");
		System.out.println(ReadabilityStatistics.wordsPerSentence(str));
		System.out.print("Characters per Word\t\t");
		System.out.println(ReadabilityStatistics.charactersPerWord(str));
	}
}