//Definição de que a classe Euro pertence ao pacote src.moedas
package src.moedas;

//Criação da classe Euro que herda da classe Moeda
public class Euro extends Moeda {
  //Construtor da classe Euro que recebe um valor double e passa o valor para a superclasse Moeda
  public Euro(double valor) {
    super(valor);
  }

  //Método que retorna o tipo da moeda que neste caso é 3
  public int getTipo() {
    return 3;
  }

  //Método que imprime as informações da moeda Euro e o seu valor total acumulado
  public void info() {
    System.out.printf("Moeda Euro: Valor total acumulado: € %.2f%n", this.valor);
  }

  //Método para conversão do valor em Euro para Real
  public double converter() {
    return this.valor * 5.50;
  } 
}