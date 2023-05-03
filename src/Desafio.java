import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoDeConta = "Corrente";
        System.out.println("Digite o nome do titular da conta");
        String nome = scanner.nextLine();
        System.out.println("Digite o saldo da sua conta");
        double saldoDaConta = scanner.nextDouble();

        System.out.println("********************************************");
        System.out.println("Titular da conta: " + nome);
        System.out.println("Tipo da conta: " + tipoDeConta);
        System.out.printf("Saldo da conta: %.2f%n", saldoDaConta);
        System.out.println("********************************************");

    }
}