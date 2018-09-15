package com.main;

import java.util.Scanner;
import java.util.Random;
import com.history.player.Personagem;
import java.io.IOException;

public class RpgImd{

    public static Scanner leitor = new Scanner(System.in);
    public static Random gerador = new Random();
    public static Personagem jogador = new Personagem();
    public static int escolha;
    public static int classeNumero;
    public static int dadod20;
    public static int dadod10;
    public static int dadod6;
    public static boolean menu_primeira = true;
    public static String claida;
    public static String ignorarEnter;

/* como usar o leitor
  tipo nome = leitor.nextTipo();
  int pinto = leitor.nextInt();
  System.out.println(nome);
*/

    public static void main(String[] args) throws IOException, InterruptedException{

      jogador.setVida(500);

      do{

        topo();
        //meio da tela

        switch(escolha){
          case 1: primeira();
            break;
          case 2: fichaJ();
            break;
          case 3: distriAtributos();
            break;
          case 190: ajudar();
            break;
          case 301: testeB();
            break;
          case 302: testeA();
            break;
          case 303: testeC();
          default: menu();
            break;
        }

        if(jogador.upou() == true){
          jogador.LevelUp();
        }

        if(jogador.getVida() < 1){
          morte();
        }



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



    public static void d20(){ //Dado de 20 lados
      int dado20 = gerador.nextInt(20)+1;
      dadod20 = dado20;
    }



    public static void d10(){ //Dado de 10 lados
      int dado10 = gerador.nextInt(10)+1;
      dadod10 = dado10;
    }



    public static void d6(){ //Dado de 6 lados
      int dado6 = gerador.nextInt(6)+1;
      dadod6 = dado6;
    }



    public static void morte() throws IOException, InterruptedException{ //tela de morte
      topo();
        jogador.morto();
    }



    public static void primeira() throws IOException, InterruptedException{
        System.out.println(">Ola, seja bem vindo ao mundo do Ascii");
        System.out.println(">Aqui voce encontra-se presente em um mundo de rpg");
        System.out.println(">Voce passara por muitas aventuras e certamente ira se divertir");
        System.out.println(">Digite \"2\" para criar o seu personagem");
        base();

        escolha = leitor.nextInt();
        if(escolha == 2){

          topo();

          criarJogador();

        }
    }



    public static void ajudar() throws IOException, InterruptedException{
      Ferramentas f = new Ferramentas();
      if(escolha == 190) {
        f.digitar("\t\t\t\t>TELINHA DE AJUDA\n\n\n"
        +">Digite \"1\" para iniciar o rpg\n"
        +">Digite \"666\" para sair do rpg\n"
        +">Digite \"0\" para voltar ao menu\n"
        +">Digite \"190\" para retornar a esta tela\n"
        +">Digite \"2\" para ver a ficha do personagem\n"
        +">Digite \"3\" para distribuir os pontos de atributos\n", 10);
        }
    }



    public static void fichaJ(){
        jogador.fichaPlayer();
    }



    public static void criarJogador() throws IOException, InterruptedException{
      System.out.print(">Digite o nome do personagem");
      base();
      ignorarEnter = leitor.nextLine();
      claida = leitor.nextLine();
      jogador.setNome(claida);

      topo();
      System.out.println("\n\t\t>CLASSES\n\n");
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
        case 999: jogador.setClasse("Capivara");
          break;
        default: jogador.setClasse("Aprendiz");
          break;
      }
      jogador.personagemNovo();
      topo();
      System.out.println(">Digite a idade do personagem");
      base();
      escolha = leitor.nextInt();
      jogador.setIdade(escolha);

      topo();
      jogador.fichaPlayer();
    }



      public static void topo() throws IOException, InterruptedException{
        Ferramentas f = new Ferramentas();
      f.limparTela();
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


    public static void distriAtributos() throws IOException, InterruptedException{
      jogador.distribuirAtributos();
    }



    public static void testeB(){
      jogador.setVida(jogador.getVida() - 100);
    }



    public static void testeA(){
      jogador.setExperiencia(jogador.getExperiencia() + 999999999);
    }



    public static void testeC(){
      jogador.AtaqueBasico();
    }

}
