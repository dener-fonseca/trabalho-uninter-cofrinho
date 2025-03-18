package src.moedas;

public class Real extends Moeda {
  public Real(double valor) {
    super(valor);
  }

  public int getTipo() {
    return 1;
  }

  public void info() {
    System.out.println("Moeda: Real");
    System.out.println("Valor: " + this.valor + " Reais");
  }

  public double converter() {
    return this.valor;
  } 
}