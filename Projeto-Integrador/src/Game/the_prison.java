package Game;
import java.util.Scanner;
public class the_prison {
  
	public static void main(String[] args) { 
	Scanner input = new Scanner(System.in);
			int navegacao = 1;
		    System.out.println("------------------------------");
		    System.out.println("| | | | | |THE PRISON| | | | |");
		    System.out.println("------------------------------");
        int opcao;
        do {
            System.out.println("1 - Instru��es do Jogo: ");
            System.out.println("2 - Come�ar o jogo: ");
            System.out.println("3 - Cr�ditos do jogo: ");
            System.out.println("4 - Sair: ");
            System.out.println("Escolha uma op��o: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                	do {
                	System.out.println("--------INSTRU��ES---------");
                    System.out.println("1 - Cada quest�o vale 100 pontos de respeito.");
                    System.out.println("2 - � necess�rio atingir 500 pontos de respeito para concluir o jogo.");
                    System.out.println("3 - Caso erre uma pergunta voc� ir� perder 50 pontos. ");
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("Digite 0 para voltar.");
                    navegacao = input.nextInt();
                	}while(navegacao!=0);
                    break;
                case 2:
                	// inicio do jogo
                	do {
         System.out.println("-----------------------------------------------------------------------------------------------------------------");
                	System.out.println("\r\n" +  // Introdu��o e objetivo inicial do jogo
                    		"Voc� � um estudante da �rea de TI e acaba de ser preso por hackear uma base militar situada em sua cidade,\r\n"+
                    		"como consequ�ncia foi condenado a pris�o e mandado para uma pris�o de seguran�a m�xima no estado do Arizona.\r\n" + 
                    		"Voc� tem algumas restri��es no pres�dio;\r\n" + 
                    		"-proibido de acessar qualquer equipamento eletr�nico;\r\n" + 
                    		"-voc� est� em uma �rea isolada dos outros detentos no n�vel 1 da pris�o;\r\n" + 
                    		"-voc� est� em uma �rea de seguran�a m�xima onde est� isolado, sem acesso a outros detentos e sem nenhuma regalia.\r\n" + 
                    		"objetivo do jogo;\r\n" + 
                    		"o seu objetivo � obter informa��es para acessar os outros n�veis da pris�o, com isso voc� poder� ter acesso \r\n" +
                    		"a outras pessoas e recursos para poder sair da pris�o caso n�o seja descoberto.\r\n" + 
                    		"Boa sorte, detento!");
         System.out.println("-----------------------------------------------------------------------------------------------------------------");
         System.out.println("Digite 0 para voltar.\r\n"+
         "Digite 1 para iniciar o jogo.");
         navegacao = input.nextInt();
                	}while(navegacao!=0);
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
