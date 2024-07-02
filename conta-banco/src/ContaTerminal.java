import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite por favor seu nome: ");
    String nome = sc.next();

    System.out.println("Digite por favor sua agência: ");
    String agencia = sc.next();

    System.out.println("Digite por favor sua conta: ");
    int numero = sc.nextInt();

    System.out.println("Digite por favor seu saldo: ");
    double saldo = sc.nextDouble();


    System.out.printf("Olá %s, obrigada por criar uma conta em nosso banco, sua agência é %s, sua conta %d e seu saldo %.2f já está disponivel para saque.", nome,agencia,numero,saldo);




    }
}