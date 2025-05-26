import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = scan.next();

        double saldo = 2500.00;

        System.out.println("*************************");
        System.out.println("Nome: " + nome);
        System.out.println("Saldo Inicial: R$" + saldo);
        System.out.println("*************************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\nOperações");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("O seu saldo é de: R$" + saldo);
            } else if (opcao == 2) {
                System.out.print("Digite o valor que você vai receber: ");
                double valorRecebido = scan.nextDouble();
                saldo += valorRecebido;
                System.out.println("Novo saldo: R$" + saldo);
            } else if (opcao == 3) {
                System.out.print("Digite o valor que você quer transferir: ");
                double valorTransferido = scan.nextDouble();
                if (valorTransferido > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldo -= valorTransferido;
                    System.out.println("Transferência realizada. Novo saldo: R$" + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scan.close();
    }
}
