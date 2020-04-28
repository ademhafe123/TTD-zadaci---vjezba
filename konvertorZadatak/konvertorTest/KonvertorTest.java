package konvertorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import konvertor.Konvertor;

class KonvertorTest {

	@Test
	public void shouldReturnPoundsWhenInputIsKg() {
		double result = Konvertor.izKilogramaUFunte(1.0);
		assertEquals(2.2, result);
	}
	
	@Test
	public void shouldReturnKgWhenInputIsPounds() {
		double result = Konvertor.izFuntiUKilograme(2.2);
		assertEquals(1, result);
	}
	
	@Test
	public void shouldReturnInchesWhenInputIsCm() {
		double result = Konvertor.izCentUInce(5);
		assertEquals(1.9685, result);
	}
	
	@Test
	public void shouldReturnCmWhenInputIsInches() {
		double result = Konvertor.izInciUCent(1.9685);
		assertEquals(5, result);
	}
	
	@Test
	public void shouldReturnFahrenheiteWhenInputIsCelzijus() {
		double result = Konvertor.izCelzijusaUFahrenheite(5);
		assertEquals(41, result);
	}
	
	@Test
	public void shouldReturnCelzijusWhenInputIsFahrenheit() {
		double result = Konvertor.izFahrenheitaUCelzijuse(41);
		assertEquals(5, result);
	}

}
