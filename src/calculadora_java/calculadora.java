package calculadora_java;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double a,b;
        String operacao;
		System.out.println("-----------------------------------------------");
		System.out.println("CALCULADORA DE 2 NÚMEROS");
		System.out.println("-----------------------------------------------");
		System.out.println("Digite o primeiro número: ");
		a = scanner.nextDouble();
		System.out.println("Digite o segundo número: ");
		b = scanner.nextDouble();
		System.out.println("Digite a operação sendo (+) para adição, (-) para subtração, (*)para multiplicação e (/) para divisão");
		operacao = scanner.next();
		
		
		double resultado;
		if(operacao.equals("+")) {
			resultado = adicao(a,b);
		}
		else if(operacao.equals("-")) {
			resultado = subtracao(a,b);
		}
		else if(operacao.equals("*")) {
		resultado = multiplicacao(a,b);
		}
		else if(operacao.equals("*/")) {
			resultado = divisao(a,b);
		}
		else {
			resultado = 0;
		}
		System.out.println("Resultado: " + resultado);
		
		
		// TODO Auto-generated method stub

	}
	public  static double  adicao(double a, double b) {
		return a + b;
	}
	public static double subtracao(double a, double b) {
		return a - b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	public static double divisao(double a, double b) {
		return a * b;
	}
	

}
