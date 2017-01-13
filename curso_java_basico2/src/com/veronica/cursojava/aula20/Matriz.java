package com.veronica.cursojava.aula20;

import java.util.Scanner;

/**
 *
 * @author veronica
 */
public class Matriz {
    public static void main(String[] args) {
        
        /**
         * 
         * Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24
         * horas, onde para cada uma destas 24 horas podemos associar um tarefa específica (compromisso agendado). O programa 
         * deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o 
         * compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso 
         * armazenado.
         */
        
        Scanner scan = new Scanner(System.in);
        
        int[][] compromissos = new int[30][24]; // 30 dias; 24 horas
        
        boolean sair = false;
        int opcao;
        
        // Menu de opções
        while(!sair) { // Enquanto sair for verdadeiro, executa-se os comandos
            System.out.println("Digite 1 para adiionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            
            opcao = scan.nextInt();
            
            if(opcao == 1) { // Adicionar compromisso
                // Dia
                boolean diaValido = false;
                int dia = 0;
                
                while(!diaValido) { // Enquanto diaValido for verdadeiro
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    
                    if(dia > 0 && dia <= 31) {
                        diaValido = true; // Se a condição for verdadeira, a variavel dia receberá o valor
                    }
                    else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                // Fim dia
                
                // Hora
                boolean horaValida = false;
                int hora = 0;
                
                while(!horaValida) { // Enquanto horaValida for verdadeira
                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    
                    if(hora >= 0 && hora <= 24) {
                        horaValida = true; // Se a condição for verdadeira, a variavel hora receberá o valor
                    }
                    else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                // Fim Hora
                
                dia--; // Realiza-se o decremento para ser acessada a posição numero 0, ou seja, a primeira posição da matriz
                System.out.println("Digite o compromisso:");
                compromissos[dia][hora] = scan.nextInt();
                
            }
            else if(opcao == 2) { // Verificar Compromisso
                // Dia
                boolean diaValido = false;
                int dia = 0;
                
                while(!diaValido) { // Enquanto diaValido for verdadeiro
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    
                    if(dia > 0 && dia <= 31) {
                        diaValido = true; // Se a condição for verdadeira, a variavel dia receberá o valor
                    }
                    else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                // Fim dia
                
                // Hora
                boolean horaValida = false;
                int hora = 0;
                
                while(!horaValida) { // Enquanto horaValida for verdadeira
                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    
                    if(hora >= 0 && hora <= 24) {
                        horaValida = true; // Se a condição for verdadeira, a variavel hora receberá o valor
                    }
                    else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                // Fim Hora
                
                dia--; // Realiza-se o decremento para ser acessada a posição numero 0, ou seja, a primeira posição da matriz
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[dia][hora]);
                
            }
            else if(opcao == 0) { // Sair
                sair = true; // Se a opcao for verdadeira o programa será encerrado.
            }
            else {
                System.out.println("Opção inválida, digite novamente");// Caso nenhuma opção for válida
            }
        }
        
    }
}
