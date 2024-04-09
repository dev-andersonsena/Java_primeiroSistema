import java.util.Scanner;

public class sistema {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double SaldoInicial = 2500;
        int opcao = 0;


        System.out.println("************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta "+ tipoConta);
        System.out.println("Saldo atual: " + SaldoInicial);

        String menu = " **Digite sua opção **\n" +
              "1- Consultar saldo\n" +
              "2- Transferir valor\n" +
              "3- Receber valor\n" +
              "4- Sair\n";




        while( opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é : "+ SaldoInicial);
            } else if (opcao ==2) {
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > SaldoInicial) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    SaldoInicial -= valor;
                    System.out.println("Novo saldo" + SaldoInicial);

                }

               } else if (opcao ==3 ) {
                System.out.println("valor recebido: ");
                double valor = leitura.nextDouble();
                SaldoInicial += valor;
                System.out.println("Novo saldo: " + SaldoInicial );


            } else if (opcao != 4) {
                System.out.println("Opção invalida");

            }
        }

    }
}

