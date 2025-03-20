//Definição de que a classe Cofrinho pertence ao pacote src.cofrinho
package src.cofrinho;

//Importação das classe Moeda, Real, Dolar, Euro, Libra, Yene e Yuan do pacote src.moedas
import src.moedas.Moeda;
import src.moedas.Real;
import src.moedas.Dolar;
import src.moedas.Euro;
import src.moedas.Libra;
import src.moedas.Yene;
import src.moedas.Yuan;

//Importação das classes List, ArrayList e Iterator da biblioteca padrão java.util
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

//Criação da classe Cofrinho
public class Cofrinho {
  //Criação de lista privada que armazena objetos do tipo Moeda
  private List<Moeda> ListaMoedas;

  //Criação do construtor da classe Cofrinho que recebe como parâmetro uma lista de moedas
  public Cofrinho() {
    this.ListaMoedas = new ArrayList<>();
  }

  //Método para adicionar uma moeda com um valor especificado no cofrinho
  public void adicionar(Moeda moeda) {
    // Condicional if para verificar se a moeda é nula
    if (moeda == null) {
        System.out.println("Opção inválida. Uma moeda nula não pode ser adicionada no cofrinho.");
        return;
    }

    // Estrutura de repetição for para percorrer a lista de moedas
    for (Moeda moedaCofrinho : this.ListaMoedas) {
        // Condicional if para verificar se a moeda já existe no cofrinho e para adicionar o valor espeficado
        if (moedaCofrinho.getClass().equals(moeda.getClass())) {
            moedaCofrinho.setValor(moedaCofrinho.getValor() + moeda.getValor());
            System.out.println("Moeda e valor especificado adicionados com sucesso no cofrinho.");
            return;
        }
    }

    // Bloco de código para adicionar moeda ao cofrinho caso a moeda não exista
    this.ListaMoedas.add(moeda);
    System.out.println("Moeda adicionada com sucesso no cofrinho.");
        
}

  // Método para remover um valor especificado de uma moeda do cofrinho
  public void remover(int tipo, double valor) {
    // Condicional if para verificar se o valor a ser retirado é maior que zero
    if (valor <= 0) {
        System.out.println("Opção inválida. Você inseriu um valor menor que zero.");
        return;
    }

    // Condicional if para verificar se o tipo de moeda é válido
    if (tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4 && tipo != 5 && tipo != 6) {
        System.out.println("Opção inválida. Por favor, digite um número entre 1 e 6.");
        return;
    }

    // Criação de iterador para percorrer a lista de moedas
    Iterator<Moeda> iterator = this.ListaMoedas.iterator();
    boolean moedaEncontrada = false;

    // Estrutura de repetição while para percorrer a lista de moedas
    while (iterator.hasNext()) {
        Moeda moeda = iterator.next();

        // Condicional if para verificar se a moeda corresponde ao tipo solicitado
        if ((tipo == 1 && moeda instanceof Real) ||
            (tipo == 2 && moeda instanceof Dolar) ||
            (tipo == 3 && moeda instanceof Euro) ||
            (tipo == 4 && moeda instanceof Libra) ||
            (tipo == 5 && moeda instanceof Yene) ||
            (tipo == 6 && moeda instanceof Yuan)) {

            moedaEncontrada = true;

            // Condicional if para verificar se o valor da moeda é suficiente para a retirada
            if (moeda.getValor() >= valor) {
                moeda.setValor(moeda.getValor() - valor);
                System.out.println("Valor especificado removido com sucesso.");

                // Condicional if que verifica se o valor da moeda é zero e o remove da lista caso for verdadeiro
                if (moeda.getValor() == 0) {
                    iterator.remove();
                    System.out.println("A moeda foi removida do cofrinho.");
                }
                return;
            } 

            // Condicional else que retorna mensagem de erro caso o valor da moeda seja insuficiente
            else {
                System.out.println("Opção inválida. O saldo da moeda é insuficiente para a remoção.");
                return;
            }
        }
    }

    // Condicional if que verifica se a moeda foi encontrada no cofrinho
    if (!moedaEncontrada) {
        System.out.println("Opção inválida. A Moeda não foi encontrada no cofrinho.");
    }
   }
   
  // Método que faz listagem de todas as moedas com seus respectivos valores no cofrinho
  public void listagemMoedas() {
    if(this.ListaMoedas.isEmpty()){
      System.out.println("O cofrinho está vazio.");
    } else {
      System.out.println("Moedas armazenadas no cofrinho:");
      for(Moeda moeda : this.ListaMoedas) {
      moeda.info();
      }
    }  
  }

  // Método que retorna o valor total convertido em reais de todas as moedas no cofrinho
  public double totalConvertido() {
    double total = 0;
    for(Moeda moeda : this.ListaMoedas) {
      total += moeda.converter();
    }
    return total;
  } 
}