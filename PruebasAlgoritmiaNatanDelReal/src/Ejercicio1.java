import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println(parImpar());
	}
	
	
	// Metodo que lee un numero y determina si es par o impar
	static String parImpar() {
		
		String numerosDescendientes = "";
		
		// Pedimos al usuario que introduzca un número entero
		System.out.println("Por favor, introduzca un número entero");
		
		// Leemos el valor que introduce el usuario asegurandonos que sea un numero entero
		Scanner scanner = new Scanner(System.in);
		try {
			
			int numero = Integer.parseInt(scanner.nextLine());
			// Si el número es par, escribimos todos los pares desde sí mismo hasta 0
			if(numero % 2 == 0) {
				for(int i=numero; i >= 0; i-=2) {
					numerosDescendientes += i + " " ;
				}
			}
			
			// Si el número es impar, escribimos todos los impares desde sí mismo hasta 1
			else {
				for(int i=numero; i >= 1; i-=2) {
					numerosDescendientes += i + " " ;
				}
			}
			
		} catch (NumberFormatException e) {
			numerosDescendientes = "Valor incorrecto";
		}
		
		return numerosDescendientes;
	}

}
