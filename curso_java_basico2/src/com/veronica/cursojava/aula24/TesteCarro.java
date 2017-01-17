package com.veronica.cursojava.aula24;

/**
 *
 * @author veronica
 */
public class TesteCarro {
    public static void main(String[] args) {
        
        // Criação dos ojetos da van
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println("Marca:" + van.marca);
        System.out.println("Modelo:" + van.modelo);
        System.out.println("Número de passageiros:" + van.numeroPassageiros);
        System.out.println("Capacidade de Combustível:" + van.capacidadeCombustivel);
        System.out.println("Consumo de Combustível:" + van.consumoCombustivel + " \n");
        
        
        // Criação dos objetos do fusca
        Carro fusca = new Carro();
        fusca.marca = "volkswagen";
        fusca.modelo = "Fusca";
        fusca.numeroPassageiros = 4;
        fusca.capacidadeCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        
        System.out.println("Marca:" + fusca.marca);
        System.out.println("Modelo:" + fusca.modelo);
        System.out.println("Número de passageiros:" + fusca.numeroPassageiros);
        System.out.println("Capacidade de Combustível:" + fusca.capacidadeCombustivel);
        System.out.println("Consumo de Combustível:" + fusca.consumoCombustivel);
        
        van.exibirAutonomia();
        fusca.exibirAutonomia();
        
        // Chamando o método
        double qtdCombustivel = van.calcularCombustivel(10);
        
        System.out.println("qtdCombustivel:" + qtdCombustivel);
    }
}
