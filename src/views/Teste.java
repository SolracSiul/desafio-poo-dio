package views;

import helper.Utils;
import model.Cliente;
import model.Conta;
public class Teste {
	
	public static void main(String[] args) {
		
		Cliente Luis = new Cliente(
				"Luis Carlos",
				"crluis444@gmail.com",
				"444.444.444.41",
				Utils.stringParaData("30/01/2000")
				);
		Cliente carlos = new Cliente(
				"Maria Joaquina",
				"Joanajoaquina@gmail.com",
				"223.876.443.32",
				Utils.stringParaData("30/05/1999"));
				
		System.out.println(Luis);
		System.out.println();
		System.out.println(carlos);
		System.out.println("--------");
		Conta c101 = new Conta(Luis);
		Conta c102 = new Conta(carlos);
		
		// Depositando um valor positivo
		c101.depositar(500.00);
		c102.depositar(509.00);
		
		//colocando +200 de limite
		c101.setLimite(200.00);
		
		//efetuar saque
		c101.sacar(550.00);
		
		//testando transferência
		c102.transferir(c101, 200.00);
		System.out.println(c101);
		System.out.println("-------");
		System.out.println(c102);
		
	}
	
}
