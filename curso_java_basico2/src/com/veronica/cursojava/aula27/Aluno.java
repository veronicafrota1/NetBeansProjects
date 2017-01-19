package com.veronica.cursojava.aula27;

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
public class Aluno {
    String nome;
    String nomeCurso;
    String matricula;
    String[] nomeDisciplina;
    double[][] notasDisciplina;
    
    //Método para mostrar as informações do aluno
    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Nome do Curso: " + nomeCurso);
        System.out.println("Número da Matricula: " + matricula);
        System.out.println("Nome da Disciplina: " + nomeDisciplina);
        
        for(int i = 0; i < notasDisciplina.length; i++) {
            System.out.println("Notas da Disciplina: " + nomeDisciplina[i]);
            
            for(int j = 0; j < notasDisciplina[i].length; j++) {
                System.out.println(notasDisciplina[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    //Método para verificar aprovação
    boolean verificarAprovado(int indice) {
        
        if(obterMedia(indice) >= 7) {
            return true; //Aprovado
        }
        else {
            return false; //Reprovado
        }
    }
    
    //Método para mostrar a média
    double obterMedia(int indice) {
        double soma = 0;
        
        for(int i = 0; i < notasDisciplina[i].length; i++) {
            soma += notasDisciplina[indice][i]; //Realiza a soma das notas da 4 disciplinas
        }
        
        double media = soma / 4; //Realiza o calculo da média
        
        return media;
    }
}
