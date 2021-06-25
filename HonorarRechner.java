
public class HonorarRechner {

// bekommt Text (Buch)
//berechnet Honorar aus Anzahl der Zeichen
	
	public static double berechneHonorar(String text) {
		double honorar;		
		double textLängeOhneSpace=text.replace(" ", "").length();
		honorar=textLängeOhneSpace/1000;
		System.out.println("Der Text enthält "+textLängeOhneSpace+" Zeichen");
		System.out.println("Das Honorar für den eingereichten Text beträgt: "+honorar+"€");
		return honorar;
	}

	public static int zähleBilder(String text) {
		int zähler=0;
		int anzahlBilder = 0;
		String[] words = text.split("\\s+");
		for(int i = 0;i<words.length;i++) {
			if(words[i].equals("picture")) {
				zähler++;
			}
		}
		System.out.print("Die Anzahl der Bilder im Text ist: "+zähler);
	    return zähler;

	}
}
