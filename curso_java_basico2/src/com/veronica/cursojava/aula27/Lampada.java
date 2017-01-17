package com.veronica.cursojava.aula27;
/**
 *
 * @author veronica
 */

// Escreva  uma  classe  para  representar  uma  lâmpada.  Desenvolva  métodos   para  ligar,  desligar  a  lampada.
public class Lampada {
    
    String modelo;
    String cor;
    String tipoLuz;
    String tensao;
    int potencia;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    
    boolean ligada = true;
    
    // Método para ligar lâmpada
    void ligar() {
        ligada = true;
    }
    
    // Método para deligar lâmpada
    void desligar() {
        ligada = false;
    }
    
    // Método para mostrar estado da lampada
    void mostrarEstado() {
        if(ligada) {
            System.out.println("A lampada esta ligada.");
        }
        else {
            System.out.println("A lampada está desligada");
        }
    }
    
    // Método para mudar o estado da lampada
    void mudarEstado() {
        if(ligada) { 
            desligar(); // Chama o método desligar
        }
        else {
            ligar(); // Chama o método ligar
        }
    }
}
