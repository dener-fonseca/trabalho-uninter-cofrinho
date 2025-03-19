//Definição de que a classe Dolar pertence ao pacote src.moedas
package src.moedas;

//Criação da classe Dolar que herda da classe Moeda
public class Dolar extends Moeda {
  //Construtor da classe Dolar que recebe um valor double e passa o valor para a superclasse Moeda
  public Dolar(double valor) {
    super(valor);
  }
  //Método que retorna o tipo da moeda que neste caso é 2
  public int getTipo() {
    return 2;
  }

  //Método que imprime as informações da moeda Dolar e o seu valor total acumulado
  public void info() {
    System.out.printf("Moeda Dolar: Valor total acumulado: US$ %.2f%n", this.valor);
  }

  //Método para conversão do valor em Dolar para Real
  public double converter() {
    return this.valor * 5.00;
  } 
}