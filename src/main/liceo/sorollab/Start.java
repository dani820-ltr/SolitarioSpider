package main.liceo.sorollab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {
	public static void baraja(ArrayList<Carta> carta) {
		for (int i = 0; i < carta.size(); i++) {
			System.out.println(carta.get(i).toString());
		}
	}

	public static void barajaAleatoria(ArrayList<Carta> cartaAleatoria) {
		for (int i = 0; i < cartaAleatoria.size(); i++) {
			System.out.println(cartaAleatoria.get(i).toString() + (i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Carta> cartas = new ArrayList<Carta>();

		for (Numeros numero : Numeros.values()) {

			for (int i = 0; i < 8; i++) {

				cartas.add(new Carta(numero, Palos.Diamante, false));
			}
		}

		Collections.shuffle(cartas);

		System.out.println("Barajando");

		System.out.println("--------------------------");
		Mazo mazos1 = new Mazo(cartas);

		barajaAleatoria(cartas);

		int i = 0;
		System.out.println(cartas.size());

		while (i != 50) {

			// System.out.println(cartaAleatoria.get(i).getNumero());

			mazos1.ayadeCartaDerecha(new Carta(cartas.get(i).getNumero(), Palos.Diamante, false));
			cartas.remove(i);
			i++;

		}
		System.out.println(mazos1.getMazoDerecha().size());
		System.out.println(mazos1.getMazoDerecha().get(1).getNumero());

		int j = 0;
		while (j != 0) {

			if (j <= 6) {
				mazos1.ayadeCarta1(new Carta(cartas.get(j).getNumero(), Palos.Diamante, false));
				j++;
			}

		}
		
		
		System.out.println("");
		
		
		
		
		
	}
}
