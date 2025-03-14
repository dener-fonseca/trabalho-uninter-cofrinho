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

    while(true) {
      System.out.println("\n=== Confrinho Digital ===");

      System.out.println("--- Menu de opções:");

      System.out.println("1 - Adicionar moeda");

      System.out.println("2 - Remover moeda");

      System.out.println("3 - Listar as moedas");

      System.out.println("4 - Mostrar total convertido em reais");

      System.out.println("5 - Sair do programa");

      System.out.println("Digite a opção desejada:");

      int opcao;
      try {
        opcao = scanner.nextInt();
      }

      catch(Exception e) {
        System.out.println("Entrada inválida. Por favor, digite um número.");
        scanner.nextLine();
        continue; 
      }

      switch(opcao){
        case 1:
          System.out.println("Escolha a moeda que você deseja adicionar:");
          System.out.println("1 - Real");
          System.out.println("2 - Dólar");
          System.out.println("3 - Euro");

          int tipoAdicionar = scanner.nextInt();

          System.out.println("Digite o valor que você deseja adicionar:");

          double valorAdicionar = scanner.nextDouble();

          Moeda moedaAdicionar = null;

          if(tipoAdicionar == 1) {
            moedaAdicionar = new Real(valorAdicionar);
          }

          else if(tipoAdicionar == 2) {
            moedaAdicionar = new Dolar(valorAdicionar);
          }

          else if(tipoAdicionar == 3) {
            moedaAdicionar = new Euro(valorAdicionar);
          }
          else {
            System.out.println("Opção inválida.");
            break;
          }
          cofrinho.adicionar(moedaAdicionar);
          System.out.println("Moeda adicionada com sucesso.");

          break;

        case 2:
          System.out.println("Escolha a moeda que deseja remover:");
          System.out.println("1 - Real");
          System.out.println("2 - Dólar");
          System.out.println("3 - Euro");

          int tipoRemover = scanner.nextInt();

          System.out.println("Escolha o  valor que você deseja remover:");

          double valorRemover = scanner.nextDouble();

          Moeda moedaRemover = null;

          if(tipoRemover == 1) {
            moedaRemover = new Real(valorRemover);
          }

          else if(tipoRemover == 2) {
            moedaRemover = new Dolar(valorRemover);
          }

          else if(tipoRemover == 3) {
            moedaRemover = new Euro(valorRemover);
          }
            
          else {
            System.out.println("Opção inválida.");
            break;
          }

          if(cofrinho.podeRemover(moedaRemover)) { 
    cofrinho.remover(moedaRemover);
    System.out.println("Moeda removida com sucesso!");
} 
          else {
    System.out.println("Erro: saldo insuficiente no cofrinho.");
          }

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
            System.out.println("Opção inválida");
            break;

      }
    }
  }    
}