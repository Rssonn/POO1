import java.util.*;
public class Main
  {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número:");
    int x = scan.nextInt();
    if(x%2==0){
     System.out.println("O valor é par");
    }
    else{
      System.out.println("O valor é ímpar");
    }
  }
}
