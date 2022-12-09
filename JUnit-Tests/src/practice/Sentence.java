package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Sentence {

	
	public String[] splitSentence(String message) {

		String delimitations = "[ .,;?!¡¿\'\"\\[\\]]+";
		String[] allTheWords = message.split(delimitations);

		return allTheWords;

	}

	
	public int wordCounter(String message) {

		String delimitations = "[ .,;?!¡¿\'\"\\[\\]]+";
		String[] allTheWords = message.split(delimitations);

		int count = 0;

		for (String words : allTheWords)
			count++;

		return count;

	}

	
	public String[] nonRepeatingWords(String[] sentences) {

		String delimitations = "[ .,;?!¡¿\'\"\\[\\]]+";

		ArrayList <String> nonRepeatedWords = new ArrayList<String>();
		String[] uniqueWords = null;

		// we save each sentence of the Array 'sentences' in the Array 'words'
		String[][] words = new String[sentences.length][];

		// iterate the Array created 'words' to fill it up with each sentence of the array 'sentences'
		for (int i = 0; i < sentences.length; i++) {
			words[i] = sentences[i].split(delimitations);        	
		}
		
		// we compare the words in the entire Array to make sure we're going to take the non-repeating words
		for (int foo = 0; foo < words.length; foo++) {

			for (int bar = 0; bar < words[foo].length; bar++) {

				for (int i = 0; i < words.length; i++) {
					if (i!=foo && !Arrays.asList(words[i]).contains(words[foo][bar])) {
						nonRepeatedWords.add(words[foo][bar]);
					}
				}
			}
		}

		// we're passing the words from an ArrayList to an Array to return it
		uniqueWords = (String[]) nonRepeatedWords.toArray(new String[nonRepeatedWords.size()]);

		return uniqueWords ;
	}

	
}