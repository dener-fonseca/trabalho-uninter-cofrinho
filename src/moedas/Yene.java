//Definição de que a classe Yene pertence ao pacote src.moedas
package src.moedas;

//Criação da classe Yene que herda da classe Moeda
public class Yene extends Moeda {
  //Construtor da classe Yene que recebe um valor double e passa o valor para a superclasse Moeda
  public Yene(double valor) {
    super(valor);
  }
  //Método que retorna o tipo da moeda que neste caso é 5
  public int getTipo() {
    return 5;
  }

  //Método que imprime as informações da moeda Yene e o seu valor total acumulado
  public void info() {
    System.out.printf("Moeda Dolar: Valor total acumulado: ¥ %.2f%n", this.valor);
  }

  //Método para conversão do valor em Yene para Real
  public double converter() {
    return this.valor * 0.04;
  } 
}