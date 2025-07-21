package calculadora;

import java.util.Scanner;

public class CalculadoraApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Double valorUm;
		Double valorDois;
		String operacao;
		boolean continuar;
		
		do {
			System.out.println("Digite o valor um:");
			valorUm = scan.nextDouble();
			
			System.out.println("Digite a operação (+, -, *, /):");
			operacao = scan.next();
			
			System.out.println("Digite o valor dois:");
			valorDois = scan.nextDouble();
			
			System.out.println("Resultado:" + realizarCalculo(valorUm, valorDois, operacao));
			
			continuar = verificarNovaOperacao();
		}while(continuar);
	}
	
	public static boolean verificarNovaOperacao() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Deseja realizar uma nova operação? (S/N):");
		String resposta = scan.nextLine();
		
		if(resposta.equals("N")) {
			System.out.println("Obrigado por utilizar a calculadora, volte sempre!");
			return false;
		}
		
		return true;
	}

	public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
		Double respostaCalculo = 0.0;
		
		switch(operacao) {
		
		case "+":
			respostaCalculo = valorUm + valorDois;
			break;
			
		case "-":
			respostaCalculo = valorUm - valorDois;
			break;
			
		case "*":
			respostaCalculo = valorUm * valorDois;
			break;
			
		case "/":
			respostaCalculo = valorUm / valorDois;
			break;
			
			default:
				System.out.println("Operação inválida, tente novamente!");
		}
		
		return respostaCalculo;
	}
}
