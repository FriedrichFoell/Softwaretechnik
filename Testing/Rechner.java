import java.util.Scanner;

public class Rechner {
	static int Zahl1;
	static int Zahl2;

	public static void main(String[] args) {
		while (true) {

			Scanner s = new Scanner(System.in);
			System.out.println("Bitte geben Sie eine Zahl ein:");
			Zahl1 = s.nextInt();
			System.out.println("Bitte geben Sie noch eine Zahl ein:");
			Zahl2 = s.nextInt();
			System.out.println(
					"Was wollen Sie tun?(1=Wurzel ziehen,2=modulo,3=Potenz,4=Division):");
			int operation = s.nextInt();


			switch (operation) {
			case 1:
				WurzelZiehen(Zahl1,Zahl2);
				break;
			case 2:
				Modulo(Zahl1,Zahl2);
				break;
			case 3:
				Potenz(Zahl1,Zahl2);
				break;
			case 4:
				Division(Zahl1,Zahl2);
				break;
			
			default:

				System.out.println("Illegal Operation.Bitte geben Sie eine Zahl zwischen 1 und 3 ein");
			}}
	}
	public static int WurzelZiehen(int Zahl1, int Zahl2) {
		int c=(int) Math.sqrt(Zahl1);
		int d=(int) Math.sqrt(Zahl1);
		System.out.println("Die Wurzel von: " + Zahl1 +" ist "+c);
		System.out.println("Die Wurzel von: " + Zahl2 +" ist "+d);
		return c;
		
	}
	public static int Modulo(int a, int b) {
		int c=a%b;
		System.out.println("Der Rest der Division ist: " + c);
		return c;
		
	}
	public static int Potenz(int Zahl1, int Zahl2) {
		int c=(int) Math.pow(Zahl1,Zahl2);
		System.out.println(Zahl1+" hoch "+Zahl2+" ist "+c);
		return c;
	}
	public static int Division(int Zahl1,int Zahl2) {
		int c=Zahl1/Zahl2;
		System.out.println("Das Ergebnis ist: "+c);
		return c;
	}
	
}
