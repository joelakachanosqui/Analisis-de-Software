package Triangulo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ladoA, ladoB, ladoC;
		String tipoTriangulo;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del primer lado: ");
		ladoA = scanner.nextInt();
		
		System.out.println("Ingrese el valor del segundo lado: ");
		ladoB = scanner.nextInt();
		
		System.out.println("Ingrese el valor del tercer lado: ");
		ladoC = scanner.nextInt();
		
		scanner.close();
		
		if(ladoA <0 || ladoB <0 || ladoC <0) {
			System.out.println("Error: El valor ingresado debe ser mayor a cero");
			return;
		} 
		
		Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
		
		tipoTriangulo = triangulo.tipoTriangulo();
		
		System.out.println("El triangulo es " + tipoTriangulo);
	}
	
}
