package main;

import java.util.Scanner;

import game.Muniemon;
import game.Tipos;

public class MainMuniemon {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Muniemon m = new Muniemon();
		Muniemon m2 = new Muniemon();
		Scanner sc = new Scanner(System.in);
		
		boolean q = true;
		do {
		System.out.println();
		System.out.println("===========================================================");
		System.out.println("\t \t Bienvenido usuario ");
		System.out.println("===========================================================");
		System.out.println();
		System.out.println("1.- Dar de alta al primer Muniemon");
		System.out.println("2.- Dar de alta al segundo Muniemon");
		System.out.println("3.- Mostrar el primer Muniemon");
		System.out.println("4.- Mostrar el segundo Muniemon");
		System.out.println("5.- Atacar primer Muniemon a segundo Muniemon");
		System.out.println("6.- Atacar segundo Muniemon a primer Muniemon");
		System.out.println("7.- Salir del programa");

		int i = sc.nextInt();
		
				switch (i) {
				case 1:
						System.out.println();
						System.out.println("Ingrese el nombre del muniemon : ");
							String nomMun = sc.next();
							m.setNombre(nomMun);
						System.out.println("Asigna la vida al numiemon : ");
							int v1 = sc.nextInt();
							m.setVida(v1);
						System.out.println("Agregarle el ataque al numiemon : ");
							int arq1 = sc.nextInt();
							m.setAtaque(arq1);
						System.out.println("Ingrese la defensa de su numiemon : ");
						int def = sc.nextInt();
							m.setDefensa(def);
						System.out.println("El tipo de pokemon solo puede ser AGUA ,FUEGO,PLANTA");
						for (int j = 0; j < Tipos.values().length; j++) {
							System.out.println(j+"-"+Tipos.values()[j]);
						}
						int seleccion = sc.nextInt();
						Tipos tv = Tipos.values()[seleccion];
						System.out.println("A seleccionado: " + tv);
						m.setTipo(tv);
					break;
				case 2:
						System.out.println();
						System.out.println("Ingrese el nombre del muniemon : ");
							String nomMun2 = sc.next();
							m2.setNombre(nomMun2);
						System.out.println("Asigna la vida al numiemon : ");
							int v2 = sc.nextInt();
							m2.setVida(v2);
						System.out.println("Agregarle el ataque al numiemon : ");
							int arq2 = sc.nextInt();
							m2.setAtaque(arq2);
						System.out.println("Ingrese la defensa de su numiemon : ");
							int def2 = sc.nextInt();
							m2.setDefensa(def2);
						System.out.println("El tipo de pokemon solo puede ser AGUA ,FUEGO,PLANTA : ");
						for (int k = 0; k < Tipos.values().length; k++) {
							System.out.println(k+"-"+Tipos.values()[k]);
						}
						int seleccion2 = sc.nextInt();
						Tipos tv2 = Tipos.values()[seleccion2];
						System.out.println("A seleccionado: " + tv2);
						m2.setTipo(tv2);
					break;				
				case 3:
					//Muestra por pantalla al primer muniemon
					System.out.println(m);
					break;
				case 4:
					//Muestra por pantalla el segundo muniemon
					System.out.println(m2);
					break;	
				case 5:
					m.atacarMuniemon(m);
				
					break;	
				case 6:
					m.atacarMuniemon(m2);
					
					break;	
				case 7:
					q = false;
					sc.close();
					System.out.println("Has cerrado el programa");
					break;	
				}
		} while (q );
		
		
		
	}
	

}
