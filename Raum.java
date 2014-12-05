package berger_may_muehlehner;

/**
 * Klasse zur Erstellung eines Objektes und Berechnung von des Rauminhalts (Pyramide, Kegel und Quader)
 * @author Benedikt Berger
 * @version 1.0
 */
public class Raum {
	
	private double a, b, r, h;
	
	/**
	 * Standard Konstruktor
	 */
	public Raum(){
		this.a=0;
		this.b=0;
		this.r=0;
		this.h=0;
	}
	
	/**
	 * Konstruktor
	 * @param a Seite a
	 * @param b Seite b
	 * @param r Radius
	 * @param h Hoehe
	 */
	public Raum(double a, double b, double r, double h){
		this.a=a;
		this.b=b;
		this.r=r;
		this.h=h;
	}
	
	/**
	 * Konstruktor
	 * @param a Seite a
	 * @param b Seite b
	 * @param h Hoehe
	 */
	public Raum(double a, double b, double h){
		this.a=a;
		this.b=b;
		this.h=h;
	}
	
	/**
	 * Berechnung einer Pyramide
	 * @return Rauminhalt einer Pyramide
	 */
	public double pyramide(){
		return (a*b*h)/3;
	}
	
	/**
	 * Berechnung eines Kegels
	 * @return Rauminhalt eines Kegels
	 */
	public double kegel(){
		return (1/3)*(r*r*Math.PI)*h;
	}

	/**
	 * Berechnung eines Quaders
	 * @return Rauminhalt eines Quaders
	 */
	public double quader(){
		return a*b*h;
	}
}
