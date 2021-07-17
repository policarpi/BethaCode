package exercisios_10072021;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class testaWile {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int maiorNumero  = 0, qntImpar =0, qntPar = 0;
	String numerosInformados = "";
	double numeroInformado;
	
	   JFrame frame = new JFrame("JOptionPane exemplo");
	   // Cria o JOptionPane por showMessageDialog
	
	do {
		System.out.print("Informe um numero qualquer ");
		numeroInformado = sc.nextDouble();
			if(numeroInformado != 0) {
				if (numeroInformado % 2 != 0) {
					qntImpar ++;
					} else {
						qntPar ++;
					}
				}
						if(numerosInformados.trim() != "") {
							numerosInformados += ",";
						}
							numerosInformados += numeroInformado;
					
	} while (numeroInformado != 0);
	
//	System.out.println("Numeros informados: " + numerosInformados);
//	System.out.println("Numeros impar: " + qntImpar);
//	System.out.println("Numeros Par: " + qntPar);
	
		JOptionPane.showMessageDialog(frame,
	        "\n Numeros par : " + qntPar + 
	        "\n Numeros impar " + qntImpar +  
	        "\n Numeros informados: " + numerosInformados + 
	        "", "Execio testa wile", 
	        JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
	sc.close();	
	}

}
