//Definição de que a classe Main pertence ao pacote src.main
package src.main;

//Importação das classes Cofrinho, Moeda, Real, Euro, Dolar, Libra, Yene e Yuan dos pacotes src.cofrinho e src.moedas
import src.cofrinho.Cofrinho;
import src.moedas.Moeda;
import src.moedas.Real;
import src.moedas.Dolar;
import src.moedas.Euro;
import src.moedas.Libra;
import src.moedas.Yene;
import src.moedas.Yuan;

//Importação da classes Scanner e InputMismatchException da biblioteca padrão java.util
import java.util.Scanner;
import java.util.InputMismatchException;

//Criação da classe Main para as operações do programa
public class Main {
  public static void main(String[] args) {

    //Criação de objeto scanner da classe Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    //Criação de um objeto cofrinho da classe Cofrinho para armazenar as moedas
    Cofrinho cofrinho = new Cofrinho();

    //Criação de variável opcao do tipo inteiro para armazenar a opção do usuário
    int opcao = 0;
    
    //Estrutura de repetição while que exibirá o menu até o usuário escolher a opção 5
    while(opcao != 5) {
      System.out.println("\n=== Confrinho Digital ===");

      System.out.println("--- Menu de opções:");

      System.out.println("1 - Adicionar moeda no cofrinho");

      System.out.println("2 - Remover moeda do cofrinho");

      System.out.println("3 - Listar moedas armazenadas no cofrinho");

      System.out.println("4 - Mostrar o total convertido em reais");

      System.out.println("5 - Sair do programa");

      System.out.println("--- Digite a opção desejada:");

      //Estrutura de repetição while que continuará em execução até que o usuário digite uma opção válida
      while(true) {
        //Estrutura de repetição try-catch para tratar entradas inválidas do usuário
        try {
          //Leitura da entrada do usuário que será armazenada na variavel opcao
          opcao = scanner.nextInt();
          //Condicional if para verificar se a opção é válida
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

      //Estrutura de condição switch para executar a ação correspondente à opção escolhida pelo usuário
      switch(opcao){
        //Case 1 que adiciona uma moeda e deposita um valor ao cofrinho
        case 1:
          System.out.println("--- Escolha a moeda que você deseja adicionar:");
          System.out.println("1 - Real");
          System.out.println("2 - Dólar");
          System.out.println("3 - Euro");
          System.out.println("4 - Libra");
          System.out.println("5 - Yene");
          System.out.println("6 - Yuan");
          System.out.println("--- Digite a opção desejada:");

          //Criação de variável tipoAdicionar do tipo inteiro para armazenar o tipo da moeda escolhida pelo usuário
          int tipoAdicionar = 0;

          //Estrutura de repetição while que continuará em execução até que o usuário digite um número válido
          while(true) {
            //Estrutura de repetição try-catch para tratar entradas inválidas do usuário
            try {
              //Leitura da entrada do usuário que será armazenada na variavel tipoAdicionar
              tipoAdicionar = scanner.nextInt();
              //Condicional if para verificar se a opção é válida
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
          
          System.out.println("--- Digite o valor que você deseja depositar:");

          //Criação de variável valor do tipo double para armazenar o valor que será depositado na moeda
          double valorAdicionar = 0;
        
          //Estrutura de repetição while que continuará em execução até que o usuário digite um valor válido
          while(true) {
            //Estrutura de repetição try-catch para tratar entradas inválidas do usuário
            try {
              //Leitura da entrada do usuário que será armazenada na variavel valorAdicionar
              valorAdicionar = scanner.nextDouble();
              //Condicional if para verificar se o valor é válido
              if (valorAdicionar <= 0) {
                System.out.println("Valor inválido. Você inseriu um valor menor que zero.");
              } else {
              break;
              }
            } catch (InputMismatchException e) {
              System.out.println("Valor inválido. Por favor, digite um valor numérico.");
              scanner.nextLine();
            }
          }

          // Criação de variável do tipo Moeda chamada moedaAdicionar inicializada como nula que receberá o objeto da moeda escolhida pelo usuário
          Moeda moedaAdicionar = null;
          //Estrutura de condição switch que executará a ação correspondente ao tipo da moeda escolhida pelo usuário
          switch(tipoAdicionar) {
            //Case 1 que adiciona o valor escolhido pelo usuário na moeda Real e o adiciona em moedaAdicionar
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

          //Bloco de código que adiciona a moeda no cofrinho
          cofrinho.adicionar(moedaAdicionar);
          break;

        //Case 2 que saca um valor de uma moeda do cofrinho e remove a moeda quando o valor é igual a zero
        case 2:
          System.out.println("--- Escolha a moeda que deseja remover:");
          System.out.println("1 - Real");
          System.out.println("2 - Dólar");
          System.out.println("3 - Euro");
          System.out.println("4 - Libra");
          System.out.println("5 - Yene");
          System.out.println("6 - Yuan");
          System.out.println("--- Digite a opção desejada:");
          
          //Criação de variável tipoRemover do tipo inteiro para armazenar o tipo da moeda escohida pelo usuário
          int tipoRemover = 0;

          //Estrutura de repetição while que continuará em execução até que o usuário digite um número válido
          while(true) {
          //Estrutura de repetição try-catch para tratar entradas inválidas do usuário
            try {
              //Leitura da entrada do usuário que será armazenada na variavel tipoRemover
              tipoRemover = scanner.nextInt();
              //Condicional if para verificar se a opção é válida
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
          
          System.out.println("--- Escolha o valor que você deseja sacar:");

          //Criação de variável valorRemover do tipo double para armazenar o valor que será sacado
          double valorRemover = 0;

          //Estrutura de repetição while que continuará em execução até que o usuário digite um valor válido
          while(true) {
            //Estrutura de repetição try-catch para tratar entradas inválidas do usuário
            try {
              //Leitura da entrada do usuário que será armazenada na variavel valorRemover
              valorRemover = scanner.nextDouble();
              //Condicional if para verificar se o valor é válido
              if (valorRemover <= 0) {
                System.out.println("Valor inválido. Você inseriu um valor menor que zero.");
              } else {
              break;
              }
            } catch (InputMismatchException e) {
              System.out.println("Valor inválido. Por favor, digite um valor numerico.");
              scanner.nextLine();
            }
          }

          //Bloco de código que remove a moeda e o valor escolhido pelo usuário do cofrinho
          cofrinho.remover(tipoRemover, valorRemover);
        break;

        //Case 3 que lista as moedas armazenadas no cofrinho com o valor total acumulado
        case 3:
            cofrinho.listagemMoedas();
          break;

        //Case 4 que exibe o total convertido em reais
        case 4:
            double totalConvertido = cofrinho.totalConvertido();
            System.out.printf("Total convertido em reais: R$ %.2f%n", totalConvertido);
            break;

          //Case 5 que encerra o programa
          case 5:
            System.out.println("Programa encerrado com sucesso");
            return;
      }
    }
  }    
}