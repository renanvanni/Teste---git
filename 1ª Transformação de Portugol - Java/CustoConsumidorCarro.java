package br.com.generation.lista1;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/
public class CustoConsumidorCarro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b = 0.28, c = 0.45, d, e;
		
		System.out.println("Digite o custo de f�brica: ");
		a = ler.nextDouble();
		
		d = a + (a * b);
		
		e = d + (d * c);
		
		System.out.println("O custo ao consumidor �: " + e);
		
		ler.close();
	}

}
