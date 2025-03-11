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
      System.out.println("=== Confrinho Digital ===");
      System.out.println("--- Menu de opções:");
      System.out.println("1 - Adicionar moeda");
      System.out.println("2 - Remover moeda");
      System.out.println("3 - Listar as moedas");
      System.out.println("4 - Mostrar total convertido em reais");
      System.out.println("5 - Sair do programa");
      System.out.println("Digite a opção desejada:");

      int opcao = scanner.nextInt();

      switch(opcao){
        case 1 -> {
          System.out.println("Escolha a moeda:");
          System.out.println("1 - Real");
          System.out.println("2 - Dólar");
          System.out.println("3 - Euro");
          int opcaoMoeda = scanner.nextInt();

          System.out.println("Digite o valor da moeda:");

          double valor = scanner.nextDouble();

          Moeda moeda = switch(opcaoMoeda) {
            case 1 -> new Real(valor);
            case 2 -> new Dolar(valor);
            case 3 -> new Euro(valor);
            default -> null;
          };

          if(moeda != null {
            cofrinho.adicionar(moeda);  
            } else {
            System.out.println("Opção inválida");
            }

          case 2 -> {
            System.out.println("Digite o valor da moeda a ser removida:");
            
          double valorRemover = scanner.nextDouble();

          cofrinho.removerPorValor(valorRemover);
          case 3 -> {
            cofrinho.listagemMoedas();
          }

          case 4 -> {
            double totalConvertido = cofrinho.totalConvertido();
            System.out.println("Total convertido em reais: R$" + totalConvertido);
          }

          case 5 -> {
            System.out.println("Encerrando o programa...");
          }

          default -> {
            System.out.println("Opção inválida");
          }

          




          
          }


          


          
        }

      }


      







      
    }






    
  }
  
}