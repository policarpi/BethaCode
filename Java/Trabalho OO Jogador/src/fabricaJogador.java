import java.util.Scanner;



public class fabricaJogador {
	public static void main(String[] args) {
		

	Jogador j1 = new Jogador ();
	j1.nome = "Neymar";
	j1.forca = 10;
	Scanner sc = new Scanner(System.in);
	int opcao;
	
	do {
		System.out.println("Jogador:");
		System.out.println("1 - Chutar");
		System.out.println("2 - Dar sogo");
		System.out.println("3 - Beber agua");			
		System.out.println("4 - Comer pão");
		System.out.println("5 - Mostrar jogador ");
		System.out.println("0 - Encerrar Programa");		
		System.out.print("Opção:");
		opcao = sc.nextInt();
		if(opcao == 1) {
			j1.chute();
		}else if(opcao == 2) {
			j1.soco();
		}else if(opcao == 3) {
			j1.beberAgua();
		}else if(opcao == 4) {
			j1.comerPao();
		}else if(opcao == 5) {
			System.out.println(j1);
		}
	}while(opcao != 0);
	}
}
