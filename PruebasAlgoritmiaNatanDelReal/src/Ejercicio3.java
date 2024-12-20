import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		calcularSueldo();
	}

	static void calcularSueldo(){
		
		int sueldo = 0;
		int horasTrabajadas = 0;
		float tarifa = 0;
		
		// Pedimos al usuario que introduzca las horas trabajadas y la tarifa
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Introduzca el número de horas trabajadas:");
			horasTrabajadas = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Introduzca la tarifa para calcular el sueldo:");
			tarifa = Float.parseFloat(scanner.nextLine());
			
			// Calculamos el sueldo del trabajador teniendo en cuenta las horas fijas y extras
			if(horasTrabajadas > 40) {
				// Obtenemos el numero de horas extra trabajadas
				int horasExtra = horasTrabajadas - 40;
				
				sueldo = (int) (40*tarifa * 4); // 40 horas por la tarifa base por 4 semanas
				sueldo += horasExtra*(tarifa*1.5)*4;
			}
			else {
				sueldo = (int) (horasTrabajadas*tarifa * 4); // Multiplicamos por 4 semanas del mes
			}
			
			// Mostramos el sueldo del trabajador
			System.out.println("Su sueldo es " + sueldo + "€ al mes");
			
		} catch (NumberFormatException e) {
			System.out.println("Valor incorrecto");
		}
		
	}
	
	

}
