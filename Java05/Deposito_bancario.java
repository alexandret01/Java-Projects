package Java05;

import java.util.Scanner;
import Java05.Deposito;

public class Deposito_bancario {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Digite o Numero da conta: ");
		int Number = Scanner.nextInt();
		
		System.out.println("Digite Seu Nome: ");
		String Nome = Scanner.next();
		
		System.out.println("Deseja fazer um Deposito? (y/n)");
		char y = Scanner.next().charAt(0);
		
		if (y == 'n')
			System.out.printf("Obrigado");
		else {
			
			System.out.println("Digite o Valor do Primeiro Deposito");
			double Saldo = Scanner.nextDouble();
			Deposito deposito = new Deposito(Number, Nome, Saldo);
			
			deposito.setNumber(Number);
			deposito.setNome(Nome);
			deposito.setSaldo(Saldo);
		
		while(y == 'y'){
			
			System.out.println("Dados da Conta: ");
			System.out.println(deposito.toString());
			
			System.out.println("Deseja Fazer outro Deposito? (y/n)");
			char n = Scanner.next().charAt(0);
			n = (n == 'n')? n = 'n' : n;
			
			if (n == 'y') {
			System.out.println("Digite o Valor do Deposito:");
			Saldo = Scanner.nextDouble();
			deposito.Deposito(Saldo);
			
			System.out.println("Dados da Conta: ");
			System.out.println(deposito.toString());
			} else {System.out.println("Obrigado"); break;}
			
			System.out.println("Deseja fazer um Saque? (y/n)");
			char s = Scanner.next().charAt(0);
			s = (s == 'n')? s = 'n' : n;
			
			if (s == 'y') {
				System.out.println("Digite o Valor do saque");
				Saldo = Scanner.nextDouble();
				deposito.Saque(Saldo);
				} else {System.out.println("Obrigado"); break;}
		}
	}
	Scanner.close();	
	}
}
