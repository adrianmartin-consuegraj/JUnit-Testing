package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import practice.Sentence;

class TestSentence {
	

	@Test //message expected
	public void test1() {
		
		Sentence sent = new Sentence();
		String message = "hi, how are you doing?";
		
		String[] expected = {"hi", "how", "are", "you", "doing"};
		String[] result = sent.splitSentence(message);
		
		assertArrayEquals(expected, result);
		
	}
	
	
	@Test //count the words of the sentence given
	public void test2() {
		
		Sentence sent = new Sentence();
		String message = "it seems like today is going to be a great day!";
		
		int expected = 11;
		int result = sent.wordCounter(message);
		
		assertEquals(expected, result);
		
	}
	
	
	@Test //Select only non-repeating words
	public void test3() {
		
		Sentence sent = new Sentence();
		
		String[] sentences = {"I have a black car", "I have a white cat"};
		
		String[] expected = {"black", "car", "white", "cat"};
		String[] result = sent.nonRepeatingWords(sentences);
		
		assertArrayEquals(expected, result);
		
	}


}