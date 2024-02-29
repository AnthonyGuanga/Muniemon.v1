package game;

import java.util.Scanner;

public class MainMuniemon {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Muniemon m = new Muniemon();
		Scanner sc = new Scanner(System.in);
		
		boolean q = true;
		do {
		
		System.out.println("===========================================================");
		System.out.println("\t \t Bienvenido usuario ");
		System.out.println("===========================================================");
		System.out.println();
		System.out.println("1.- Dar de alta al Muniemon");
		System.out.println("2.- Mostrar el Muniemon");
		System.out.println("3.- Salir del programa");

		int i = sc.nextInt();
		
				switch (i) {
				case 1:
						System.out.println();
						
						System.out.println("Ingrese el nombre del muniemon : ");
						String nomMun = sc.next();
						m.setNombre(nomMun);
						
						System.out.println("Asigna la vida al numiemon");
						int v1 = sc.nextInt();
						m.setVida(v1);
						
						System.out.println("Agregarle el ataque al numiemon");
						String arq1 = sc.next();
						m.setAtaque(arq1);
						
						System.out.println("Ingrese la defensa de su numiemon");
						String def = sc.next();
						m.setDefensa(def);
						
						System.out.println("El tipo de pokemon solo puede ser AGUA ,FUEGO,PLANTA");
						for (int j = 0; j < Tipos.values().length; j++) {
							System.out.println(j+"-"+Tipos.values()[j]);
						}
						int seleccion = sc.nextInt();
						Tipos tv = Tipos.values()[seleccion];
						System.out.println("A seleccionado: " + tv);
					
						
					break;
				case 2:
					
					System.out.println(m);
					
					break;				
				case 3:
					q = false;
					sc.close();
					System.out.println("Has cerrado el programa");
					break;
				}
		} while (q );
		
		
		
	}
	

}
