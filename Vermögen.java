
public class Verm�gen {

	public Steuern KB;
	int Verm�gen = 1000;

	public Verm�gen(Steuern KB) {
		this.KB = KB;
	}

	public int verm�genNachGehalt(int a) {
		int Verm�genNeu = KB.Steuerrechner(a) + Verm�gen;
		return Verm�genNeu;
	}
}
