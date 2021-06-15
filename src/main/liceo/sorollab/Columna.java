package main.liceo.sorollab;

import java.util.ArrayList;

public class Columna {
	
	private ArrayList<Carta> baraja;
	private ArrayList<Carta> mazo;

	
	

	public Columna() {

		
		baraja = new ArrayList<>();	
	}

	public void ayadeCarta(Carta mazo) {

		this.mazo.add(mazo);

	}

	
}