//Definição de que a classe Main pertence ao pacote src.main
package src.main;

//Importação das classes Cofrinho, Moeda, Real, Euro, Dolar, Libra, Yene e Yuan dos pacotes src.cofrinho e src.moedas
import src.cofrinho.Cofrinho;
import src.moedas.Moeda;
import src.moedas.Real;
import src.moedas.Dolar;
import src.moedas.Euro;

//Importação da classes Scanner e InputMismatchException da biblioteca padrão java.util
import java.util.Scanner;
import java.util.InputMismatchException;

//Criação da classe Main para as operações do programa
public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Cofrinho cofrinho = new Cofrinho();

    int opcao = 0;
    
    while(opcao != 5) {
      System.out.println("\n=== Confrinho Digital ===");

      System.out.println("--- Menu de opções:");

      System.out.println("1 - Adicionar moeda");

      System.out.println("2 - Remover moeda");

      System.out.println("3 - Listar as moedas");

      System.out.println("4 - Mostrar total convertido em reais");

      System.out.println("5 - Sair do programa");

      System.out.println("--- Digite a opção desejada:");
      
      while(true) {
        try {
          opcao = scanner.nextInt();
          if (opcao < 1 || opcao > 5){
            System.out.println("Opção inválida. Por favor, digite um número entre 1 e 5.");
          } else {
            break;
          }
        }  catch (InputMismatchException e) {
          System.out.println("Opção inválida. Por favor, digite um número entre 1 e 5.");
          scanner.nextLine();
        }
      }

      switch(opcao){
        case 1:
          System.out.println("--- Escolha a moeda que você deseja adicionar:");
          System.out.println("1 - Real");
          System.out.println("2 - Dólar");
          System.out.println("3 - Euro");
          System.out.println("4 - Libra");
          System.out.println("5 - Yene");
          System.out.println("6 - Yuan");
          System.out.println("--- Digite a opção desejada:");

          int tipoAdicionar = 0;

          while(true) {
            try {
              tipoAdicionar = scanner.nextInt();
              if (tipoAdicionar < 1 || tipoAdicionar > 6) {
                System.out.println("Opção inválida. Por favor, digite um número entre 1 e 6.");
              } else {
                break;
              }
            } catch (InputMismatchException e) {
              System.out.println("Opção inválida. Por favor, digite um número entre 1 e 6.");
              scanner.nextLine();
            }
          }
          
          System.out.println("--- Digite o valor que você deseja adicionar:");

          double valorAdicionar = 0;
          
          while(true) {
            try {
              valorAdicionar = scanner.nextDouble();
              if (valorAdicionar <= 0) {
                System.out.println("Valor inválido. Por favor, digite um valor maior que zero.");
              } else {
              break;
              }
            } catch (InputMismatchException e) {
              System.out.println("Valor inválido. Por favor, digite um valor numerico.");
              scanner.nextLine();
            }
          }
          
          Moeda moedaAdicionar = null;

          switch(tipoAdicionar) {
            case 1:
              moedaAdicionar = new Real(valorAdicionar);
              break;

            case 2:
              moedaAdicionar = new Dolar(valorAdicionar);
              break;

            case 3:
              moedaAdicionar = new Euro(valorAdicionar);
              break;

            case 4:
              moedaAdicionar = new Libra(valorAdicionar);
              break;

            case 5:
              moedaAdicionar = new Yene(valorAdicionar);
              break;

            case 6:
              moedaAdicionar = new Yuan(valorAdicionar);
              break;
          }
          cofrinho.adicionar(moedaAdicionar);
          break;

        case 2:
          System.out.println("--- Escolha a moeda que deseja remover:");
          System.out.println("1 - Real");
          System.out.println("2 - Dólar");
          System.out.println("3 - Euro");
          System.out.println("4 - Libra");
          System.out.println("5 - Yene");
          System.out.println("6 - Yuan");
          System.out.println("--- Digite a opção desejada:");

          int tipoRemover = 0;

          while(true) {
          try {
            tipoRemover = scanner.nextInt();
            if (tipoRemover < 1 || tipoRemover > 6) {
              System.out.println("Opção inválida. Por favor, digite um número entre 1 e 6.");
            } else {
              break;
            }
          } catch (InputMismatchException e) {
            System.out.println("Opção inválida. Por favor, digite um número entre 1 e 6.");
            scanner.nextLine();
          }
        }
          
          System.out.println("--- Escolha o valor que você deseja remover:");

          double valorRemover = 0;

          while(true) {
            try {
              valorRemover = scanner.nextDouble();
              if (valorRemover <= 0) {
                System.out.println("Valor inválido. Por favor, digite um valor maior que zero.");
              } else {
              break;
              }
            } catch (InputMismatchException e) {
              System.out.println("Valor inválido. Por favor, digite um valor numerico.");
              scanner.nextLine();
            }
          }
  
          cofrinho.remover(tipoRemover, valorRemover);
        break;

        case 3:
            cofrinho.listagemMoedas();
          break;

        case 4:
            double totalConvertido = cofrinho.totalConvertido();
            System.out.printf("Total convertido em reais: R$ %.2f%n", totalConvertido);
            break;

          case 5:
            System.out.println("Encerrando o programa...");
            return;
      }
    }
  }    
}