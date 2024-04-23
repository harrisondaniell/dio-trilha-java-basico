import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o numero da sua agência: ");
        String agencia = sc.nextLine();


        System.out.println("Digite o seu nome completo: ");
        String nome = sc.nextLine();


        System.out.println("Digite o saldo atual da sua conta: ");
        double saldo = sc.nextDouble();

        System.out.printf("Numero da conta: %d %nNumero da agência: %s %nNome do titular: %s%nSaldo atual: %.2f",
                numero, agencia, nome, saldo);

        sc.close();


    }
}