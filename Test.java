package berger_may_muehlehner;

import java.util.NoSuchElementException;

/**
 * Testklasse um die Funktionalitaet der anderen Klassen zu testen
 * 
 * @author Daniel May
 * @version 1.0
 *
 */
public class Test {

	/**
	 * Main-methode zum Testen
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Testen der Flaeche Klasse
		// Rechteck
		System.out.print("Flaechen:\nRechteck:\nFlaeche:");
		Flaeche rechteck = new Flaeche(5.4, 2.3);
		System.out.println(rechteck.rechtecksFlaeche());
		// Testen der anderen Flaechen Methoden
		// Sie sollten keine Exceptions werfen
		System.out.println("Andere Flaechenmethoden:\n"
				+ rechteck.kreisFlaeche());
		System.out.println(rechteck.dreiecksFlaeche());

		// Kreis
		System.out.print("Kreis:\nFlaeche:");
		Flaeche kreis = new Flaeche(2.2);
		System.out.println(kreis.kreisFlaeche());
		// Testen der anderen Flaechen Methoden
		// Sie sollten keine Exceptions werfen
		System.out.println("Andere Flaechenmethoden:\n"
				+ kreis.rechtecksFlaeche());
		System.out.println(kreis.dreiecksFlaeche());

		// Dreieck
		System.out.print("Dreieck:\nFlaeche:");
		Flaeche dreieck = new Flaeche(2.2, 5.4, 6.3);
		System.out.println(dreieck.dreiecksFlaeche());
		// Testen der anderen Flaechen Methoden
		// Sie sollten keine Exceptions werfen
		System.out.println("Andere Flaechenmethoden:\n"
				+ dreieck.rechtecksFlaeche());
		System.out.println(dreieck.kreisFlaeche());

		// Testen der Raum Klasse
		// Pyramide
		System.out.print("\nRaeume:\nPyramide:\nRauminhalt:");
		Raum pyramide = new Raum(5.4, 2.3, 3.4);
		System.out.println(pyramide.pyramide());
		// Testen der anderen Raum Methoden
		// Sie sollten keine Exceptions werfen
		System.out.println("Andere Raummethoden:\n" + pyramide.kegel());
		System.out.println(pyramide.quader());

		// Kegel
		System.out.print("Kegel:\nRauminhalt:");
		Raum kegel = new Raum(5.4, 2.3);
		System.out.println(kegel.kegel());
		// Testen der anderen Raum Methoden
		// Sie sollten keine Exceptions werfen
		System.out.println("Andere Raummethoden:\n" + kegel.pyramide());
		System.out.println(kegel.quader());

		// Quader
		System.out.print("Quader:\nRauminhalt:");
		Raum quader = new Raum(5.4, 2.3, 2.4);
		System.out.println(quader.quader());
		// Testen der anderen Raum Methoden
		// Sie sollten keine Exceptions werfen
		System.out.println("Andere Raummethoden:\n" + quader.pyramide());
		System.out.println(quader.kegel());

		// Testen der Zahlen Klasse
		System.out.println("\nZahlen:\nFehlerbehandlung:");
		// erstellen einer leeren Zahlen Klasse
		Zahlen werte = new Zahlen();
		// Nun sollten die min und max Methoden einen Exception werfen
		// Diese catche ich und kann somit das Werfen der Exception ueberpruefen
		try {
			System.out.println(werte.min());
		} catch (NoSuchElementException e) {
			System.out.println("Exception erfolgreich gecatcht!");
		}
		try {
			System.out.println(werte.max());
		} catch (NoSuchElementException e) {
			System.out.println("Exception erfolgreich gecatcht!");
		}
		// die Summenfunktion sollte keine Exception werfen
		try {
			System.out.println(werte.sum());
		} catch (NoSuchElementException e) {
			System.out.println("Exception erfolgreich gecatcht!");
		}
		// nun fuege ich Werte zu den Zahlen Objekt hinzu um die eigentliche
		// Funktionalitaet zu testen
		werte.add(2.3);
		werte.add(5.7);
		werte.add(9.2);
		werte.add(4.7);

		// Summe
		System.out.println("Summe dieser Zahlen:" + werte.sum());
		// Maximum
		System.out.println("Maximum der Zahlen:" + werte.max());
		// Minimum
		System.out.println("Minimum der Zahlen:" + werte.min());
	}
}
