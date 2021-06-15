package main.liceo.sorollab;

public class Carta {

	private Numeros numero;
	private Palos palo;
	private boolean volteada;

	public Carta(Numeros numero, Palos palo,boolean volteada) {
		this.numero = numero;
		this.palo = palo;
		this.volteada=false;
	}
	

	public Numeros getNumero() {
		return numero;
	}

	public void setNumero(Numeros numero) {
		this.numero = numero;
	}

	public Palos getPalo() {
		return palo;
	}

	public void setPalo(Palos palo) {
		this.palo = palo;
	}


	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + ", volteada=" + volteada + "]";
	}

	

}
