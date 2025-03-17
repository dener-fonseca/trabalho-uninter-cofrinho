package src.moedas;

public abstract class Moeda {
  protected double valor;

  public Moeda(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return this.valor;
  }

  public abstract void info();
  public abstract double converter();
}