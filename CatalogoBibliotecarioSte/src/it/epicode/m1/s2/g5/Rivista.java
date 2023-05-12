package it.epicode.m1.s2.g5;

public class Rivista extends ElementoCatalogo {
	public enum Periodicita {
	    SETTIMANALE,
	    MENSILE,
	    SEMESTRALE
	}

	private final Periodicita periodicita;

	public Rivista(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String periodicita) {
	    super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
	    this.periodicita = Periodicita.valueOf(periodicita.toUpperCase());
	}

	public Periodicita getPeriodicita() {
	    return periodicita;
	}

	@Override
	public String getTipo() {
	    return "Rivista";
	}

	@Override
	public String toString() {
	    return super.toString() + "," + periodicita.name();
	}

}