package Triangulo;

public class Triangulo {
	private int ladoA, ladoB, ladoC;
	
	Triangulo(int a, int b, int c) {
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}
	
	public String tipoTriangulo() {
		if(ladoA == ladoB && ladoB == ladoC) {
			return new String("Equilátero");
		}
		
		if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			return new String("Escaleno");
		}
		
		return new String("Isóceles");
	}
}
