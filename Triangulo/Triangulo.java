package Triangulo;

public class Triangulo {
	private int ladoA, ladoB, ladoC;

	Triangulo(int a, int b, int c) throws TrianguloException {
		
		if (a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (b + c) > a) {
			this.ladoA = a;
			this.ladoB = b;
			this.ladoC = c;
			
		} else {
			throw new TrianguloException("No puede formarse un triángulo con las medidas ingresadas.");
		}
	}

	public String tipoTriangulo() {
		if (ladoA == ladoB && ladoB == ladoC) {
			return new String("Equilátero");
		}

		if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			return new String("Escaleno");
		}

		return new String("Isóceles");
	}
}
