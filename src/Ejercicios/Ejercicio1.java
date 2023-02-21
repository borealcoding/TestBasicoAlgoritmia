package Ejercicios;
import java.util.Scanner;

/**
 * @author borealcode (Eduardo Ruà Chamorro)
 */
public class Ejercicio1 {
	public static int leerNumero() {
		Scanner leerNumero = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		int numero = leerNumero.nextInt();
		leerNumero.close();
		return numero;
	}
	
	public static void main(String[] args) {
		int numeroRecogido = leerNumero();
		if (numeroRecogido % 2 == 0) {
			System.out.println("Numero par!\n--- LISTA DE PARES EN ORDEN DESCENDENTE ---");
			for (int n = numeroRecogido; n >= 0; n--) {
				if (n % 2 == 0) { System.out.println(n); }
			}
		} else {
			System.out.println("Numero impar!\n--- LISTA DE IMPARES EN ORDEN DESCENDENTE ---");
			for (int n = numeroRecogido; n >= 1; n--) {
				if (n % 2 != 0) { System.out.println(n); }
			}
		}
	}
}
