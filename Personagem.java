public class Personagem{


  private String classe;
  private String nome;
  private int idade;
  private int level;
  private int experiencia;
  private int dinheiro;
  private int vida;

  public Personagem(){

  }



  public String getClasse(){ //demonstra a classe do Personagem
    return this.classe;
  }



  public void setClasse(String classe){ //define a classe do personagem
   this.classe = classe;
  }



  public String getNome(){ //demonstra o nome do personagem
    return this.nome;
  }



  public void setNome(String nome){
    this.nome = nome;
  }



  public int getIdade(){ //demonstra a idade do personagem
    return this.idade;
  }



  public void setIdade(int idade){
    this.idade = idade;
  }



  public int getLevel(){ //demonstra o level do personagem
    return this.level;
  }



  public void setLevel(int level){
    this.level = level;
  }



  public int getExperiencia(){ //demonstra a experiencia do personagem
    return this.experiencia;
  }



  public void setExperiencia(int experiencia){
    this.experiencia = experiencia;
  }



  public int getDinheiro(){ //demonstra o dinheiro do personagem
    return this.dinheiro;
  }



  public void setDinheiro(int dinheiro){
    this.dinheiro = dinheiro;
  }



  public int getVida(){ //demonstra a vida do personagem
    return this.vida;
  }



  public void setVida(int vida){
    this.vida = vida;
  }



  public void fichaPlayer(){
    System.out.println("\t\t>SUA FICHA\n\n\n");
    System.out.println(">Seu Nome e: " + this.nome);
    System.out.println(">Sua Classe e: " + this.classe);
    System.out.println(">Sua Idade e: " + this.idade);
    System.out.println(">Voce tem " + this.vida + " de Vida");
    System.out.println(">Seu Level e: " + this.level);
    System.out.println(">Voce tem " + this.experiencia + " de Experiencia");
    System.out.println(">Voce tem " + this.dinheiro + " de Dinheiro");
  }



  public void personagemNovo(){
    this.dinheiro = 100;
    this.level = 1;
    this.experiencia = 0;
  }


}
