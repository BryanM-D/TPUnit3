package org.example.ejercicios;

import java.util.List;

public class Facturaciom2 {
	record Factura(String cliente, String fechafactura, List<Double> precioProducto) {}

	public static void main(String[] args) {
		List<Factura> facturas = List.of(
				new Factura("Maria Sannabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D)),
				new Factura("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D)),
				new Factura("Bryan Molina", "Enero 30, 1996", List.of(5000D, 7000D, 4000D))
		);

		for (Factura factura : facturas) {
			double totalValorFactura = calcularTotal(factura);
			imprimirFactura("Factura Generada: ", factura, totalValorFactura);
		}
	}

	static double calcularTotal(Factura factura) {
		double total = 0;
		for (Double precio : factura.precioProducto) {
			total += precio;
		}
		return total;
	}

	static void imprimirFactura(String titulo, Factura factura, double total) {
		System.out.println(titulo);
		System.out.println("Cliente: " + factura.cliente());
		System.out.println("Total: " + total);
		System.out.println();
	}


}