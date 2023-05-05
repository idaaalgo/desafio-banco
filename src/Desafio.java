import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
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

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while(opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> System.out.printf("Saldo da conta: R$%.2f\n", saldoDaConta);
                case 2 -> {
                    System.out.println("Qual valor você deseja transferir?");
                    double valorTransferido = scanner.nextDouble();
                    if (valorTransferido > saldoDaConta)
                        System.out.println("Saldo insuficiente para realizar a transferência...");
                    else saldoDaConta -= valorTransferido;
                    System.out.printf("Novo saldo da conta: R$%.2f\n", saldoDaConta);
                }
                case 3 -> {
                    System.out.println("Valor recebido: ");
                    double valorRecebido = scanner.nextDouble();
                    saldoDaConta += valorRecebido;
                    System.out.printf("Novo saldo da conta: R$%.2f\n", saldoDaConta);
                }
                case 4 -> System.out.println("Finalizando aplicação...");
                default -> System.out.println("Opção inválida...");
            }
        }
    }
}