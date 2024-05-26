import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao Banco Santander!\n");

        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
