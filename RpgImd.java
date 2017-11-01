import java.util.Scanner;
import java.util.Random;


public class RpgImd{

//PEDRO PRA MIM É VIADO <3

    public static Scanner leitor = new Scanner(System.in);
    public static Random gerador = new Random();
    public static int escolha;
    public static int dificuldade = 5;
    public static int classeNumero;
    public static boolean menu_primeira = true;
    public static String claida;
    public static String ignorarEnter;
    public static Personagem jogador = new Personagem();

/* como usar o leitor
  tipo nome = leitor.nextTipo();
  System.out.println(nome);
*/

    public static void main(String[] args) {

      do{

        topo();
        //meio da tela

        menu();
        ajudar();
        primeira();
        fichaJ();

        base();

        escolha = leitor.nextInt();
      } while(escolha != 666);


  }



    public static void menu(){ //Menu do RPG
      if ((escolha == 9) || (menu_primeira == true)){
      System.out.println(">Menu\n");
      System.out.println(">Digite \"1\" para iniciar");
      System.out.println(">Digite \"190\" para olhar o menu de ajuda");
      menu_primeira = false;
      }
    }



    public static int d20(){ //Dado de 20 lados
      int dado20 = gerador.nextInt(20)+1;
      return dado20;
    }



    public static int d10(){ //Dado de 10 lados
      int dado10 = gerador.nextInt(10)+1;
      return dado10;
    }



    public static int d6(){ //Dado de 6 lados
      int dado6 = gerador.nextInt(6)+1;
      return dado6;
    }



    public static void morte(){ //tela de morte
        System.out.println(">Voce morreu, seu boboca");
    }



    public static void primeira(){
      if(escolha == 1){
        System.out.println(">Ola, seja bem vindo ao mundo do Ascii");
        System.out.println(">Aqui voce encontra-se presente em um mundo de rpg");
        System.out.println(">Voce passara por muitas aventuras e certamente ira se divertir");
        System.out.println(">Digite \"2\" para criar o seu personagem");
        base();

        escolha = leitor.nextInt();
        if(escolha == 2){

          topo();

          criarJogador();

          base();

        }
      }
    }



    public static void ajudar(){
      if(escolha == 190) {
        System.out.println(">\t\t\t\t TELINHA DE AJUDA");
        System.out.println(">Digite \"1\"   para iniciar o rpg");
        System.out.println(">Digite \"666\" para sair do rpg");
        System.out.println(">Digite \"9\" para voltar ao menu");
        System.out.println(">Digite \"190\" para retornar a esta tela");
        System.out.println(">Digite \"5\" para ver a sua ficha de personagem");
      }
    }



    public static void fichaJ(){
      if(escolha == 5){
        jogador.fichaPlayer();
      }
    }



    public static void criarJogador(){
      System.out.print(">Digite o seu nome");
      base();
      ignorarEnter = leitor.nextLine();
      claida = leitor.nextLine();
      jogador.setNome(claida);

      topo();
      System.out.print("\n>Digite \"1\" para Espadachim, \"2\" para Arqueiro, ou \"3\" para Mago\n");
      System.out.println(">Qualquer outro valor sera considerado aprendiz");

      base();

      classeNumero = leitor.nextInt();

      switch(classeNumero){
        case 1: jogador.setClasse("Espadachim");
          break;
        case 2: jogador.setClasse("Arqueiro");
          break;
        case 3: jogador.setClasse("Mago");
          break;
        default: jogador.setClasse("Aprendiz");
      }
      jogador.personagemNovo();
      topo();
      System.out.println(">Parabens, voce conseguiu " + jogador.getVida() + " de vida");
      System.out.println(">Digite sua idade");
      base();
      escolha = leitor.nextInt();
      jogador.setIdade(escolha);


      limpar();
    }



    public static void topo(){
      for (int i = 0; i < 150; i++){
        System.out.println("");
      }
      for (int j = 0; j < 120; j++){
        System.out.print("=");
      }
      System.out.print("");
      for (int i = 0; i < 2; i++){
        System.out.println("");
      }
    }



    public static void base(){
      for (int i = 0; i < 3; i++){
        System.out.println("");
      }
      for (int k = 0; k < 120; k++){
        System.out.print("=");
      }
      System.out.print("\n>");
    }



    public static void limpar(){
      for (int i = 0; i < 150; i++){
        System.out.println("");
      }
    }

}
