package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class the_prison {

	public static void main(String[] args) {
<<<<<<< HEAD

		Scanner imput = new Scanner(System.in);
		int navegacao = 1;

		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("| | | | | | | | | | | | | | | | | | | | | | | | |THE PRISON| | | | | | | | | | | | | | | | | | | | | | | | | | |");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		int opcao;

=======
		/*pontoG == pontos ganhos
		  pontoP == pontor perdidos
		  testando, depois mudar*/
		Scanner imput = new Scanner(System.in);				   					                                       
		int ponto = 500, total = 0, pontoG = 100, pontoP = 50,opcao,navegacao=1;  
		String usuario = "";
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
		do {
<<<<<<< HEAD
=======

			System.out.println(
					"----------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"| | | | | | | | | | | | | | | | | | | | | | | | |THE PRISON| | | | | | | | | | | | | | | | | | | | | | | | | | |");
			System.out.println(
					"| | | | | | | | | | | | | | | | | | | | | | | | | | | | |  | | | | | | | | | | | | | | | | | | | | | | | | | | |");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------");
			System.out.println("\n");

>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
			System.out.println("----------------------------");
			System.out.println("|1 - Instru��es do Jogo:   |");
			System.out.println("|2 - Come�ar o jogo:       |");
			System.out.println("|3 - Cr�ditos do jogo:     |");
			System.out.println("|4 - Sair:                 |");
			System.out.println("|Escolha uma op��o:        |");
			System.out.println("----------------------------");
			System.out.println("\n");
			opcao = imput.nextInt();

			switch (opcao) {

			case 1:
				do {
					System.out.println("-----------------------------INSTRU��ES----------------------------------");
					System.out.println("\r - Cada quest�o vale 100 pontos de respeito.                         |");
					System.out.println("\r");
					System.out.println("\r - � necess�rio atingir 500 pontos de respeito para concluir o jogo. |");
					System.out.println("\r");
<<<<<<< HEAD
					System.out.println("\r - Caso erre uma pergunta voc� ir� perder 50 pontos.                 |");
=======
					System.out.println("\r - Caso erre uma pergunta voc� perde 50 pontos.                 |");
					System.out.println("\r");
					System.out.println("\r - Caso acerte uma pergunta voc� ganha 100 pontos.                 |");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
					System.out.println("\r");
					System.out.println("-------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Digite 0 para voltar.");
					navegacao = imput.nextInt();

				} while (navegacao != 0);

				break;

			case 2:

				// inicio do jogo
				do {
					System.out.println(
							"------------------------------------------HIST�RIA DO PERSONAGEM-------------------------------------------------");
					System.out.println("\n");
<<<<<<< HEAD
					System.out.println("Voc� � um estudante da �rea de TI e acaba de ser preso por hackear uma base militar situada em sua cidade, \r\n" + 
							"como consequ�ncia foi condenado a pris�o e mandado para uma pris�o de seguran�a m�xima no estado do Arizona.\r\n" + 
							"\r\n" + 
							"  Voc� tem algumas restri��es no pres�dio;\r\n" + 
							"\r\n" + 
							"- Proibido de acessar qualquer equipamento eletr�nico;\r\n" + 
							"- Voc� est� em uma �rea isolada dos outros detentos no n�vel 1 da pris�o;\r\n" + 
							"- Voc� est� em uma �rea de seguran�a m�xima onde est� isolado,\r\n" + 
							"  sem acesso a outros detentos e sem nenhuma regalia.\r\n" + 
							"  \r\n" + 
							"  Objetivo do jogo;\r\n" + 
							"\r\n" + 
							"O seu objetivo � obter informa��es para acessar os outros n�veis da pris�o,\r\n" + 
							"com isso voc� poder� ter acesso a outras pessoas e recursos para poder sair da pris�o,\r\n" + 
							"caso n�o seja descoberto.\r\n" + 
							"\r\n" + 
							"Boa sorte, detento!");
=======
					System.out.println(
							"Voc� � um estudante da �rea de TI e acaba de ser preso por hackear uma base militar situada em sua cidade, \r\n"
									+ "como consequ�ncia foi condenado a pris�o e mandado para uma pris�o de seguran�a m�xima no estado do Arizona.\r\n"
									+ "\r\n" + "  Voc� tem algumas restri��es no pres�dio;\r\n" + "\r\n"
									+ "- Proibido de acessar qualquer equipamento eletr�nico;\r\n"
									+ "- Voc� est� em uma �rea isolada dos outros detentos no n�vel 1 da pris�o;\r\n"
									+ "- Voc� est� em uma �rea de seguran�a m�xima onde est� isolado,\r\n"
									+ "  sem acesso a outros detentos e sem nenhuma regalia.\r\n" + "  \r\n"
									+ "  Objetivo do jogo;\r\n" + "\r\n"
									+ "O seu objetivo � obter informa��es para acessar os outros n�veis da pris�o,\r\n"
									+ "com isso voc� poder� ter acesso a outras pessoas e recursos para poder sair da pris�o,\r\n"
									+ "caso n�o seja descoberto.\r\n" + "\r\n" + "Boa sorte, detento!");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
					System.out.println("\n");
					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------");
					System.out.println("\n");
					System.out.println("Digite 0 para voltar e 1 para come�ar o jogo.");
					navegacao = imput.nextInt();
					if (navegacao == 1) {
//1 questao
						System.out.println("Informe seu nome detento:");
						usuario = imput.next();
						boolean acertou = false;
						int contador = 0;

						List alternativa1 = new ArrayList();
<<<<<<< HEAD
						alternativa1.add("boolean.");     
=======
						alternativa1.add("boolean.");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
						alternativa1.add("byte.");
						alternativa1.add("short.");
						alternativa1.add("long.");
<<<<<<< HEAD
						alternativa1.add("double.");     //Resposta correta 
						
						

=======
						alternativa1.add("double.");// correta
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git

						System.out.println("\n");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");

						System.out.println(
								"(Guarda) Bill Gates est� com dificuldades na faculdade, ajude ele a solucionar esse problema!");

						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");
						System.out.println("\n");

						do {
							Collections.shuffle(alternativa1);
							System.out.println("Em Java, uma vari�vel de ponto flutuante � uma vari�vel do tipo: ");
							System.out.println("\n");
<<<<<<< HEAD
							
=======

>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
							System.out.println("a) " + alternativa1.get(0));
							System.out.println("b) " + alternativa1.get(1));
							System.out.println("c) " + alternativa1.get(2));
							System.out.println("d) " + alternativa1.get(3));
							System.out.println("e) " + alternativa1.get(4));

							System.out.println("\n");
<<<<<<< HEAD
							System.out.println("Qual a alternativa certa?: ");
=======
							System.out.print("Qual a alternativa certa?: ");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
							String resposta = imput.next();
<<<<<<< HEAD
							
=======

>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
							System.out.println("\n");
							switch (resposta) {
							case "a":
							case "A":
								if (alternativa1.get(0).equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");				// testando, para ver se roda certo.
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
<<<<<<< HEAD
=======
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");				// testando, para ver se raoda certo.
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
								}
								break;
							case "b":
							case "B":
								if (alternativa1.get(1).equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
<<<<<<< HEAD
=======
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
								}
								break;
							case "c":
							case "C":
								if (alternativa1.get(2).equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
<<<<<<< HEAD
=======
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
								}
								break;
							case "d":
							case "D":
								if (alternativa1.get(3).equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
<<<<<<< HEAD
=======
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
								}
								break;
							case "e":
							case "E":
								if (alternativa1.get(4).equals("double.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
<<<<<<< HEAD
=======
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
								}
								break;
							default:
								System.out.println("\n");
								System.out.println("Escolha Invalida.");
								System.out.println("\n");
							}
							contador++;
<<<<<<< HEAD
						} while ((!acertou) && (contador <= 2));
						
						if((acertou == false) && (contador <= 2)) System.out.println("GAME OVER.");
						break;
						
						
=======
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
						
						List alternativa2 = new ArrayList();
						alternativa2.add("int, string, long e real.");             
						alternativa2.add("char, int, real e bit.");                 
						alternativa2.add("boolean, double, float e byte.");    //resposta correta      
						alternativa2.add("real, short, long e char.");
						alternativa2.add("string, long int, short int e float.");

						System.out.println("\n");
						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");

						System.out.println(
								"(Guarda)Mark Zuckerberg: Minha filha est� tendo problemas para resolver um \r\n"
								+ "exerc�cio da escola, me ajude com isto \r\n"
								+ "e posso conseguir com que voc� possa acessar outra ala da pris�o.\r\n"
								+ "mas nada al�m disso detento!\r\n");

						System.out.println(
								"-----------------------------------------------------------------------------------------------------------------");
						System.out.println("\n");

						do {
							Collections.shuffle(alternativa2);
							System.out.println("S�o tipos primitivos da linguagem Java: ");
							System.out.println("\n");

							System.out.println("a) " + alternativa2.get(0));
							System.out.println("b) " + alternativa2.get(1));
							System.out.println("c) " + alternativa2.get(2));
							System.out.println("d) " + alternativa2.get(3));
							System.out.println("e) " + alternativa2.get(4));

							System.out.println("\n");
							System.out.print("Qual a alternativa certa?: ");
							String resposta = imput.next();

							System.out.println("\n");
							switch (resposta) {
							case "a":
							case "A":
								if (alternativa2.get(0).equals("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG; //
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");// testando, para ver se roda certo.
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");// testando, para ver se raoda certo.
								}
								break;
							case "b":
							case "B":
								if (alternativa2.get(1).equals("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "c":
							case "C":
								if (alternativa2.get(2).equals("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "d":
							case "D":
								if (alternativa2.get(3).equals("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								}
								break;
							case "e":
							case "E":
								if (alternativa2.get(4).equals("boolean, double, float e byte.")) {
									System.out.println("Resposta Correta.");
									System.out.println("\n");
									acertou = true;
									total = ponto + pontoG;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
									System.out.println("\r\n");
								} else {
									System.out.println("\n");
									System.out.println("Resposta Incorreta.");
									System.out.println("\n");
									total = ponto - pontoP;
									ponto = total;
									System.out.println("ID => "+usuario);
									System.out.println("|"+total + " => pontos|");
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
/*3 quest�o*/						if (navegacao==1) {
							acertou = false;
						    contador = 0;
							
							List alternativa3 = new ArrayList();
							alternativa3.add("100");             
							alternativa3.add("120");                 
							alternativa3.add("50");    //resposta correta      
							alternativa3.add("60");
							alternativa3.add("110");

							System.out.println("\n");
							System.out.println(
									"-----------------------------------------------------------------------------------------------------------------");

							System.out.println(
									"(Guarda)Alan Turing: Algoritmo? este nome me parece familiar... pode refrescar minha mem�ria?");

							System.out.println(
									"-----------------------------------------------------------------------------------------------------------------");
							System.out.println("\n");

							do {
								Collections.shuffle(alternativa3);
								System.out.println("Um determinado algoritmo recebe dois valores e armazena\r\n"
										+ "nas vari�veis A e B, em sequ�ncia faz o seguinte processamento \r\n"
										+ "math.pow(A, B)/2  supondo que A <- 10 e B <-2 \r\n"
										+ "qual seria a sa�da de dados? \r\n");
								System.out.println("\n");

								System.out.println("a) " + alternativa3.get(0));
								System.out.println("b) " + alternativa3.get(1));
								System.out.println("c) " + alternativa3.get(2));
								System.out.println("d) " + alternativa3.get(3));
								System.out.println("e) " + alternativa3.get(4));

								System.out.println("\n");
								System.out.print("Qual a alternativa certa?: ");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa3.get(0).equals("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG; //
										ponto = total;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");// testando, para ver se roda certo.
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");// testando, para ver se raoda certo.
									}
									break;
								case "b":
								case "B":
									if (alternativa3.get(1).equals("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa3.get(2).equals("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa3.get(3).equals("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa3.get(4).equals("50")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.println("ID => "+usuario);
										System.out.println("|"+total + " => pontos|");
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
							System.out.println("Parab�ns voce passou do terceiro n�vel.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();
							
						}
						// Proxima Quest�o?
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

>>>>>>> branch 'master' of https://github.com/Fdjava/Projeto-PI.git
					}
				} while (navegacao != 0);
				break;

			case 3:
				do {
				System.out.println("-------------------");
				System.out.println("|Desenvolvido por:|");
				System.out.println("|Felipe Dias      |");
				System.out.println("|Ji               |");
				System.out.println("|Marcus           |");
				System.out.println("|Pedro            |");
				System.out.println("-------------------");
				System.out.println("\r\n");
				System.out.println("Digite 0 para voltar para o menu.");
				navegacao = imput.nextInt();
				}while(navegacao!=0);
				
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

