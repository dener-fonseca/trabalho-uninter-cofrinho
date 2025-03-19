//Definição de que a classe Libra pertence ao pacote src.moedas
package src.moedas;

//Criação da classe Libra que herda da classe Moeda
public class Libra extends Moeda {
  //Construtor da classe Libra que recebe um valor double e passa o valor para a superclasse Moeda
  public Libra(double valor) {
    super(valor);
  }
  //Método que retorna o tipo da moeda que neste caso é 4
  public int getTipo() {
    return 4;
  }

  //Método que imprime as informações da moeda Libra e o seu valor total acumulado
  public void info() {
    System.out.printf("Moeda Libra: Valor total acumulado: £ %.2f%n", this.valor);
  }

  //Método para conversão do valor em Libra para Real
  public double converter() {
    return this.valor * 6.15;
  } 
}