/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Faça um programa que leia um número dado como entrada e apresente a mensagem “O número está na faixa de
    20 a 90” se o valor fornecido estiver entre 20 e 90, caso o valor fornecido não esteja entre 20 e 90 deverá exibir
    também a mensagem “O número está fora da faixa de 20 a 90”.
 */

import java.util.Scanner;

public class VerificarFaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero entre 20 a 90");
        int num = scanner.nextInt();
        if (num >= 20 && num <= 90){
            System.out.println("O numero esta na faixa de 20 a 90");
        }
        else {
            System.out.println("O numero esta fora da faixa de 20 a 90");
        }
    }
}
