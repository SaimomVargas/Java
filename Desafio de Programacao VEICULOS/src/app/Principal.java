package app;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aviao aviao = new Aviao("TECO TECO", 1945, 8, "Boing", "Alemã", 2);
		Automovel automovel = new Automovel("Fiesta", 2014, 5, "Ford", "EUA", 16);
		Barco barco = new Barco("Titanic", 1909, 2435, "Harland & Wolff", "Inglaterra", 0);

		System.out.println("-------------------------------------------------");
		System.out.println("| Desafio de Programacao:VEICULOS       | - | X |");
		System.out.println("-------------------------------------------------");
		System.out.println("|                                               |");
		System.out.println("|                   BEM VINDO                   |");
		System.out.println("|                                               |");
		System.out.println("|                   Feito por:                  |");
		System.out.println("|         saimon Vargas & Henrique Bocca        |");
		System.out.println("|                                               |");
		System.out.println("-------------------------------------------------\n");
		int op;

		do {
			System.out.println("MENU:");
			System.out.println("1 - Avião do forro");
			System.out.println("2 - Automovel");
			System.out.println("3 - Barco");
			System.out.println("0 - Sistema encerrado.");
			op = sc.nextInt();
			switch (op) {
			case 1:
				int op2;

				do {
					System.out.println("MENU:");
					System.out.println("1 - Decolar");
					System.out.println("2 - Pousar");
					System.out.println("3 - Mostrar Detalhes");
					System.out.println("4 - Acelerar");
					System.out.println("0 - Voltar Menu");

					op2 = sc.nextInt();
					switch (op2) {
					case 1:
						System.out.println(aviao.Decolar());
						break;
					case 2:
						System.out.println(aviao.Pousar());
						break;
					case 3:
						System.out.println(aviao);
						break;
					case 4:
						System.out.println(aviao.acelerar());
						break;
					case 0:
						break;
					default:
						System.out.println("\nOpcao invalida.\n");
					}
				} while (op2 != 0);

				break;
			case 2:
				int op3;

				do {
					System.out.println("MENU:");
					System.out.println("1 - Abrir Porta Malas");
					System.out.println("2 - Mostrar Detalhes");
					System.out.println("3 - Acelerar");
					System.out.println("0 - Voltar Menu");

					op3 = sc.nextInt();
					switch (op3) {
					case 1:
						System.out.println(automovel.AbrirPortaMalas());
						break;
					case 2:
						System.out.println(automovel);
						break;
					case 3:
						System.out.println(automovel.acelerar());
						break;
					case 0:
						break;
					default:
						System.out.println("\nOpcao invalida.\n");
					}
				} while (op3 != 0);

				break;
			case 3:
				int op4;

				do {
					System.out.println("MENU:");
					System.out.println("1 - Içar Velas");
					System.out.println("2 - Recolher Velas");
					System.out.println("3 - Mostrar Detalhes");
					System.out.println("4 - Acelerar");
					System.out.println("0 - Voltar Menu");

					op4 = sc.nextInt();
					switch (op4) {
					case 1:
						System.out.println(barco.IcarVelas());
						break;
					case 2:
						System.out.println(barco.RecolherVelas());
						break;
					case 3:
						System.out.println(barco);
						break;
					case 4:
						System.out.println(barco.acelerar());
						break;
					case 0:
						break;
					default:
						System.out.println("\nOpcao invalida.\n");
					}
				} while (op4 != 0);
				break;
			case 0:
				System.out.println("Sistema encerrado. ");
				break;
			default:
				System.out.println("\nOpcao invalida.\n");
			}
		} while (op != 0);
		sc.close();
	}
}