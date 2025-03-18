package src.moedas;

public class Dolar extends Moeda {
  public Dolar(double valor) {
    super(valor);
  }
  
  public int getTipo() {
    return 2;
  }

  public void info() {
    System.out.println("Moeda: Dolar");
    System.out.println("Valor: " + this.valor + " Dólares");
  }

  public double converter() {
    return this.valor * 5.00;
  } 
}