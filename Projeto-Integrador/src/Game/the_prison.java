package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class the_prison {

	public static void main(String[] args) {

		Scanner imput = new Scanner(System.in);
		int navegacao = 1;

		System.out.println("--------------------------------");
		System.out.println("| | | | | |THE PRISON| | | | | |");
		System.out.println("--------------------------------");

		int opcao;

		do {

			System.out.println("1 - Instru��es do Jogo: ");
			System.out.println("2 - Come�ar o jogo: ");
			System.out.println("3 - Cr�ditos do jogo: ");
			System.out.println("4 - Sair: ");
			System.out.println("Escolha uma op��o: ");
			opcao = imput.nextInt();

			switch (opcao) {

			case 1:
				do {
					System.out.println("--------INSTRU��ES---------");
					System.out.println("1 - Cada quest�o vale 100 pontos de respeito.");
					System.out.println("2 - � necess�rio atingir 500 pontos de respeito para concluir o jogo.");
					System.out.println("3 - Caso erre uma pergunta voc� ir� perder 50 pontos. ");
					System.out.println("----------------------------------------------------------------------");
					System.out.println("Digite 0 para voltar.");
					navegacao = imput.nextInt();

				} while (navegacao != 0);

				break;

			case 2:

				// inicio do jogo
				do {
					System.out.println("\r\n" + // Introdu��o e objetivo inicial do jogo

							"Voc� � um estudante da �rea de TI e acaba de ser preso por hackear uma base militar situada em sua cidade,\r\n"
							+ "como consequ�ncia foi condenado a pris�o e mandado para uma pris�o de seguran�a m�xima no estado do Arizona.\r\n"
							+ "Voc� tem algumas restri��es no pres�dio;\r\n"
							+ "-proibido de acessar qualquer equipamento eletr�nico;\r\n"
							+ "-voc� est� em uma �rea isolada dos outros detentos no n�vel 1 da pris�o;\r\n"
							+ "-voc� est� em uma �rea de seguran�a m�xima onde est� isolado, sem acesso a outros detentos e sem nenhuma regalia.\r\n"
							+ "objetivo do jogo;\r\n"
							+ "o seu objetivo � obter informa��es para acessar os outros n�veis da pris�o, com isso voc� poder� ter acesso \r\n"
							+ "a outras pessoas e recursos para poder sair da pris�o caso n�o seja descoberto.\r\n"
							+ "Boa sorte, detento!");

					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------");
					System.out.println("Digite 0 para voltar e 1 para come�ar o jogo.");
					navegacao = imput.nextInt();
					if (navegacao == 1) {

						boolean acertou = false;
						int contador = 0;

						List alternativa1 = new ArrayList();
						alternativa1.add("boolean.");// correta
						alternativa1.add("byte.");
						alternativa1.add("short.");
						alternativa1.add("long.");
						alternativa1.add("double.");
						
						


						System.out.println("\n");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");
						
						System.out.println("O Guarda Bill Gates est� com dificuldades na faculdade, ajude ele a solucionar esse problema!");
						
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");
						System.out.println("\n");
						
						
						do {
							Collections.shuffle(alternativa1);
							System.out.println("Em Java, uma vari�vel de ponto flutuante � uma vari�vel do tipo: ");
							System.out.println("a) " + alternativa1.get(0));
							System.out.println("b) " + alternativa1.get(1));
							System.out.println("c) " + alternativa1.get(2));
							System.out.println("d) " + alternativa1.get(3));
							System.out.println("e) " + alternativa1.get(4));

							System.out.println("Qual a alternativa certa?: ");
							String resposta = imput.next();

							switch (resposta) {
							case "a":
							case "A":
								if (alternativa1.get(0).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							case "b":
							case "B":
								if (alternativa1.get(1).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							case "c":
							case "C":
								if (alternativa1.get(2).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							case "d":
							case "D":
								if (alternativa1.get(3).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							case "e":
							case "E":
								if (alternativa1.get(4).equals("double.")) {
									System.out.println("Resposta Correta.");
									acertou = true;
								} else {
									System.out.println("Resposta Incorreta.");
								}
								break;
							default:
								System.out.println("Escolha Invalida.");
							}
							contador++;
						} while (!acertou && contador <= 2);
						if((acertou==false)&&(contador==2))System.out.println("GAME OVER.");
						break;

					}
				} while (navegacao != 0);
				break;

			case 3:
				System.out.println("Colocar os cr�ditos do jogo");
				break;

			case 4:
				System.out.println("voc� est� saindo do jogo.");
				break;

			default:
				System.out.println("Op��o inv�lida.");

			}
			
		} while (opcao != 4);

	}

}