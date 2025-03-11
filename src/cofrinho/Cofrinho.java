package src.cofrinho;

import src.moedas.Moeda;

import java.util.ArrayList;

class Cofrinho {
  private ArrayList<Moeda> ListaMoedas;

  public Cofrinho() {
    this.ListaMoedas = newArrayList<>();
  }

  public void adicionar(Moeda moeda) {
    this.ListaMoedas.add(moeda);
    System.out.println(" A moeda adicionada com sucesso."); 
  }

   public void remover(Moeda moeda) {
    if(this.ListaMoedas.remove(moeda)) {
       System.out.println("A moeda removida com sucesso.");
     } else {
       System.out.println("A moeda não foi encontrada.");
     }
   }

  public void listagemMoedas() {
    if(this.ListaMoedas.isEmpty()){
      System.out.println("O cofrinho está vazio.");
    } else {
      System.out.println("Moedas no confrinho:");
      for(Moeda moeda : this.ListaMoedas) {
      moeda.info();
      }
    }  
  }

  public double totalConvertido() {
    double total = 0;
    for(Moeda moeda : this.ListaMoedas) {
      total += moeda.converter();
    }
    return total;
  } 
}