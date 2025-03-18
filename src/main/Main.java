package src.main;

import src.cofrinho.Cofrinho;
import src.moedas.Moeda;
import src.moedas.Real;
import src.moedas.Dolar;
import src.moedas.Euro;
import java.util.Scanner;

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

      opcao = scanner.nextInt();

      switch(opcao){
        case 1:
          System.out.println("--- Escolha a moeda que você deseja adicionar:");
          System.out.println("1 - Real");
          System.out.println("2 - Dólar");
          System.out.println("3 - Euro");
          System.out.println("--- Digite a opção desejada:");

          int tipoAdicionar = scanner.nextInt();

          System.out.println("--- Digite o valor que você deseja adicionar:");

          double valorAdicionar = scanner.nextDouble();

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

            default:
        
              System.out.println("Erro: Opção inválida.");
            continue;
          }
          cofrinho.adicionar(moedaAdicionar);
          break;

        case 2:
          System.out.println("--- Escolha a moeda que deseja remover:");
          System.out.println("1 - Real");
          System.out.println("2 - Dólar");
          System.out.println("3 - Euro");
          System.out.println("--- Digite a opção desejada:");

          int tipoRemover = scanner.nextInt();

          System.out.println("--- Escolha o valor que você deseja remover:");

          double valorRemover = scanner.nextDouble();
  
          cofrinho.remover(tipoRemover, valorRemover);
        break;

        case 3:
            cofrinho.listagemMoedas();
          break;

        case 4:
            double totalConvertido = cofrinho.totalConvertido();
            System.out.println("Total convertido em reais: R$" + totalConvertido);
            break;

          case 5:
            System.out.println("Encerrando o programa...");
            return;

          default:
            System.out.println("Erro: Opção inválida");
            break;

      }
    }
  }    
}