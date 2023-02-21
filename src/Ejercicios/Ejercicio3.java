package Ejercicios;
import java.util.Scanner;

/**
 * @author borealcode (Eduardo Ruà Chamorro)
 */
public class Ejercicio3 {
	public static int leerHorasTrabajadas() {
		Scanner leerHorasTrabajadas = new Scanner(System.in);
		System.out.print("Escribe las horas trabajadas: ");
		int horasTrabajadas = leerHorasTrabajadas.nextInt();
		return horasTrabajadas;
	}

	public static int leerTarifa() {
		Scanner leerTarifa = new Scanner(System.in);
		System.out.print("Escribe la tarifa: ");
		int tarifa = leerTarifa.nextInt();
		return tarifa;
	}

	public static void main(String[] args) {
		int horasTrabajadas = leerHorasTrabajadas(), tarifa = leerTarifa(), sueldo = 0;
		if (horasTrabajadas > 40) { sueldo = (int) ((40 * tarifa) + ((horasTrabajadas - 40) * (tarifa * 1.5))); }
		else { sueldo = horasTrabajadas * tarifa; }
		System.out.println("El sueldo recibido por el trabajador es de: " + sueldo);
	}
}
