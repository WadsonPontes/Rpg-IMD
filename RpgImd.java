import java.util.Scanner;

public class RpgImd {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
      int linha = leitor.nextInt();
      System.out.println(linha);
      Menu();
    }

    public static void Menu(){
      System.out.println("Menu");
      System.out.println("Digite 1 para iniciar");

    }
}
