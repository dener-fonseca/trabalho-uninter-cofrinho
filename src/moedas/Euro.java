package src.moedas;

public class Euro extends Moeda {
  public Euro(double valor) {
    super(valor);
  }

  public int getTipo() {
    return 3;
  }

  public void info() {
    System.out.println("Moeda: Euro");
    System.out.println("Valor: " + this.valor + " Euros");
  }

  public double converter() {
    return this.valor * 5.50;
  } 
}