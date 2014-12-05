package berger_may_muehlehner;

/**
 * @author M�hlehner Moritz
 *
 */
public class Flaeche {
	private double a, b, c, r;
	/**
	 * Konstruktor f�r ein Rechteck
	 */
	public Flaeche(double a, double b){
		this.a=a;
		this.b=b;
	}
	/**
	 * Konstruktor f�r ein Dreieck
	 */
	public Flaeche(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	/**
	 * Konstruktor f�r einen Kreis
	 */
	public Flaeche(double r){
		this.r=r;
	}
	/**
	 * Konstruktor f�r ein beliebiges Objekt
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
