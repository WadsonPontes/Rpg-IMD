public class Personagem{
  String classe;
  String nome;
  int idade;
  int level;
  int experiencia;
  int dinheiro;
  int vida;

  public Personagem(String classe, String nome, int idade, int level, int experiencia, int dinheiro, int vida){

  }


  public String getClasse(){ //demonstra a classe do Personagem
    return classe;
  }



  public void setClasse(String classe){ //define a classe do personagem
   this.classe = classe;
 }



  public String getNome(){ //demonstra o nome do personagem
    return nome;
  }



  public int getIdade(){ //demonstra a idade do personagem
    return idade;
  }



  public int getLevel(){ //demonstra o level do personagem
    return level;
  }



  public int getExperiencia(){ //demonstra a experiencia do personagem
    return experiencia;
  }



  public int getDinheiro(){ //demonstra o dinheiro do personagem
    return dinheiro;
  }



  public int getVida(){ //demonstra a vida do personagem
    return vida;
  }


}
