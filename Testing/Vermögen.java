
public class Vermögen {

	public Steuern KB;
	int Vermögen = 1000;

	public Vermögen(Steuern KB) {
		this.KB = KB;
	}

	public int vermögenNachGehalt(int a) {
		int VermögenNeu = KB.Steuerrechner(a) + Vermögen;
		return VermögenNeu;
	}
}
