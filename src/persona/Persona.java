package persona;

public class Persona implements IPrototype {

	private String nombre;
	// private static Persona persona;
	private int edad;
	
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("Mi nombre es " + this.nombre);
	}
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override		//Devuelve un nuevo objeto con los mismos valores que el original.
	public Persona clone() {
		return new Persona(this.nombre, this.edad);
		
		
	}
	
	
}
