package berger_may_muehlehner;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Klasse zur Erstellung eines Objektes und Berechnung von Zahlen (Summe,
 * Maximum und Minimum)
 * 
 * @author Daniel May
 * @version 2.0 added the functionality
 * 
 */
public class Zahlen {
	private LinkedList<Double> values;

	/**
	 * Std Konstruktor
	 * 
	 * @param values
	 *            LinkedList die uebernommen werden soll
	 */
	public Zahlen(LinkedList<Double> values) {
		this.values = values;
	}

	/**
	 * Zahl zu der LinkedList hinzufuegen
	 * 
	 * @param z
	 *            hinzuzufuegende Zahl
	 */
	public void add(double z) {
		values.add(z);
	}

	/**
	 * Berechnen des Maximums der LinkedList
	 * 
	 * @return Maximum der LinkedList
	 */
	public double max() {
		return Collections.max(values);
	}

	/**
	 * Berechnen des Minimums der LinkedList
	 * 
	 * @return Maximum der LinkedList
	 */
	public double min() {
		return Collections.min(values);
	}

	/**
	 * Berechnen der Summe der in der LinkedList enthaltenen Zahlen
	 * 
	 * @return Summe
	 */
	public double sum() {
		double tmp = 0.0;
		for (double d : values) {
			tmp += d;
		}
		return tmp;
	}
}
