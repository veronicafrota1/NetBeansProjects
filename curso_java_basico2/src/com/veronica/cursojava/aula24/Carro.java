package com.veronica.cursojava.aula24;

/**
 *
 * @author veronica
 */
public class Carro {
    
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;
    
    // Método sem retorno
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é:" + capacidadeCombustivel * consumoCombustivel);
    }
    
    // Método com retorno
    double obterAutonomia() {
        return capacidadeCombustivel * consumoCombustivel;
    }
    
    // Método com retorno e parametro
    double calcularCombustivel(double km) {
        
        double qtdCombustivel = km / consumoCombustivel;
        
        return qtdCombustivel;
                
    }
    
}
