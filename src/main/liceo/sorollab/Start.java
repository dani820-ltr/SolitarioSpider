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
			System.out.println(cartaAleatoria.get(i).toString()+(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Carta> cartas = new ArrayList<Carta>();

		for (Numeros numero : Numeros.values()) {

			for (int i = 0; i < 8; i++) {

				cartas.add(new Carta(numero,Palos.Diamante, false));
			}
		}

		ArrayList<Carta> cartaAleatoria = new ArrayList<Carta>();

		int contador = 0;
		while (!cartas.isEmpty()) {
			int numeroRamdom = (int) Math.floor(Math.random() * cartas.size());
			cartaAleatoria.add(cartas.get(numeroRamdom));
			cartas.remove(numeroRamdom);

			contador++;

		}

		System.out.println("Barajando");

		barajaAleatoria(cartaAleatoria);

		System.out.println(contador);
		
		
		
		Mazo mazos1 = new Mazo(cartaAleatoria);
		

		
		
		for (int i = 0; i <50; i++) {
		//	System.out.println(cartaAleatoria.get(i).getNumero());
			mazos1.ayadeCartaDerecha(new Carta(cartaAleatoria.get(i).getNumero(),Palos.Diamante,false));
			cartaAleatoria.remove(i);
		}
		System.out.println(cartaAleatoria.get(1).getNumero());
		System.out.println( mazos1.getMazoDerecha().size());
		System.out.println(mazos1.getMazoDerecha().get(1).getNumero());
		System.out.println(cartaAleatoria.size());
		
		
		
		
		
		
		
		
		
	}

}
