package Ejercicios;

/**
 * @author borealcode (Eduardo Ruà Chamorro)
 */
public class Ejercicio2 {
	public static class Persona {
		public String sexo;
		public int edad;
	}

	public static Persona[] leerPersonas() {
		Persona[] personas = new Persona[50];
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona();
			personas[i].edad = (int) (Math.random() * 100);
			if (Math.random() < 0.5) { personas[i].sexo = "hombre"; }
			else { personas[i].sexo = "mujer"; }
		}
		return personas;
	}
	
	public static int contarMayoresEdad(Persona[] personas) {
		int mayoresEdad = 0;
		for (int i = 0; i < personas.length; i++) {
			if (personas[i].edad >= 18) { mayoresEdad++; }
		}
		return mayoresEdad;
	}

	public static int contarMenoresEdad(Persona[] personas) {
		int menoresEdad = 0;
		for (int i = 0; i < personas.length; i++) {
			if (personas[i].edad < 18) { menoresEdad++; }
		}
		return menoresEdad;
	}

	public static int contarHombresMayoresEdad(Persona[] personas) {
		int hombresMayoresEdad = 0;
		for (int i = 0; i < personas.length; i++) {
			if (personas[i].edad >= 18 && personas[i].sexo == "hombre") { hombresMayoresEdad++; }
		}
		return hombresMayoresEdad;
	}

	public static int contarMujeresMenoresEdad(Persona[] personas) {
		int mujeresMenoresEdad = 0;
		for (int i = 0; i < personas.length; i++) {
			if (personas[i].edad < 18 && personas[i].sexo == "mujer") { mujeresMenoresEdad++; }
		}
		return mujeresMenoresEdad;
	}

	public static double calcularPorcentajeMayoresEdad(Persona[] personas) {
		double porcentajeMayoresEdad = 0;
		for (int i = 0; i < personas.length; i++) {
			if (personas[i].edad >= 18) { porcentajeMayoresEdad++; }
		}
		return porcentajeMayoresEdad / personas.length;
	}

	public static double calcularPorcentajeMujeres(Persona[] personas) {
		double porcentajeMujeres = 0;
		for (int i = 0; i < personas.length; i++) {
			if (personas[i].sexo == "mujer") { porcentajeMujeres++; }
		}
		return porcentajeMujeres / personas.length;
	}

	public static void main(String[] args) {
		Persona[] personas = leerPersonas();
		System.out.println("Cantidad de personas mayores de edad: " + contarMayoresEdad(personas));
		System.out.println("Cantidad de personas menores de edad: " + contarMenoresEdad(personas));
		System.out.println("Cantidad de hombres mayores de edad: " + contarHombresMayoresEdad(personas));
		System.out.println("Cantidad de mujeres menores de edad: " + contarMujeresMenoresEdad(personas));
		System.out.println("Porcentaje de personas mayores de edad: " + calcularPorcentajeMayoresEdad(personas));
		System.out.println("Porcentaje de mujeres: " + calcularPorcentajeMujeres(personas));
	}
}
