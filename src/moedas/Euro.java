package src.moedas;

public class Euro extends Moeda {
  public Euro(double valor) {
    super(valor);
  }

  @Override
  public int getTipo() {
    return 3;
  }

  @Override
  public void info() {
    System.out.println("Moeda: Euro");
    System.out.println("Valor: " + this.valor + " euros");
  }

  @Override
  public double converter() {
    return this.valor * 5.50;
  } 
}