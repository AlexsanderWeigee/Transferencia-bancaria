import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("\n***********************************");

        String menu = """
                \n** Dígite sua opção **\n
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                ***********************************         
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            double valor = 0;
            if (opcao == 1) {
                System.out.println("O saldo atual é R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                valor = leitura.nextInt();
                if (valor > saldo) {
                    System.out.println("Não há saldo sufiviente para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: R$ " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
