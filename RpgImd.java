import java.util.Scanner;
import java.util.Random;


public class RpgImd {

    public static Scanner leitor = new Scanner(System.in);
    public static Random gerador = new Random();
    public static String nome;
    public static String sexo;
    public static String classe;
    public static int escolha;
    public static int level;
    public static int exp;
    public static int dificuldade = 5;
    public static int vida;
    public static int dadod20;
    public static int dadod10;
    public static int dadod6;
    public static boolean menub = true;
    public static boolean primeirab = true;

/* como usar o leitor
  tipo nome = leitor.nextTipo();
  System.out.println(nome);
*/

    public static void main(String[] args) {
      do{
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

      menu();

      for (int i = 0; i < 3; i++){
        System.out.println("");
      }
      for (int k = 0; k < 120; k++){
        System.out.print("=");
      }
      System.out.print("\n>");
      escolha = leitor.nextInt();
    } while(escolha != 5);
  }



    public static void menu(){ //Menu do RPG
      if (menub == true){
      System.out.println("\t\t\t\t\t\t>Menu\n");
      System.out.println("\t\t\t\t>Digite \"iniciar\" para iniciar");
      menub = false;
      }
      if ((menub == false) && (escolha == 10))  {
        menub = true;
      }
    }



    public static void d20(){ //Dado de 20 lados
      int dado20 = gerador.nextInt(20)+1;
      dadod20 = dado20;
      if (dado20 > dificuldade){
        System.out.println("d20 SUCESSO = " + dado20);
      }

      else{
        System.out.println("FALHA = " + dado20);
      }

    }



    public static void d10(){ //Dado de 10 lados
      int dado10 = gerador.nextInt(10)+1;
      dadod10 = dado10;
      if (dado10 > dificuldade){
        System.out.println("d10 SUCESSO =" + dado10);
      }

      else{
        System.out.println("FALHA");
      }
    }



    public static void d6(){ //Dado de 6 lados
      int dado6 = gerador.nextInt(6)+1;
      dadod6 = dado6;
      if (dado6 > dificuldade){
      System.out.println("d6 SUCESSO =" + dado6);
      }

      else{
        System.out.println("FALHA");
      }
    }



    public static void morte(){ //tela de morte
      if (vida <= 0) {
        System.out.println("Voce morreu, seu boboca");
      }
    }



    public static void primeira(){
      System.out.println("Ola, seja bem vindo ao mundo do Ascii");
    }



}
