package kalkulatorTest;

import kalkulator.Main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	
	Main main = new Main();

	@Test
	public void shouldReturnSumWhenThereAreNums() {
		int result = Main.addNums(2, 3);
		assertEquals(5, result);
	}
	
	@Test
	public void shouldReturnSubtractedNumsWhenTheyExist() {
		int result = Main.subtractNums(12, 3);
		assertEquals(9, result);
	}

	@Test
	public void shouldReturnMultiplicatedNumsWhenTheyExist() {
		int result = Main.multiplicateNums(3, 4);
		assertEquals(12, result);
	}
	
	@Test
	public void shouldReturnDividedNumsWhemTheyExist() {
		int result = Main.divideNums(12, 3);
		assertEquals(4, result);
	}
	
}
