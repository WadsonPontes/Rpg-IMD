import java.util.Scanner;
import java.util.Random;

public class RpgImd {

    public static Scanner leitor = new Scanner(System.in);
    public static int dificuldade;
    public static Random gerador = new Random();


    public static void main(String[] args) {
      int linha = leitor.nextInt();
      System.out.println(linha);
    }

    public static void Menu(){
      System.out.println("Menu");
      System.out.println("Digite 1 para iniciar");
    }

    public static int d20(){
      int dado20 = gerador.nextInt(20)+1;
      return dado20;
    }

    public static int d10(){
      int dado10 = gerador.nextInt(10)+1;
      return dado10;
    }

    public static int d6(){
      int dado6 = gerador.nextInt(6)+1;
      return dado6;
    }
}
