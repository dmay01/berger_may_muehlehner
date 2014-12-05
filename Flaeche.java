package berger_may_muehlehner;

/**
 * Klasse zur Berechnung von Flaechen
 * 
 * @author Muehlehner Moritz
 * @version 1.2
 */
public class Flaeche {
	private double a, b, c, r;

	/**
	 * Standard-Konstruktor
	 */
	public Flaeche() {
		r = 0;
		a = 0;
		b = 0;
		c = 0;
	}

	/**
	 * Konstruktor fuer ein Rechteck
	 * @param double a, double b
	 */
	public Flaeche(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Konstruktor fuer ein Dreieck
	 * @param double a, double b, double c
	 */
	public Flaeche(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Konstruktor fuer einen Kreis
	 * @param double r
	 */
	public Flaeche(double r) {
		this.r = r;
	}

	/**
	 * Konstruktor fuer ein beliebiges Objekt
	 * @param double a, double b, double c, double r
	 */
	public Flaeche(double a, double b, double c, double r) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.r = r;
	}

	/**
	 * Berechnen der Rechtecksflaeche
	 * @return double
	 */
	public double rechtecksFlaeche() {
		return a * b;
	}

	/**
	 * Berechnen der Kreisflaeche
	 * @return double
	 */
	public double kreisFlaeche() {
		return Math.PI * (r * r);
	}

	/**
	 * Berechnen der Dreiecksflaeche
	 * @return double
	 */
	public double dreiecksFlaeche(){
		double s=(a+b+c)/2);
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
