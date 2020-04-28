package konvertor;

import java.util.Scanner;

public class Konvertor {
	
	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
		
	}

	
	public static double izKilogramaUFunte(double kg) {
		double result = kg * 2.2;
		System.out.println(result);
		return result;
	}
	
	public static double izFuntiUKilograme(double funte) {
		double result = funte / 2.2;
		System.out.println(result);
		return result;
	}
	
	public static double izCentUInce(double cm) {
		double result = cm * 0.3937;
		System.out.println(result);
		return result;
	}
	
	public static double izInciUCent(double inci) {
		double result = inci / 0.3937;
		System.out.println(result);
		return result;
	}
	
	public static double izCelzijusaUFahrenheite(double celzijus) {
		double result = celzijus * 1.8 + 32;
		System.out.println(result);
		return result;
	}

	public static double izFahrenheitaUCelzijuse(double fahrenheit) {
		double result = (fahrenheit - 32) / 1.8;
		System.out.println(result);
		return result;
	}














}
