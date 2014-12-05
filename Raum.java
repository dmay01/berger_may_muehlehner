package berger_may_muehlehner;

/**
 * Klasse zur Erstellung eines Objektes und Berechnung von des Rauminhalts (Pyramide, Kegel und Quader)
 * @author Benedikt Berger
 * @version 1.0
 */
public class Raum {
	
	private double a, b, c, r, h;
	
	/**
	 * Standard Konstruktor
	 */
	public Raum(){
		this.a=0;
		this.b=0;
		this.c=0;
		this.r=0;
		this.h=0;
	}
	
	/**
	 * Konstruktor
	 */
	public Raum(double a, double b, double c, double r, double h){
		this.a=a;
		this.b=b;
		this.c=c;
		this.r=r;
		this.h=h;
	}
	
	/**
	 * Konstruktor
	 */
	public Raum(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	/**
	 * Berechnung einer Pyramide
	 */
	public double pyramide(){
		return (a*a*h)/3;
	}
	
	/**
	 * Berechnung eines Kegels
	 */
	public double kegel(){
		return (1/3)*(r*r*Math.PI)*h;
	}

	/**
	 * Berechnung eines Quaders
	 */
	public double quader(){
		return a*b*c;
	}
}
