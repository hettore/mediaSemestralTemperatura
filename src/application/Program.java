package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Double> temperaturas = new ArrayList<>();
		
//		System.out.println("Por favor insira a temperatura media dos seis primeiros meses:");
//		System.out.print("Janeiro: ");
//		temperaturas.add(sc.nextDouble());
//		System.out.print("Fevereiro: ");
//		temperaturas.add(sc.nextDouble());
//		System.out.print("Março: ");
//		temperaturas.add(sc.nextDouble());
//		System.out.print("Abril: ");
//		temperaturas.add(sc.nextDouble());
//		System.out.print("Maio: ");
//		temperaturas.add(sc.nextDouble());
//		System.out.print("Junho: ");
//		temperaturas.add(sc.nextDouble());
		
		System.out.print("Quantos meses vc quer registrar? ");
		int meses = sc.nextInt();
		System.out.print("Por favor insira a temperatura ");
		for (int i = 1; i <= meses; i++) {
			System.out.println("do mês " + i);
			temperaturas.add(sc.nextDouble());
		}
		
		System.out.println(temperaturas);
		
		
		Iterator<Double> iterator = temperaturas.iterator();
		double soma = 0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		double media = soma/temperaturas.size();
		
		System.out.println("A média semestral é: " + String.format("%.2f", media));
		
		System.out.println("Temperaturas acima da média: ");
		for (int i = 0; i < meses; i++) {
			if (temperaturas.get(i) > media) {
				System.out.println("Temperatura "  + temperaturas.get(i) + " no mês: " + (i+1));
			}
		}
	}

}
