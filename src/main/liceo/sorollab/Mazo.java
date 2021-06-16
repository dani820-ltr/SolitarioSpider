package main.liceo.sorollab;

import java.util.ArrayList;

public class Mazo {
	private ArrayList<Carta> mazo1=new ArrayList<Carta>();
	private ArrayList<Carta> mazo2=new ArrayList<Carta>();
	private ArrayList<Carta> mazo3=new ArrayList<>();
	private ArrayList<Carta> mazo4=new ArrayList<>();
	private ArrayList<Carta> mazo5=new ArrayList<>();
	private ArrayList<Carta> mazo6=new ArrayList<>();
	private ArrayList<Carta> mazo7=new ArrayList<>();
	private ArrayList<Carta> mazo8=new ArrayList<>();
	private ArrayList<Carta> mazo9=new ArrayList<>();
	private ArrayList<Carta> mazo10=new ArrayList<>();
	private ArrayList<Carta> mazoDerecha;

	public Mazo(ArrayList<Carta> mazoDerecha) {
		this.mazoDerecha = new ArrayList<>();
	}

	public ArrayList<Carta> getMazoDerecha() {
		return mazoDerecha;
	}

	public void setMazoDerecha(ArrayList<Carta> mazoDerecha) {
		this.mazoDerecha = mazoDerecha;
	}

	public void ayadeCarta1(Carta mazo) {

		this.mazo1.add(mazo);

	}
	
	public void ayadeCarta2(Carta mazo) {

		this.mazo2.add(mazo);

	}

	public void ayadeCarta3(Carta mazo) {

		this.mazo3.add(mazo);

	}

	public void ayadeCarta4(Carta mazo) {

		this.mazo4.add(mazo);

	}

	public void ayadeCarta5(Carta mazo) {

		this.mazo5.add(mazo);

	}

	public void ayadeCarta6(Carta mazo) {

		this.mazo6.add(mazo);

	}

	public void ayadeCarta7(Carta mazo) {

		this.mazo7.add(mazo);

	}

	public void ayadeCarta8(Carta mazo) {

		this.mazo8.add(mazo);

	}

	public void ayadeCarta9(Carta mazo) {

		this.mazo9.add(mazo);

	}

	public void ayadeCarta10(Carta mazo) {

		this.mazo10.add(mazo);

	}

	public void ayadeCartaDerecha(Carta mazo) {

		this.mazoDerecha.add(mazo);

	}

}
