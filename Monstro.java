public class Monstro{


  private String tipo; //tipo de monstro
  private String nome;
  private String classe;
  private int vida;
  private int level;


  public Monstro(){

  }



  public String getTipo(){
    return this.tipo;
  }



  public void setTipo(String tipo){
    this.tipo = tipo;
  }



  public String getNome(){
    return this.nome;
  }



  public void setNome(String nome){
    this.nome = nome;
  }



  public String getClasse(){
    return this.classe;
  }



  public void setClasse(String classe){
    this.classe = classe;
  }



  public int getVida(){
    return this.vida;
  }



  public void setVida(int vida){
    this.vida = vida;
  }



  public int getLevel(){
    return this.level;
  }



  public void setLevel(int level){
    this.level = level;
  }

}
