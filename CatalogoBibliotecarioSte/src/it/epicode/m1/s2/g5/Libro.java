package it.epicode.m1.s2.g5;

public class Libro extends ElementoCatalogo {
	private final String autore;
	private final String genere;

	public Libro(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
	    super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
	    this.autore = autore;
	    this.genere = genere;
	}

	public String getAutore() {
	    return autore;
	}

	public String getGenere() {
	    return genere;
	}

	@Override
	public String getTipo() {
	    return "Libro";
	}

	@Override
	public String toString() {
	    return super.toString() + "," + autore + "," + genere;
	}

}
