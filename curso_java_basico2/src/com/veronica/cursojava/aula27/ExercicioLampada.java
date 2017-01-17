package com.veronica.cursojava.aula27;
/**
 *
 * @author veronica
 */

// Escreva  uma  classe  para  representar  uma  lâmpada.  Desenvolva  métodos   para  ligar,  desligar  a  lampada.
public class ExercicioLampada {
   
    public static void main(String[] args) {
        
        // Instanciando o objeto
        Lampada lampada = new Lampada();
        
        lampada.ligar(); // Chama o método ligar
        lampada.mostrarEstado(); // Chama o método mostrar estado ligado da lampada
        
        System.out.println();
        
        lampada.desligar(); // Chama o método ligar
        lampada.mostrarEstado(); // Chama o método mostrar estado desligado da lampada
        
        System.out.println();
        
        lampada.mudarEstado(); // Chama o método que muda o estado da lampada
        lampada.mostrarEstado();
    }
}
