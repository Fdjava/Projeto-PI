package Game;
import java.util.Scanner;
public class the_prison {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.println("BEM VINDO AO JOGO 'THE PRISON'.");
        int opcao;
        do {
            System.out.println("1 - Instrução do Jogo: ");
            System.out.println("2 - Começar o jogo: ");
            System.out.println("3 - Créditos do jogo: ");
            System.out.println("4 - Sair: ");
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escrecer as instrucoes do jogo");
                    break;
                case 2:
                	// inicio do jogo
                    System.out.println("\r\n" +  // Introdu��o e objetivo inicial do jogo
                    		"Voc� � um estudante da �rea de TI e acaba de ser preso por hackear uma base militar situada em sua cidade,\r\n"+
                    		"como consequ�ncia foi condenado a pris�o e mandado para uma pris�o de seguran�a m�xima no estado do Arizona.\r\n" + 
                    		"Voc� tem algumas restri��es no pres�dio;\r\n" + 
                    		"-proibido de acessar qualquer equipamento eletr�nico;\r\n" + 
                    		"-voc� est� em uma �rea isolada dos outros detentos no n�vel 1 da pris�o;\r\n" + 
                    		"-voc� est� em uma �rea de seguran�a m�xima onde est� isolado, sem acesso a outros detentos e sem nenhuma regalia.\r\n" + 
                    		"objetivo do jogo;\r\n" + 
                    		"o seu objetivo � obter informa��es para acessar os outros n�veis da pris�o, com isso voc� poder� ter acesso a outras pessoas e recursos para poder sair da pris�o caso n�o seja descoberto.\r\n" + 
                    		"Boa sorte, detento!");
                    break;
                case 3:
                    System.out.println("Colocar os dreditos do jogo");
                    break;
                case 4:
                    System.out.println("Você está saindo do jogo.");
                    break;
                default:
                    System.out.println("Opção inválida.");

            }

        } while (opcao != 4);

    }
}
