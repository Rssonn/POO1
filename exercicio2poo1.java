import java.util.*;
public class Main
  {
  public static void main(String[] args) {
    System.out.println("Digite o valor do seu salário mensal:");
    Scanner scan = new Scanner (System.in);
    double salario = scan.nextFloat();
    if(salario<1000){
      salario=salario*0.10;
      System.out.println("O bônus é de 10%");
    }
    else if((salario>=1000)&&(salario<=2000)){
      salario=salario*0.05;
      System.out.println("O bônus é de 5%");
    }
    else{
    salario=salario*0.02;
    System.out.println("O bônus é de 2%");
    }
  }
}
