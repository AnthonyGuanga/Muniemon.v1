package game;

import java.util.Scanner;

public class Muniemon {

	private String nombre;
	private int vida;
	private String	ataque;
	private String defensa;
	private Tipos tipo;
	
	
	
	public Muniemon() {
		super();
	}


	public Muniemon(String nombre, int vida, String ataque, String defensa, Tipos tipo) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipo = tipo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getAtaque() {
		return ataque;
	}
	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}
	public String getDefensa() {
		return defensa;
	}
	public void setDefensa(String defensa) {
		this.defensa = defensa;
	}
	public Tipos getTipo() {
		return tipo;
	}
	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "\t~~~~~~~~~~~~~~~~~MUNIEMON~~~~~~~~~~~~~~~~"+"\r"
				+"\t|"+ "\tMuniemon nombre = " + nombre +"\t\t|\r"
				+"\t|"+ "\tvida = " + vida +"\t\t\t|\r"
				+"\t|"+ "\tataque = " + ataque +"\t\t\t|\r"
				+"\t|"+ "\tdefensa = " + defensa+"\t\t\t|\r"
				+"\t|"+ "\ttipo = " + tipo +"\t\t\t|\r"+
				"\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
				
	}
	
	
	
}
