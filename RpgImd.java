import java.util.Scanner;
import java.util.Random;

public class RpgImd {

    public static Scanner leitor = new Scanner(System.in);
    public static int dificuldade = 5;
    public static Random gerador = new Random();

/* como usar o leitor
  int linha = leitor.nextInt();
  System.out.println(linha);
*/

    public static void main(String[] args) {
      menu();
    }



    public static void menu(){
      System.out.println("\tMenu\n");
      System.out.println("Digite \"iniciar\" para iniciar");
    }



    public static void d20(){
      int dado20 = gerador.nextInt(20)+1;
      if (dado20 > dificuldade){
      System.out.println("d20 SUCESSO =" + dado20);
      }

      else{
        System.out.println("FALHA");
      }

    }



    public static void d10(){
      int dado10 = gerador.nextInt(10)+1;
      if (dado10 > dificuldade){
      System.out.println("d10 SUCESSO =" + dado10);
      }

      else{
        System.out.println("FALHA");
      }
    }



    public static void d6(){
      int dado6 = gerador.nextInt(6)+1;
      if (dado6 > dificuldade){
      System.out.println("d6 SUCESSO =" + dado6);
      }

      else{
        System.out.println("FALHA");
      }
    }
}
