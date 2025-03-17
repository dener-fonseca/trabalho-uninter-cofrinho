package src.moedas;

public class Real extends Moeda {
  public Real(double valor) {
    super(valor);
  }

  @Override
  public void info() {
    System.out.println("Moeda: Real");
    System.out.println("Valor: " + this.valor + " reais");
  }

  @Override
  public double converter() {
    return this.valor;
  } 
}