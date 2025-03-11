package src.moedas;

class Euro extends Moeda {
  public Euro(double valor) {
    super(valor);
  }

  @Override
  public void info() {
    System.out.println("Moeda: Euro");
    System.out.println("Valor: " + this.valor);
  }

  @Override
  public double converter() {
    return this.valor * 5.50;
  } 
}