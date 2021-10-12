package Aula15;

public class AnimaisFactotory {

	public static void main(String[] args) {
	
		Cachorro rex = new Cachorro ("Pastor Alemao", "Rex");
		UtilitarioDeAnimal.animalFalando(rex);
		System.out.println(rex);
		
		Gato mingau = new Gato ("Siames", "Minguau");
		UtilitarioDeAnimal.animalFalando(mingau);
		System.out.println(mingau);
		
		Galinha gertrudes = new Galinha ();
		UtilitarioDeAnimal.falaPorInterfave(gertrudes);
		UtilitarioDeAnimal.falaPorInterfave(rex);
		System.out.println(gertrudes);
		
		System.out.println(rex);
		
	}
}