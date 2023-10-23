package org.example.ejercicios;

public class CalculaAreaTriangulo1 {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(0.5, 5.0, 4.0);
		double areaTriangulo = triangulo.calcularArea();

		System.out.println("Altura del triángulo: " + triangulo.getAltura());
		System.out.println("Base del triángulo: " + triangulo.getBase());
		System.out.printf("Área del triángulo: %.2f", areaTriangulo);
	}

	record Triangulo(double factor, double base, double altura) {
		public double calcularArea() {
			return factor * base * altura;
		}

		public double getBase() {
			return base;
		}

		public double getAltura() {
			return altura;
		}
	}
}