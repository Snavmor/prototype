package persona;

public class MainPrototype {

	public static void main(String[] args) {
	
		//Persona person1 = Persona.getSingletonInstance("Antonio");
		//Persona person2 = Persona.getSingletonInstance("Julio");
		Persona person3 = new Persona("PEPE", 25);
		
		Persona person4 = person3.clone();
		System.out.println(person4.getNombre());
		
		//System.out.println(person1.getNombre());
		//System.out.println(person2.getNombre());

	}

}
