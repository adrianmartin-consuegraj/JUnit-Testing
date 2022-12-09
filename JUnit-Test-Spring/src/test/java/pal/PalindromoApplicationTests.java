package pal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class PalindromoApplicationTests {

	@Test
	void test1() {
		
		CheckingPalindromo check = new CheckingPalindromo();
		String message = "hallo";
		
		String expected = "ollah";
		String result = check.method1(message);
		
		assertEquals(expected, result);
	}

}
