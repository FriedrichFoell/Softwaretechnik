
public class HonorarRechner {

// bekommt Text (Buch)
//berechnet Honorar aus Anzahl der Zeichen
	
	public static double berechneHonorar(String text) {
		double honorar;		
		double textL�ngeOhneSpace=text.replace(" ", "").length();
		honorar=textL�ngeOhneSpace/1000;
		System.out.println("Der Text enth�lt "+textL�ngeOhneSpace+" Zeichen");
		System.out.println("Das Honorar f�r den eingereichten Text betr�gt: "+honorar+"�");
		return honorar;
	}

	public static int z�hleBilder(String text) {
		int z�hler=0;
		int anzahlBilder = 0;
		String[] words = text.split("\\s+");
		for(int i = 0;i<words.length;i++) {
			if(words[i].equals("picture")) {
				z�hler++;
			}
		}
		System.out.print("Die Anzahl der Bilder im Text ist: "+z�hler);
	    return z�hler;

	}
}
