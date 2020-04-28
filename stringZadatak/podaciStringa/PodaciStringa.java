package zadatakZaString;

public class PodaciStringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Adem Sinanovic. Imam 18 godina i zivim u Zavidovicima.";

		System.out.println(duzinaStringa(string));
		System.out.println(karakteriNaParnimPozicijama(string));
		System.out.println(karakteriNaNeparnimPozicijama(string));
		System.out.println(brojVelikihKaraktera(string));
		System.out.println(brojMalihKaraktera(string));
		System.out.println(karakteriKojiNisuSlova(string));
	}
	
	public static String stringSaSamoKarakterima(String string) {
		String stringSaSamoKarakterima ="";
		for(int i = 0; i < string.length(); i++) {
			if(Character.isAlphabetic(string.charAt(i))) {
				stringSaSamoKarakterima += string.charAt(i);
			}
		}
		return stringSaSamoKarakterima;
	}

	public static int duzinaStringa(String string) {
		int duzinaStringa = string.length();
		System.out.print("Duzina Stringa: " );
		return duzinaStringa;
	}
	
	public static String karakteriNaParnimPozicijama(String string) {
		String stringSaSamoKarakterima = stringSaSamoKarakterima(string);
		String karakteriNaParnimPozicijama = "";
		for(int i = 0; i < stringSaSamoKarakterima.length(); i++) {
			if(i % 2 !=0) {
				karakteriNaParnimPozicijama += stringSaSamoKarakterima.charAt(i);
			}
		}
		System.out.print("\nKarakteri na parnim pozicijama: " );
		return karakteriNaParnimPozicijama;
	}
	
	public static String karakteriNaNeparnimPozicijama(String string) {
		String stringSaSamoKarakterima = stringSaSamoKarakterima(string);
		String karakteriNaNeparnimPozicijama = "";
		for(int i = 0; i < stringSaSamoKarakterima.length(); i++) {
			if(i % 2 ==0) {
				karakteriNaNeparnimPozicijama += stringSaSamoKarakterima.charAt(i);
			}
		}
		System.out.print("\nKarakteri na neparnim pozicijama: ");
		return karakteriNaNeparnimPozicijama;
	}
	
	public static int brojVelikihKaraktera(String string) {
		int brojVelikihKaraktera = 0;
		for(int i = 0; i < string.length(); i++) {
			if(Character.isUpperCase(string.charAt(i))) {
				brojVelikihKaraktera++;
			}
		}
		System.out.print("\nBroj velikih karaktera: ");
		return brojVelikihKaraktera;
	}
	
	public static int brojMalihKaraktera(String string) {
		int brojMalihKaraktera = 0;
		for(int i = 0; i < string.length(); i++) {
			if(Character.isLowerCase(string.charAt(i))) {
				brojMalihKaraktera++;
			}
		}
		System.out.print("\nBroj malih karaktera: ");
		return brojMalihKaraktera;
	}

	public static String karakteriKojiNisuSlova(String string) {
		String karakteriKojiNisuSlova = "";
		for(int i = 0; i < string.length(); i++) {
			if(!Character.isAlphabetic(string.charAt(i))) {
				karakteriKojiNisuSlova += string.charAt(i);
			}
		}
		System.out.print("\nKarakteri koji nisu slova: " );
		return karakteriKojiNisuSlova;
	}

}


























