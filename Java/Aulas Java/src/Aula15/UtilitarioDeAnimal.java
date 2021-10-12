package Aula15;

public class UtilitarioDeAnimal {
	
	public static void animalFalando(Animal objetoAnimal) {
		
		objetoAnimal.falar();
		objetoAnimal.andar();
		
	}
	
	public static void falaPorInterfave(Fala objetoDaInterface) {
		objetoDaInterface.formaDeFalar();
	}

}
