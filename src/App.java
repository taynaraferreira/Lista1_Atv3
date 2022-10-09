import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("informe um numero");
       int numero1 = sc.nextInt();
       System.out.println("informe o segundo numero");
       int numero2 = sc.nextInt();
       sc.close();
       int soma = numero1+numero2;
       System.out.println(" resultado " + soma);

    }
}
