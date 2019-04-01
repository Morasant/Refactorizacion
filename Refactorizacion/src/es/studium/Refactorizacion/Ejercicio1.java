package es.studium.Refactorizacion;

public class Ejercicio1 {
	
	final double IVA = 1.21;
	
	public double calcularPrecio(int unidades, double precioUnitario) {
		double precioSinIva = unidades*(precioUnitario);
		double precioConIva = precioSinIva*IVA;
		return precioConIva;
	}
}
