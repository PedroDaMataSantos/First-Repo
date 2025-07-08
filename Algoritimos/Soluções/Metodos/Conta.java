/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author xamax
 * @date 07/07/2025
 * @brief class $(name)
 *
 */
public class Conta {

    private double saldo;
    private String tipo;

    public Conta(double valorInicial) {
        this.saldo = valorInicial;
        this.tipo = "Corrente";
    }

    public Conta(double valorInicial, String tipo) {
        this.saldo = valorInicial;
        this.tipo = tipo;
    }

    public boolean depositar(double v) {

        if (tipo.equalsIgnoreCase("Corrente") && v > 1000) {
            System.out.println("Por questoes de seguranca esse deposito nao podera ser feito");
            return false;
        } else {
            saldo = saldo + v;
            return true;

        }
    }

    public boolean saque(double v) {

        if (v <= saldo) {
            saldo = saldo - v;
            return true;

        }
        System.out.println("Saldo insuficiente");
        return false;

    }

    public boolean transferir(double v, Conta ContaDestino) {
        if (ContaDestino.tipo.equalsIgnoreCase("Corrente") && this.tipo.equalsIgnoreCase("Poupanca")) {
            System.out.println("Nao e possivel realizar esta transferencia , verifique as condicoes e tente novamente");
            return false;
        } else if (v > saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            this.saldo -= v;
        }
        ContaDestino.saldo += v;
        return true;

    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha o tipo de Conta\n1 - Corrente\n2 - Poupanca");
        int opcao = ler.nextInt();
        String tipoConta;

        switch (opcao) {
            case 1:
                tipoConta = "Corrente";
                break;
            case 2:
                tipoConta = "Poupanca";
                break;
            default:
                System.out.println("Tipo invalido. A conta será criada como Corrente por padrao.");
                tipoConta = "Corrente";
                break;
        }

        System.out.println("Deposite um valor para criar a conta:");
        double valor = ler.nextDouble();

        Conta c1 = new Conta(valor, tipoConta);
        Conta c2 = null;

        System.out.println("Deseja cria outra conta?\n0-Nao\n1-Sim,poupanca\n2-Sim,corrente");
        String tipoConta2 = "";
        int rsp = ler.nextInt();
        if (rsp == 1 || rsp == 2) {

            if (rsp != 1 || rsp == 2) {
                tipoConta2 = "Corrente";
            } else {
                tipoConta2 = "Poupanca";
            }
            c2 = new Conta(0, tipoConta2);

        } else if (rsp == 0) {
            System.out.println("Selecione a operacao:\n1-Saque\n2-Deposito\n3-Sair");
            int op = ler.nextInt();
            while (op != 3) {
                switch (op) {
                    case 1:
                        System.out.println("Digite o valor que deseja sacar ");
                        double s = ler.nextInt();
                        c1.saque(s);
                        System.out.printf("Voce fez um saque de R$%.2f  da sua conta %s\nSeu saldo atual e de:R$%.2f\n", s, tipoConta, c1.saldo);
                        System.out.println("Selecione outra opcao");
                        op = ler.nextInt();
                        break;
                    case 2:
                        System.out.println("Digite o valor do deposito");
                        double d = ler.nextDouble();
                        c1.depositar(d);
                        System.out.printf("Voce fez um deposito de R$%.2f  para sua conta %s\nSeu saldo atual e de:R$%.2f\n", d, tipoConta, c1.saldo);
                        System.out.println("Selecione outra opcao");
                        op = ler.nextInt();
                        break;

                    default:
                        break;
                }
            }
        }
        if (c2 != null) {
            System.out.println("Escolha sua conta\n1-Conta 1(" + tipoConta + ")\n2-Conta 2 (" + tipoConta2 + ")\n3-Sair");
            int conta = ler.nextInt();
            while (conta != 3) {
                if (conta == 1) {
                    System.out.println("Digite a operacao:\n1-Saque\n2-Deposito\n3-Trasnferir\n4-Sair\n5-Trocar de Conta ");
                    int op2 = ler.nextInt();
                    while (op2 != 4) {
                        switch (op2) {
                            case 1:
                                System.out.println("Digite o valor que deseja sacar ");
                                double s = ler.nextInt();
                                c1.saque(s);
                                System.out.printf("Voce fez um saque de R$%.2f  da sua conta 1 (%s)\nSeu saldo atual e de:R$%.2f\n", s, tipoConta, c1.saldo);

                                break;
                            case 2:
                                System.out.println("Digite o valor do deposito");
                                double d = ler.nextDouble();
                                c1.depositar(d);
                                System.out.printf("Voce fez um deposito de R$%.2f  para sua conta 1 (%s)\nSeu saldo atual e de:R$%.2f\n", d, tipoConta, c1.saldo);
                                ;
                                break;
                            case 3:
                                System.out.println("Digite o valor da transferencia");
                                double t = ler.nextDouble();
                                c1.transferir(t, c2);
                                System.out.printf("Voce fez uma transferencia de R$%.2f  da sua conta 1(%s) para sua conta 2 (%s)\nSeu saldo atual e de:R$%.2f\n", t, tipoConta, tipoConta2, c1.saldo);
                                System.out.printf("Saldo da conta 2: R$%.2f\n", c2.saldo);
                                ;
                            case 5:

                                conta = 2;

                                break;
                            default:
                                System.out.println("Opcao invalida");

                        }
                        if (op2 != 5) {
                            System.out.println("Selecione outra opcao");
                            op2 = ler.nextInt();
                        } else {
                            op2 = 4;
                        }
                    }
                } else if (conta == 2) {
                    System.out.println("Digite a operacao:\n1-Saque\n2-Deposito\n3-Trasnferir\n4-Sair\n5-Trocar de Conta");
                    int op2 = ler.nextInt();
                    while (op2 != 4) {
                        switch (op2) {
                            case 1:
                                System.out.println("Digite o valor que deseja sacar ");
                                double s = ler.nextInt();
                                c2.saque(s);
                                System.out.printf("Voce fez um saque de R$%.2f  da sua conta 2 (%s)\nSeu saldo atual e de:R$%.2f\n", s, tipoConta2, c2.saldo);
                                break;
                            case 2:
                                System.out.println("Digite o valor do deposito");
                                double d = ler.nextDouble();
                                c2.depositar(d);
                                System.out.printf("Voce fez um deposito de R$%.2f  para sua conta 2 (%s)\nSeu saldo atual e de:R$%.2f\n", d, tipoConta2, c2.saldo);

                                break;
                            case 3:
                                System.out.println("Digite o valor da transferencia");
                                double t = ler.nextDouble();
                                c2.transferir(t, c1);
                                System.out.printf("Voce fez uma transferencia de R$%.2f  da sua conta 2(%s) para sua conta 1 (%s)\nSeu saldo atual e de:R$%.2f\n", t, tipoConta2, tipoConta, c2.saldo);
                                System.out.printf("Saldo da conta 1: R$%.2f\n", c1.saldo);

                            case 5:
                                conta = 1;
                            default:
                                System.out.println("Opcao invalida");

                        }
                        if (op2 != 5) {
                            System.out.println("Selecione outra opcao");
                            op2 = ler.nextInt();
                        } else {
                            op2 = 4;
                        }
                    }
                } else {
                    System.out.println("Essa conta nao existe");
                    conta = 3;

                    if (conta != 3) {
                        System.out.println("\nDeseja operar em qual conta agora?\n1 - Conta 1\n2 - Conta 2\n3 - Sair");
                        conta = ler.nextInt();
                    }
                }

            }
        }
    }
}
