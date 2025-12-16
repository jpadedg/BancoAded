import java.util.Scanner;

import model.ContaBancaria;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta = null;
        int option = 0;
        var scanner = new Scanner(System.in);

        do {
            System.out.println("===============================");
            System.out.println("=== Bem vindo ao Banco Aded ===");
            System.out.println("Selecione uma das opcoes abaixo:");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Cheque especial");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opcao: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Digite o nome do titular: ");
                    String titular = scanner.nextLine();
                    System.out.print("Digite o valor do cheque especial: ");
                    double chequeEspecial = scanner.nextDouble();
                    scanner.nextLine(); 

                    try{
                        conta = new ContaBancaria(titular, chequeEspecial);
                        System.out.println("Conta criada com sucesso!");
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    
                case 2:
                    if (conta == null) {
                        System.out.println("Voce nao tem nenhuma conta. Por favor, crie uma conta primeiro.");
                        break;
                    }

                    System.out.println("Saldo atual: " + conta.getSaldoAtual());
                    break;

                case 3:
                    if (conta == null) {
                        System.out.println("Voce nao tem nenhuma conta. Por favor, crie uma conta primeiro.");
                        break;
                    }

                    System.out.print("Digite o valor a depositar: ");
                    double deposito = scanner.nextDouble();
                    scanner.nextLine(); 
                    conta.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 4:
                    if (conta == null) {
                        System.out.println("Voce nao tem nenhuma conta. Por favor, crie uma conta primeiro.");
                        break;
                    }

                    System.out.print("Digite o valor a sacar: ");
                    double saque = scanner.nextDouble();
                    scanner.nextLine();

                    try{
                        conta.sacar(saque);
                        System.out.println("Saque realizado com sucesso!");
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        break;
                    } 

                case 5:
                    showMenuCheque(conta, scanner);
                    break;                    

                default:
                    break;
            }
        } while (option != 6);
    }

    public static void showMenuCheque(ContaBancaria conta, Scanner scanner) {
        int chequeOptions = 0;

        if (conta == null) {
            System.out.println("Voce nao tem nenhuma conta. Por favor, crie uma conta primeiro.");
            return;
        }

        do {
            System.out.println("===============================");
            System.out.println("=== Tela do Cheque especial ===");
            System.out.println("Selecione uma das opcoes abaixo:");
            System.out.println("1 - Consultar limite do cheque especial");
            System.out.println("2 - Consultar saldo do cheque especial que esta sendo usado");
            System.out.println("3 - Ajustar limite do cheque especial");
            System.out.println("4 - Voltar ao menu principal");
            System.out.print("Escolha uma opcao: ");
            chequeOptions = scanner.nextInt();
            scanner.nextLine(); 
            double saldoChequeEspecial = conta.getSaldoAtual() < 0 ? -conta.getSaldoAtual() : 0;

            switch (chequeOptions) {
                case 1:
                    System.out.println("Limite do cheque especial: " + conta.getChequeEspecialLiberado());  
                    break;
            
                case 2:
                    System.out.println("Saldo do cheque especial que esta sendo usado: " + saldoChequeEspecial);
                    break;
                
                case 3:
                    System.out.print("Digite o novo limite do cheque especial: ");
                    double newLimitCheque = scanner.nextDouble();
                    scanner.nextLine(); 
                    if (newLimitCheque < saldoChequeEspecial) {
                        System.out.println("Novo limite nao pode ser menor que o saldo do cheque especial que esta sendo usado. Valor atual: " + saldoChequeEspecial);
                        break;
                    }

                    try{
                        conta.setChequeEspecialLiberado(newLimitCheque);
                        System.out.println("Limite do cheque especial atualizado com sucesso!");
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                default:
                    break;
            }
        } while (chequeOptions != 4);
    }
}
