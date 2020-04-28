package zadatakZaStringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import zadatakZaString.PodaciStringa;
class PodaciStringaTest {
	
	@Test
	public void shouldReturnStringWithOnlyAlphabeticCharsAlways() {
		String result = PodaciStringa.stringSaSamoKarakterima("Adem12314 Sinanovic342");
		assertEquals("AdemSinanovic", result);
	}

	@Test
	public void shouldReturnLenghtOfStringAlways() {
		int result = PodaciStringa.duzinaStringa("Zuta vrata");
		assertEquals(10, result);
	}
	
	@Test
	public void shouldReturnCharsOnEvenPositionsAlways() {
		String result = PodaciStringa.karakteriNaParnimPozicijama("Lijepi dani");
		assertEquals("ieiai", result);
	}

	@Test 
	public void shouldReturnCharsOnOddPositions() {
		String result = PodaciStringa.karakteriNaNeparnimPozicijama("Lijepi dani");
		assertEquals("Ljpdn", result);
	}
	
	@Test
	public void shouldReturnNumOfUppercaseCharsAlways() {
		int result = PodaciStringa.brojVelikihKaraktera("Adem Sinanovic iz Zavidovica");
		assertEquals(3, result);
	}
	
	@Test
	public void shouldReturnNumOfLowercaseCharsAlways() {
		int result = PodaciStringa.brojMalihKaraktera("Adem Sinanovic");
		assertEquals(11, result);
	}
	
	@Test
	public void shouldReturnCharactersThatAreNotAlphabeticAlways() {
		String result = PodaciStringa.karakteriKojiNisuSlova("Imam 7 god., :)");
		assertEquals(" 7 ., :)", result);
	}
	
}
