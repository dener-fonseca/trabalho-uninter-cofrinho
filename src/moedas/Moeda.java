//Definição de que a classe Moeda pertence ao pacote src.moedas
package src.moedas;

//Criação da classe abstrata Moeda que servirá como base para as outras classes usarem seus atributos e métodos
public abstract class Moeda {
  //Declaração de atributo protected do tipo double que armazena o valor da moeda
  protected double valor;

  //Construtor da classe Moeda que recebe um valor double e passa o valor para o atributo valor
  public Moeda(double valor) {
    this.valor = valor;
  }

  //Método público que retorna o valor armazenado na moeda
  public double getValor() {
    return this.valor;
  }

  //Método que pode modificar o valor armazenado na moeda
  public void setValor(double valor) {
    this.valor = valor;
  }

  //Método abstrato que deve ser implementado por subclasses que retorna o tipo da moeda que neste caso é 0
  public abstract int getTipo();
  //Método abstrato que imprime as informações da moeda e o seu valor total acumulado
  public abstract void info();
  //Método para conversão de outros valores para Real
  public double converter(){
    return this.valor;
  }
}