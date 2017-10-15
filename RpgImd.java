import java.util.Scanner;
import java.util.Random;

public class RpgImd {

    public static Scanner leitor = new Scanner(System.in);
    public static int dificuldade = 5;
    public static Random gerador = new Random();
    public static String nome;
    public static String sexo;
    public static String classe;
    public static int level;
    public static int exp;
    public static String Tela;

/* como usar o leitor
  tipo nome = leitor.nextTipo();
  System.out.println(nome);
*/

    public static void main(String[] args) {
      
    }



    public static void menu(){ //Menu do RPG
      System.out.println("\tMenu\n");
      System.out.println("Digite \"iniciar\" para iniciar");
    }



    public static void d20(){ //Dado de 20 lados
      int dado20 = gerador.nextInt(20)+1;
      if (dado20 > dificuldade){
      System.out.println("d20 SUCESSO =" + dado20);
      }

      else{
        System.out.println("FALHA");
      }

    }



    public static void d10(){ //Dado de 10 lados
      int dado10 = gerador.nextInt(10)+1;
      if (dado10 > dificuldade){
      System.out.println("d10 SUCESSO =" + dado10);
      }

      else{
        System.out.println("FALHA");
      }
    }



    public static void d6(){ //Dado de 6 lados
      int dado6 = gerador.nextInt(6)+1;
      if (dado6 > dificuldade){
      System.out.println("d6 SUCESSO =" + dado6);
      }

      else{
        System.out.println("FALHA");
      }
    }



    public static void morte(){ //tela de morte
      System.out.println("Voce morreu, seu boboca");
    }



    public static void telainicial(){
      System.out.println("");
    }



}
