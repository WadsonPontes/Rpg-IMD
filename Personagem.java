public class Personagem extends RpgImd{


  private String classe;
  private String nome;
  private int idade;
  private int level;
  private int experiencia;
  private int dinheiro;
  private int vida;
  private int forca;
  private int inteligencia;
  private int constituicao;
  private int pontosPassivos;
  private int pontosAtivos;
  private int pontosAtributos;

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
    System.out.println("\t\t\t>SUA FICHA\n");
    System.out.println(">Nome: " + this.nome);
    System.out.println(">Classe: " + this.classe);
    System.out.println(">Idade: " + this.idade);
    System.out.println(">Vida: " + this.vida);
    System.out.println(">Level: " + this.level);
    System.out.println(">Experiencia(exp): " + this.experiencia);
    System.out.println(">Dinheiro: " + this.dinheiro);
    System.out.println("\n\n\t\t\t>STATUS");
    if(this.pontosAtributos > 0){
      System.out.println("\n\t\t>Pontos para gastar: " + this.pontosAtributos + "\n");
      System.out.println("\tint(+): " + this.inteligencia +  "     for(+): " + this.forca + "      const(+): " + this.constituicao);
    }
    else{
      System.out.println("\tint: " + this.inteligencia +  "     for: " + this.forca + "      const: " + this.constituicao);
    }
  }



  public void personagemNovo(){
    this.dinheiro = 100;
    this.level = 1;
    this.experiencia = 0;
    this.forca = 5;
    this.constituicao = 5;
    this.inteligencia = 5;
    this.pontosAtributos = 5;
    this.pontosPassivos = 2;
    this.pontosAtivos = 1;

    switch(classeNumero){
      case 1: this.vida = gerador.nextInt(20) + 101 + this.constituicao;
      break;
      case 2: this.vida = gerador.nextInt(20) + 101 + (this.constituicao / 2);
      break;
      case 3: this.vida = gerador.nextInt(20) + 101 + (this.constituicao / 3);
      break;
      default: this.vida = 100;
      break;
    }


  }


}
