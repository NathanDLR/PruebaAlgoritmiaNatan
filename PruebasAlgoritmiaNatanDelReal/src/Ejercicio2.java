import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		clasificarPersonas();
	}
	
	// Método para clasificar las personas segun edad y genero
	static void clasificarPersonas() {
		
		// Contadores de mayores y menores de edad, hombres y mujeres
		int mayores18 = 0;
		int menores18 = 0;
		int hombres = 0;
		int mujeres = 0;
		
		int hombresMayores = 0;
		int mujeresMenores= 0;

		// Inicializamos el array de Personas
		ArrayList<Persona> personas = new ArrayList<Persona>();
				
		// Generamos los datos de 50 personas
		for(int i=0; i<50; i++){
			// Creamos una nueva persona
			personas.add(new Persona());
			
			// Datos de la persona 
			//System.out.println(personas.get(i).edad);
			//System.out.println(personas.get(i).genero + "\n");
			
			// Comprobamos si es mayor de edad o no
			if(personas.get(i).edad < 18) {
				menores18++;
				if(personas.get(i).genero == 0) mujeresMenores++; // Mujer menor de edad
			}
			else {
				mayores18++;
				if(personas.get(i).genero == 1) hombresMayores++; // Hombre mayor de edad
			}
			
			// Comprobamos si es hombre o mujer
			if(personas.get(i).genero == 0) mujeres++; else hombres++;
			
		}
		
		// Calculamos el porcentaje de personas mayores de edad y de mujeres
		float porcentajeMayores = (float) mayores18/50*100;
		float porcentajeMujeres = (float) mujeres/50*100;
		
		// Mostramos los resultados obtenidos
		System.out.println("Mayores de edad: " + mayores18);
		System.out.println("Menores de edad: " + menores18);
		System.out.println("Hombres: " + hombres);
		System.out.println("Mujeres: " + mujeres);
		System.out.println("Hombres mayores de edad: " + hombresMayores);
		System.out.println("Mujeres menores de edad: " + mujeresMenores);
		System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
		System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
		
	}
	
}

//Clase persona
class Persona {
	
	int edad;
	int genero;
		
	// Constructores
	public Persona(int edad, int genero) {
		this.edad = edad;
		this.genero = genero;
	}
	
	public Persona() {
		this.edad = (int)(Math.random() * 99 + 1); // Generamos un número aleatorio para la edad
		this.genero = generarGenero();
	}
	
	
	// Metodo para generar de forma aleatoria el genero de la persona
	static int generarGenero() {
		
		int genero = 0;
		
		// El 0 identificara a las mujeres, y el 1 a los hombres
		int rnd = (int)(Math.random() * 10);
		
		if(rnd % 2 == 0){
			genero = 0; 
		}
		else {
			genero = 1;
		}
		
		return genero;
		
	}
			
}