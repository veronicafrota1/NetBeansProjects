package com.veronica.cursojava.aula27;

import java.util.Scanner;

/**
 *
 * @author veronica
 */

/**
 * 
 * Escreva uma class para representar um Aluno. Adicione atributos relacionados às caracteristicas de um Aluno, como nome, matricula,
 * curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva um método para
 * verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa
 * classe, que pede as informações  do  aluno  ao usuário e ao final informa o nome das	 disciplinas, mostra as notas e  mostra
 * seo aluno foi aprovado ou não.
 */

public class ExercicioAluno {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.println("Entre com o nome do aluno:");     
        aluno.nome = scan.nextLine();
        
        System.out.println("Entre com o nome do curso:");
        aluno.nomeCurso = scan.next();
        
        System.out.println("Entre com o número da matricula:");
        aluno.matricula = scan.next();
        
        //Instânciando a array do nome da disciplina
        aluno.nomeDisciplina = new String[3];
        for(int i = 0; i < aluno.nomeDisciplina.length; i++) {
            System.out.println("Entre com o nome da disciplina:");
            aluno.nomeDisciplina[i] = scan.next();
        }
        
        //Instânciando a array da nota da disciplina
        aluno.notasDisciplina = new double[3][4];
        for(int i=0 ; i < aluno.notasDisciplina.length; i++) {
            System.out.println("Obtendo nota da disciplina: " +  aluno.nomeDisciplina[i]);
            
            for(int j = 0; j < aluno.notasDisciplina[i].length; j++) {
                System.out.println("Entre com a " + (j+1) + " nota:");
                aluno.notasDisciplina[i][j] = scan.nextDouble();
            }
        }
        
        aluno.mostrarInfo();
        
    }
}
