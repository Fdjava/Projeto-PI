package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class the_prison {
	static void menu() {

		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | | | | THE  PRISON | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  1 - Instru��es do Jogo:  | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  2 - Come�ar o jogo:      | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  3 - Cr�ditos do jogo:    | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  4 - Sair:                | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | |  Escolha uma op��o:       | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
	}

	static void embaralhar(String Vetor[]) { // funcao que embaralha as alternativas contidas no vetor

		Random random = new Random();

		for (int i = 0; i < Vetor.length; i++) {
			int indice2 = random.nextInt(Vetor.length);
			String posicao = Vetor[i];
			Vetor[i] = Vetor[indice2];
			Vetor[indice2] = posicao;
		}

	}

	public static void main(String[] args) {
		/*
		 * C�DIGO PRINCIPAL!
		 * 
		 * pontoG == pontos ganhos pontoP == pontor perdidos testando, depois mudar
		 * 
		 */
		Scanner imput = new Scanner(System.in);
		Scanner imput2 = new Scanner(System.in);
		int ponto = 500, total = 0, pontoG = 100, pontoP = 50, opcao, navegacao = 1;
		String usuario = "";
		do {
			menu();
			opcao = imput.nextInt();

			switch (opcao) {

			case 1:
				do {
					System.out.println(
							"----------------------------------------------INSTRU��ES-----------------------------------------------");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - Cada quest�o vale 100 pontos de respeito.                             | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - � necess�rio atingir 500 pontos de respeito para concluir o jogo.     | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - Caso erre uma pergunta voc� perde 50 pontos.                          | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | |             - Caso acerte uma pergunta voc� ganha 100 pontos.                       | | | | |");
					System.out.println(
							"| | | | |                                                                                     | | | | |");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Digite 0 para voltar.");
					navegacao = imput.nextInt();

				} while (navegacao != 0);

				break;

			case 2:
				// inicio do jogo
				do {
					System.out.println(
							"----------------------------------------HIST�RIA DO PERSONAGEM-----------------------------------------");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
							"| | | Voc� � um estudante da �rea de TI e acaba de ser preso por hackear uma base militar situada | | |  \r\n"
									+ "| | | em sua cidade, como consequ�ncia foi condenado a pris�o e mandado para uma pris�o de        | | |\r\n"
									+ "| | | seguran�a m�xima no estado do Arizona.                                                      | | |\r\n"
									+ "| | |                                                                                             | | |\r\n"
									+ "| | |   * Voc� tem algumas restri��es no pres�dio;                                                | | |\r\n"
									+ "| | |     - Proibido de acessar qualquer equipamento eletr�nico;                                  | | |\r\n"
									+ "| | |     - Voc� est� em uma �rea isolada dos outros detentos no n�vel 1 da pris�o;               | | |\r\n"
									+ "| | |     - Voc� est� em uma �rea de seguran�a m�xima onde est� isolado,sem acesso a              | | |\r\n"
									+ "| | |     outros detentos e sem nenhuma regalia.                                                  | | |\r\n"
									+ "| | |                                                                                             | | |\r\n"
									+ "| | |   * Objetivo do jogo;                                                                       | | |\r\n"
									+ "| | |     O seu objetivo � obter informa��es para acessar os outros n�veis da pris�o,             | | |\r\n"
									+ "| | |     com isso voc� poder� ter acesso a outras pessoas e recursos para poder sair da pris�o,  | | |\r\n"
									+ "| | |     caso n�o seja descoberto.                                                               | | |\r\n"
									+ "| | |                                                                                             | | |\r\n"
									+ "| | |     Boa sorte, detento!                                                                     | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Digite 0 para voltar e 1 para come�ar o jogo.");

					navegacao = imput.nextInt();
					if (navegacao == 1) {
//1 questao
						System.out.println("Informe seu nome detento:");
						usuario = imput2.next();
						boolean acertou = false;
						int contador = 0;
						String alternativa1[] = new String[5];
						alternativa1[0] = "boolean.";
						alternativa1[1] = "byte.";
						alternativa1[2] = "short.";
						alternativa1[3] = "long.";
						alternativa1[4] = "double.";// correta

						System.out.println("\n");
						System.out.println(
								"-------------------------------------------------------------------------------------------------------");
						System.out.println(
								"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
						System.out.println(
								"| | |                                                                                             | | |");
						System.out.println(
								"| | | (Guarda) Bill Gates: Est� com dificuldades na faculdade, ajude ele a solucionar             | | |\r\n"
								+"| | |                      esse problema!                                                         | | |");
						System.out.println(
								"| | |                                                                                             | | |");
						System.out.println(
								"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
						System.out.println(
								"-------------------------------------------------------------------------------------------------------");
						System.out.println("\n");

						do {
							System.out.println("Em Java, uma vari�vel de ponto flutuante � uma vari�vel do tipo: ");
							System.out.println("\n");
							embaralhar(alternativa1);
							System.out.println("a) " + alternativa1[0]);
							System.out.println("b) " + alternativa1[1]);
							System.out.println("c) " + alternativa1[2]);
							System.out.println("d) " + alternativa1[3]);
							System.out.println("e) " + alternativa1[4]);
							System.out.println("\n");
							System.out.print("Qual a alternativa certa?: ");
							String resposta = imput.next();

							System.out.println("\n");
							switch (resposta) {
							case "a":
							case "A":
								if (alternativa1[0] == ("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n"); // testando, para ver se roda certo.
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n"); // testando, para ver se raoda certo.
								}
								break;
							case "b":
							case "B":
								if (alternativa1[1].equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "c":
							case "C":
								if (alternativa1[2].equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "d":
							case "D":
								if (alternativa1[3].equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "e":
							case "E":
								if (alternativa1[4].equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							default:
								System.out.println("\n");
								System.out.println("Escolha Invalida.");
								System.out.println("\n");
							}
							contador++;
						} while (!acertou && contador <= 2);
						if (acertou == false) {
							System.out.println("GAME OVER.");
							break;

						}

					}
					System.out.println("Parab�ns voce passou do primeiro n�vel.");
					System.out.println("Digite 1 para continuar.");
					navegacao = imput.nextInt();
					if (navegacao == 1) {
//2 questao
						boolean acertou = false;
						int contador = 0;
						String alternativa2[] = new String[5];
						alternativa2[0] = "int, string, long e real.";
						alternativa2[1] = "char, int, real e bit.";
						alternativa2[2] = "boolean, double, float e byte."; // resposta correta
						alternativa2[3] = "real, short, long e char.";
						alternativa2[4] = "string, long int, short int e float.";

						System.out.println("\n");
						System.out.println(
								"-------------------------------------------------------------------------------------------------------");
						System.out.println(
								"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
						System.out.println(
								"| | |                                                                                             | | |");
						System.out.println(
								"| | | (Guarda)Mark Zuckerberg: Minha filha est� tendo problemas para resolver um                  | | |\r\n"
										+ "| | |                          exerc�cio da escola, me ajude com isto e posso                     | | |\r\n"
										+ "| | |                          conseguir com que voc� possa acessar outra ala da pris�o,          | | |\r\n"
										+ "| | |                          mas nada al�m disso detento!                                       | | |");
						System.out.println(
								"| | |                                                                                             | | |");
						System.out.println(
								"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
						System.out.println(
								"-------------------------------------------------------------------------------------------------------");
						System.out.println("\n");

						do {
							System.out.println("S�o tipos primitivos da linguagem Java: ");
							System.out.println("\n");
							embaralhar(alternativa2);
							System.out.println("a) " + alternativa2[0]);
							System.out.println("b) " + alternativa2[1]);
							System.out.println("c) " + alternativa2[2]);
							System.out.println("d) " + alternativa2[3]);
							System.out.println("e) " + alternativa2[4]);

							System.out.println("\n");
							System.out.print("Qual a alternativa certa?: ");
							String resposta = imput.next();

							System.out.println("\n");
							switch (resposta) {
							case "a":
							case "A":
								if (alternativa2[0]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG; //
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");// testando, para ver se roda certo.
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");// testando, para ver se raoda certo.
								}
								break;
							case "b":
							case "B":
								if (alternativa2[1]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "c":
							case "C":
								if (alternativa2[2]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "d":
							case "D":
								if (alternativa2[3]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "e":
							case "E":
								if (alternativa2[4]==("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => " + usuario);
									System.out.println("|" + total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							default:
								System.out.println("\n");
								System.out.println("Escolha Inv�lida.");
								System.out.println("\n");
							}
							contador++;
						} while (!acertou && contador <= 2);
						if (acertou == false) {
							System.out.println("GAME OVER.");
							break;

						}
						System.out.println("Parab�ns voce passou do segundo n�vel.");
						System.out.println("Digite 1 para continuar.");
						navegacao = imput.nextInt();
//3 questao	
						if (navegacao == 1) {
							acertou = false;
							contador = 0;

							String alternativa3[] = new String[5];
							alternativa3[0] = "100";
							alternativa3[1] = "120";
							alternativa3[2] = "50"; // resposta correta
							alternativa3[3] = "60";
							alternativa3[4] = "110";

							System.out.println("\n");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | (Guarda)Alan Turing: Algoritmo? este nome me parece familiar...                             | | |\r\n"
									+"| | |                      pode refrescar minha mem�ria?                                          | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								embaralhar(alternativa3);
								System.out.println("Um determinado algoritmo recebe dois valores e armazena\r\n"
										+ "nas vari�veis A e B, em sequ�ncia faz o seguinte processamento \r\n"
										+ "math.pow(A, B)/2  supondo que A <- 10 e B <-2 \r\n"
										+ "qual seria a sa�da de dados? \r\n");
								System.out.println("\n");

								System.out.println("a) " + alternativa3[0]);
								System.out.println("b) " + alternativa3[1]);
								System.out.println("c) " + alternativa3[2]);
								System.out.println("d) " + alternativa3[3]);
								System.out.println("e) " + alternativa3[4]);

								System.out.println("\n");
								System.out.print("Qual a alternativa certa?: ");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa3[0] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG; //
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");// testando, para ver se roda certo.
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");// testando, para ver se roda certo.
									}
									break;
								case "b":
								case "B":
									if (alternativa3[1] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa3[2] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa3[3] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa3[4] == ("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => " + usuario);
										System.out.println("|" + total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Inv�lida.");
									System.out.println("\n");
								}
								contador++;
							} while (!acertou && contador <= 2);
							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;

							}
						}
						System.out.println("Parab�ns voc� passou do terceiro n�vel.");
						System.out.println("Digite 1 para continuar.");
						navegacao = imput.nextInt();
//Quest�o 4	Marcus V.						
						if (navegacao == 1) {

							acertou = false;
							contador = 0;

							String alternativa4[] = new String[5];
							alternativa4[0] = "10";
							alternativa4[1] = "15"; // resposta correta
							alternativa4[2] = "20";
							alternativa4[3] = "25";
							alternativa4[4] = "30";

							System.out.println("\n");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println("| | | (Guarda) Steve Jobs ...");
							System.out.println(
									"| | |                                                                                             | | |");
							System.out.println(
									"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
							System.out.println(
									"-------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								embaralhar(alternativa4);

								System.out.println("Analise o trecho do algoritmo abaixo.\r\n" + "\r\n"
										+ "Algoritimo\r\n" + "Var\r\n" + "valor1, valor2 :inteiro\r\n" + "Inicio\r\n"
										+ "valor1 <- 10\r\n" + "valor2 <- 20\r\n" + "Se(valor2 > valor1)\r\n"
										+ "valor2 <- valor1+valor2/2\r\n" + "Fim-Se\r\n" + "Escreva valor2\r\n"
										+ "Fim");
								System.out.println("\n");
								System.out
										.println("Assinale a alternativa correta, em rela��o � sa�da do c�digo acima.");
								System.out.println("\n");

								System.out.println("a) " + alternativa4[0]);
								System.out.println("b) " + alternativa4[1]);
								System.out.println("c) " + alternativa4[2]);
								System.out.println("d) " + alternativa4[3]);
								System.out.println("e) " + alternativa4[4]);
								System.out.println("\n");
								System.out.println("Qual � a alternativa correta?");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa4[0] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "b":
								case "B":
									if (alternativa4[1] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa4[2] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa4[3] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa4[4] == ("15")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|ID => %s |Pontos => %d |", usuario, total);
										// System.out.printf("|ID => %s |",usuario);
										// System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Inv�lida.");
									System.out.println("\n");
								}
								contador++;
							} while ((!acertou) && (contador <= 2));

							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;
							}
// Quest�o 05
							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa5[] = new String[5];
								alternativa5[0] = "Linguagem de programa��o.";
								alternativa5[1] = "Estrutura sequencial.";
								alternativa5[2] = "Sequ�ncia de passos l�gicos."; // resposta correta
								alternativa5[3] = "IDE muito utilizada por programadores experientes.";
								alternativa5[4] = "Matem�tica aplicada a TI.";

								System.out.println("\n");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println("| | | (Diretor) Gavin Belson... ");
								System.out.println(
										"| | |                                                                                             | | |");
								System.out.println(
										"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
								System.out.println(
										"-------------------------------------------------------------------------------------------------------");
								System.out.println("\n");

								do {
									embaralhar(alternativa5);
									System.out.println(" O que � um algoritmo?");
									System.out.println("\n");
									System.out.println("a) " + alternativa5[0]);
									System.out.println("b) " + alternativa5[1]);
									System.out.println("c) " + alternativa5[2]);
									System.out.println("d) " + alternativa5[3]);
									System.out.println("e) " + alternativa5[4]);

									System.out.println("\n");

									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta! ");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa5[1] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa5[2] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa5[3] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa5[4] == ("Sequ�ncia de passos l�gicos.")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("ID => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inv�lida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
								System.out.println("Parab�ns voc� escapou da pris�o!!");
								System.out.println("Digite 0 para continuar.");
								navegacao = imput.nextInt();

							}
						}

						// Proxima Quest�o exemplo.
						// do {
						// Collections.shuffle(alternativa1);
						// S�o tipos primitivos da linguagem Java:

						// A) int, string, long e real.
						// B) char, int, real e bit.
						// C) boolean, double, float e byte.
						// D) real, short, long e char.
						// E) string, long int, short int e float.

						// contador++;
						// }while (!acertou));

					}
				} while (navegacao != 0);
				break;

			case 3:
				do {
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
							"| | |                                      Desenvolvido por:                                      | | |");
					System.out.println(
							"| | |                                      Felipe Dias                                            | | |");
					System.out.println(
							"| | |                                      Ji Hye Koo                                             | | |");
					System.out.println(
							"| | |                                      Marcus Vinicius                                        | | |");
					System.out.println(
							"| | |                                      Pedro Henrique                                         | | |");
					System.out.println(
							"| | |                                                                                             | | |");
					System.out.println(
							"| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println("\r\n");
					System.out.println("Digite 0 para voltar para o menu.");
					navegacao = imput.nextInt();
				} while (navegacao != 0);

				break;

			case 4:
				System.out.println("voc� est� saindo do jogo...");
				break;

			default:
				System.out.println("Op��o inv�lida.");

			}

		} while (opcao != 4);

	}

}