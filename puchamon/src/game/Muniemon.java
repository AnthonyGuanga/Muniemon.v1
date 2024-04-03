package game;

public class Muniemon {

	private String nombre;
	private int vida;
	private int	ataque;
	private int defensa;
	private Tipos tipo;
	
	
	
	public Muniemon() {
		super();
	}


	public Muniemon(String nombre, int vida, int ataque, int defensa, Tipos tipo) {
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


	public int getAtaque() {
		return ataque;
	}


	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}


	public int getDefensa() {
		return defensa;
	}


	public void setDefensa(int defensa) {
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
		return "\t\t\r"
				+ "\t~~~~~~~~~~~~~~~~~MUNIEMON~~~~~~~~~~~~~~~~"+"\r"
				+"\t|"+ "\tMuniemon nombre = " + nombre +"\t\t|\r"
				+"\t|"+ "\tvida = " + vida +"\t\t\t|\r"
				+"\t|"+ "\tataque = " + ataque +"\t\t\t|\r"
				+"\t|"+ "\tdefensa = " + defensa+"\t\t\t|\r"
				+"\t|"+ "\ttipo = " + tipo +"\t\t\t|\r"+
				"\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
			
				
	}
	public void atacarMuniemon(Muniemon muniemonB){
		
		Interfaz.principio(this.nombre + " ataca a " + muniemonB.nombre);

		if (this.vida == 0) {
		    System.out.println(this.nombre + " está muerto, no puede atacar");
		} else if (muniemonB.vida == 0) {
		    System.out.println(muniemonB.nombre + " está muerto, no puede atacar");
		} else {
		    int damage = Math.max(0, this.ataque - muniemonB.defensa);
		    muniemonB.vida -= damage;
		    
		    if (damage > 0) {
		        System.out.println("Le quitaste " + damage + " puntos de vida");
		    } else {
		        System.out.println("La defensa de " + muniemonB.nombre + " es superior");
		    }
		    
		    if (muniemonB.vida <= 0) {
		        muniemonB.vida = 0;
		        System.out.println("Mataste a " + muniemonB.nombre);
		    }
		}

		Interfaz.finalde("l ataque");
	}
	
	
}
