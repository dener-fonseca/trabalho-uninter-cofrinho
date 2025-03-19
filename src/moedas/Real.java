//Definição de que a classe Real pertence ao pacote src.moedas
package src.moedas;

//Criação da classe Real que herda da classe Moeda
public class Real extends Moeda {
  //Construtor da classe Real que recebe um valor double e passa o valor para a superclasse Moeda
  public Real(double valor) {
    super(valor);
  }

  //Método que retorna o tipo da moeda que neste caso é 1
  public int getTipo() {
    return 1;
  }

  //Método que imprime as informações da moeda Real e o seu valor total acumulado
  public void info() {
    System.out.printf("Moeda Real: Valor total acumulado: R$ %.2f%n", this.valor);
  }
}