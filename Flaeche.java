package berger_may_muehlehner;

/**
 * Klasse zur Berechnung von Flaechen
 * @author Muehlehner Moritz
 * @version 1.0
 */
public class Flaeche {
	private double a, b, c, r;
	/**
	 * Konstruktor fuer ein Rechteck
	 */
	public Flaeche(double a, double b){
		this.a=a;
		this.b=b;
	}
	/**
	 * Konstruktor fuer ein Dreieck
	 */
	public Flaeche(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	/**
	 * Konstruktor fuer einen Kreis
	 */
	public Flaeche(double r){
		this.r=r;
	}
	/**
	 * Konstruktor fuer ein beliebiges Objekt
	 */
	public Flaeche(double a, double b, double c, double r){
		this.a=a;
		this.b=b;
		this.c=c;
		this.r=r;
	}
	/**
	 * Berechnen der Rechtecksflaeche
	 */
	public double rechtecksFlaeche(){
		return a*b;
	}
	/**
	 * Berechnen der Kreisflaeche
	 */
	public double kreisFlaeche(){
		return Math.PI*(r*r);
	}
	/**
	 * Berechnen der Dreiecksflaeche
	 */
	public double dreiecksFlaeche(){
		double s=(a+b+c)/2);
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
