package Aula12.Execicos;

import java.util.Scanner;

public class mainConta {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Conta acc1 =  new Conta(1001,"Alex", 1000.0);
		
		acc1.deposito(-100.00);
		acc1.sacar(100);
		
		
		Conta acc2 = new ContaPoupanca();
		
		Conta x = new Conta(1020, "Alex", 1000.0);
		Conta y = new ContaPoupanca(1020, "Maria", 1000.0, 0.01);
		
		x.Sacar(50.0);
		y.Sacar(50.0);
		
		System.out.println(x.getsaldo());
		System.out.println(y.getsaldo());
		
		
		
	
			
		Conta acc3 = new ContaCorrente(1003, "Bob", 1000.0, 500.0);
		acc3.sacar(200.0);
		System.out.println(acc3.getsaldo());
	
		/*
		Conta acc = new Conta(1001, "Alex", 0.0);
		ContaCorrente bacc = new ContaCorrente(1002, "Maria", 0.0, 500.0);
		
		//Upcating
		
		Conta acc1 = bacc;
		Conta acc2 = new ContaCorrente(1003, "Bob", 0.0, 200.0);
	
		Conta acc3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);
		
	//	Conta acc3 = new SavingConta(1004, "Ana", 0.0, 0.01);
		
		// Dowcastin
		
		ContaCorrente acc4 = (ContaCorrente)acc2;
		acc4.loan(100.0);
		
		ContaCorrente acc5 = (ContaCorrente)acc3;
		
		if (acc3 instanceof ContaCorrente) {
			ContaCorrente acc5 = (ContaCorrente)acc3;
			acc5.loan(200.0);
			
			System.out.println("Loan!!: "+ acc5.getLoanLimit());
		}	
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.updateBalance();
			System.out.println("Update!!");
		}
		
	}*/
		
	}
}