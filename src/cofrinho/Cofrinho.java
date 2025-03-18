package src.cofrinho;

import src.moedas.Moeda;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import src.moedas.Real;
import src.moedas.Dolar;
import src.moedas.Euro;

public class Cofrinho {
  private List<Moeda> ListaMoedas;

  public Cofrinho() {
    this.ListaMoedas = new ArrayList<>();
  }

  public void adicionar(Moeda moeda) {
    for(Moeda moedaCofrinho : this.ListaMoedas){
      if((novaMoeda instanceof Real && moedaCofrinho instanceof Real) || (novaMoeda instanceof Dolar && moedaCofrinho instanceof Dolar) || (novaMoeda instanceof Euro && moedaCofrinho instanceof Euro)) {
        moeda.setValor(moeda.getValor() + novaMoeda.getValor());
        return;
      }
    }
    this.ListaMoedas.add(moeda);
    System.out.println("Moeda adicionada com sucesso."); 
  }

   public void remover(int tipo, double valor) {
     Iterator<Moeda> iterator = this.ListaMoedas.iterator();

     while(iterator.hasNext()) {
       Moeda moeda = iterator.next();

       if ((tipo == 1 && moeda instanceof Real) ||
            (tipo == 2 && moeda instanceof Dolar) ||
            (tipo == 3 && moeda instanceof Euro)) {
         if (moeda.getValor() == valor) {
           moeda.setValor(moeda.getValor() - valor);
           System.out.println("Valor removido com sucesso.");
           if (moeda.getValor() == 0) {
             iterator.remove();
           }
           return;
            } else {
           System.out.println("Saldo insuficiente para remover.");
           return;
            }
          }
       }
    System.out.println("A moeda não foi encontrada.");
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