package berger_may_muehlehner;

import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Klasse zur Erstellung eines Objektes und Berechnung von Zahlen (Summe,
 * Maximum und Minimum)
 * 
 * @author Daniel May
 * @version 2.1 Exceptions in den Methodenkoepfen deklariert
 * 
 */
public class Zahlen {
	private LinkedList<Double> values;

	/**
	 * Std Konstruktor
	 */
	public Zahlen() {
		this.values = new LinkedList<Double>();
	}

	/**
	 * Konstruktor zum Uebernehmen einer LinkedList
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
	 * @throws NoSuchElementException
	 *             wenn die LinkedList leer ist
	 */
	public double max() throws NoSuchElementException {
		return Collections.max(values);
	}

	/**
	 * Berechnen des Minimums der LinkedList
	 * 
	 * @return Maximum der LinkedList
	 * @throws NoSuchElementException
	 *             wenn die LinkedList leer ist
	 */
	public double min() throws NoSuchElementException {
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
