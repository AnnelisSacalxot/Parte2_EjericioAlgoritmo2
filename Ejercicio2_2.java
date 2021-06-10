import java.util.*;

public class Ejercicio2_2 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		int num, contador = 0;

		System.out.println("Ingrese un número entero: ");
		num = leer.nextInt();


//Hacemos un ciclo para poder imprimir nuestros números

		for (contador = 1; contador <= num ;contador++ ) {
			System.out.println("Los números desde 1 hasta el número que ingreso son: "+contador);
		}


	}
}