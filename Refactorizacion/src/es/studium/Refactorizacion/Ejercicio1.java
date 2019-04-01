package es.studium.Refactorizacion;

public class Ejercicio1 {
	
	public double calcularPrecioConIva(int unidades, double precioUnitario) {
		double resultado = unidades*(precioUnitario*1.21);
		return resultado;
	}
}
