package com.itens;

public class ArmaDeCorte{
  private String nome;
  private int valor;
  private int dano;
  private int durabilidade;

  public ArmaDeCorte(){

  }

  public String getNome(){
    return this.nome;
  }
  public int getValor(){
    return this.valor;
  }
  public int getDano(){
    return this.dano;
  }
  public int getDurabilidade(){
    return this.durabilidade;
  }
  public void setDurabilidade(int durabilidade){
    this.durabilidade = durabilidade;
  }

}
