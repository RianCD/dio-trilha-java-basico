package br.com.ifba;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Bem vindo à GoodBank!!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Informe o numero da agencia: ");
        int numeroAgencia = sc.nextInt();
        System.out.println("Informe o seu nome: ");
        String nome = sc.next();
        System.out.println("Informe o seu saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Ola, " + nome + "! Obrigado por criar uma conta em nosso banco." +
                " Estes são os dados da sua conta: \nNumero da conta: " + numeroConta +
                "\nNumero da agencia: " + numeroAgencia + "\nSaldo: " + saldo);
    }
}