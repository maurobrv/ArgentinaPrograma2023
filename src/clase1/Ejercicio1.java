package clase1;

public class Ejercicio1 {

	public static void main(String[] args) {
		ejercicioA();
		ejercicioB();
		ejercicioC();
		ejercicioD();
	}

	public static void ejercicioA() {
		System.out.println("Ejercicio A");
		int numeroInicio = 5;
		int numeroFin = 14;
		// Se deberían mostrar los números:5,6,7,8,9,10,11,12,13,14
		while (numeroInicio <= numeroFin) {
			System.out.print(numeroInicio + " ");
			numeroInicio = numeroInicio + 1;
		}
		System.out.print("\n\n");
	}

	public static void ejercicioB() {
		System.out.println("Ejercicio B");
		int numeroInicio = 5;
		int numeroFin = 14;
		// Se deberían mostrar los números:5,6,7,8,9,10,11,12,13,14
		while (numeroInicio <= numeroFin) {
			if (numeroInicio % 2 == 0) {
				System.out.print(numeroInicio + " ");
			}
			numeroInicio = numeroInicio + 1;
		}
		System.out.print("\n\n");
	}

	public static void ejercicioC() {
		System.out.println("Ejercicio C");
		int numeroInicio = 5;
		int numeroFin = 14;
		int resto = 1;
		while (numeroInicio <= numeroFin) {
			if (numeroInicio % 2 == resto) {
				System.out.print(numeroInicio + " ");
			}
			numeroInicio = numeroInicio + 1;
		}
		System.out.print("\n\n");
	}
	
	public static void ejercicioD() {
		System.out.println("Ejercicio D");
		int numeroInicio = 5;
		int numeroFin = 14;
		for (int numero = numeroFin; numero >= numeroInicio; numero--) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
		}
		System.out.print("\n\n");
	}
}
