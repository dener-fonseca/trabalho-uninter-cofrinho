//Definição de que a classe Cofrinho pertence ao pacote src.cofrinho
package src.cofrinho;

//Importação das classe Moeda, Real, Euro e Dolar do pacote src.moedas
import src.moedas.Moeda;
import src.moedas.Real;
import src.moedas.Dolar;
import src.moedas.Euro;


//Importação das classes Arraylist, List e Iterator da biblioteca padrão java.util
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

//Criação da classe Cofrinho
public class Cofrinho {
  //Criação de lista privada que armazena objetos do tipo Moeda
  private List<Moeda> ListaMoedas;

  //Criação do construtor da classe Cofrinho que recebe como parâmetro uma lista de moedas
  public Cofrinho() {
    this.ListaMoedas = new ArrayList<>();
  }

  //Método para adicionar uma moeda com um valor no cofrinho
  public void adicionar(Moeda moeda) {
    // Condicional if para verificar se a moeda é nula
    if (moeda == null) {
        System.out.println("Erro: Moeda nula não pode ser adicionada.");
        return;
    }

    // Estrutura de repetição for para percorrer a lista de moedas
    for (Moeda moedaCofrinho : this.ListaMoedas) {
        // Condicional if para verificar se a moeda já existe no cofrinho para adicionar o valor espeficado
        if (moedaCofrinho.getClass().equals(moeda.getClass())) {
            moedaCofrinho.setValor(moedaCofrinho.getValor() + moeda.getValor());
            System.out.println("Valor acumulado com sucesso.");
            return;
        }
    }

    // Caso a moeda seja do tipo que não existe no cofrinho, adiciona-a
    else {
        this.ListaMoedas.add(moeda);
    System.out.println("Moeda adicionada com sucesso.");
    }
}

  // Método para remover um valor com uma moeda do cofrinho
  public void remover(int tipo, double valor) {
    // Verificação se o valor a ser retirado é positivo
    if (valor <= 0) {
        System.out.println("Erro: O valor a ser retirado deve ser positivo.");
        return;
    }

    // Verificação se o tipo de moeda é válido
    if (tipo != 1 && tipo != 2 && tipo != 3) {
        System.out.println("Erro: Tipo de moeda inválido. Use 1 para Real, 2 para Dólar, ou 3 para Euro.");
        return;
    }

    Iterator<Moeda> iterator = this.ListaMoedas.iterator();
    boolean moedaEncontrada = false;

    while (iterator.hasNext()) {
        Moeda moeda = iterator.next();

        // Verificação se a moeda corresponde ao tipo solicitado
        if ((tipo == 1 && moeda instanceof Real) ||
            (tipo == 2 && moeda instanceof Dolar) ||
            (tipo == 3 && moeda instanceof Euro)) {

            moedaEncontrada = true;

            // Verificação se o valor da moeda é suficiente para a retirada
            if (moeda.getValor() >= valor) {
                moeda.setValor(moeda.getValor() - valor);
                System.out.println("Valor removido com sucesso.");

                // Se o valor da moeda for 0 após a remoção, a moeda é removida
                if (moeda.getValor() == 0) {
                    iterator.remove();
                    System.out.println("A moeda foi removida do cofrinho.");
                }
                return; // Conclui a operação
            } else {
                System.out.println("Erro: O saldo da moeda é insuficiente para a remoção.");
                return;
            }
        }
    }

    // Caso nenhuma moeda do tipo especificado seja encontrada
    if (!moedaEncontrada) {
        System.out.println("Erro: A Moeda do tipo especificado não foi encontrada.");
    }
   }
   
  // Método que faz listagem de todas as moedas com seus respectivos valores no cofrinho
  public void listagemMoedas() {
    if(this.ListaMoedas.isEmpty()){
      System.out.println("O cofrinho está vazio.");
    } else {
      System.out.println("Moedas no cofrinho:");
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