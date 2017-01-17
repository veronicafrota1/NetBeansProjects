package com.veronica.cursojava.aula24;

/**
 *
 * @author veronica
 */
public class ExercicioLivro {
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        
        livro.titulo = "Cidade dos ossos";
        livro.codigo = 1234;
        livro.idioma = "Português";
        livro.autor = "Cassandra Clary";
        livro.assunto = "Juvenil";
        livro.tipoCapa = "Brochura";
        livro.nomeEditora = "Intriseca";
        livro.edicao = 1;
        livro.numPagina = 462;
        livro.anoLancamento = 2010;
        livro.preco = 65;
                
        
        System.out.println(livro.titulo);
        
        
    }
}
