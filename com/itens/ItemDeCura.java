package com.itens;

public class ItemDeCura{
  private String nome;
  private int valor;
  private int cura;
  private int quantidade;



  public ItemDeCura(String nome, int valor, int cura, int quantidade){
    this.nome = nome;
    this.valor = valor;
    this.cura = cura;
    this.setQuantidade(quantidade);
  }



  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }



  public int getValor(){
    return this.valor;
  }
  public void setValor(int valor){
    this.valor = valor;
  }



  public int getCura(){
    return this.cura;
  }
  public void setCura(int cura){
    this.cura = cura;
  }



  public int getQuantidade(){
    return this.quantidade;
  }
  public void setQuantidade(int quantidade){
    if((quantidade > 3) || (this.quantidade > 3)){
      this.quantidade = 3;
      System.out.println("Voce ja tem 3 desse item em seu inventario, entao nao pode carragar mais com voce");
    }
    else{
      this.quantidade = quantidade;
    }
  }
}
