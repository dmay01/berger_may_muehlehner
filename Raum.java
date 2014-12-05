package berger_may_muehlehner;

/**
 * Klasse zur Erstellung eines Objektes und Berechnung von des Rauminhalts (Pyramide, Kegel und Quader)
 * @author Benedikt Berger
 * @version 1.0
 */
public class Raum {
	
	/**
	 * Berechnung einer Pyramide
	 */
	public static double pyramide(double seite, double hoehe){
		return (seite*seite*hoehe)/3;
	}
	
	public double kegel(double grundf, double hoehe){
		return (1/3)*grundf*hoehe;
	}

	public double quader(double seite){
		return seite*seite*seite;
	}

	/**
	 * main-Methode
	 */
	public static void main(String[] args) {
		System.out.println(pyramide(3,2));
	}
	
}
