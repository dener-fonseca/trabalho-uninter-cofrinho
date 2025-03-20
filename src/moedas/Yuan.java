//Definição de que a classe Yuan pertence ao pacote src.moedas
package src.moedas;

//Criação da classe Yuan que herda da classe Moeda
public class Yuan extends Moeda {
  //Construtor da classe Yuan que recebe um valor double e passa o valor para a superclasse Moeda
  public Yuan(double valor) {
    super(valor);
  }
  //Método que retorna o tipo da moeda que neste caso é 6
  public int getTipo() {
    return 6;
  }

  //Método que imprime as informações da moeda Yuan e o seu valor total acumulado
  public void info() {
    System.out.printf("Moeda Yuan: Valor total acumulado: ¥ %.2f%n", this.valor);
  }

  //Método para conversão do valor em Yuan para Real
  public double converter() {
    return this.valor * 0.68;
  } 
}