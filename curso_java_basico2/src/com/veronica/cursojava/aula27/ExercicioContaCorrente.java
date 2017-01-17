package com.veronica.cursojava.aula27;

/**
 *
 * @author veronica
 */

/**
* 
* Cria um classe para representar uma conta corrente que possui um número, um saldo,um status que informa se ela é especial
* ou não, um limite.Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques),despositar
* dinheiro,consultar saldo e verificar se o cliente está usando cheque especial ou não.Desenvolva um programa para testar
* essa  classe.
*/
   
public class ExercicioContaCorrente {
    
    public static void main(String[] args) {
    
        //Instanciando a conta corrente
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        conta.valorEsecialUsado = 0;
        
        boolean saqueEfetuado = conta.RealizarSaque(10); 
        
        if(saqueEfetuado) {
            System.out.println("Saque efeutuado com sucesso");
            System.out.println("Saldo atual da cont: " + conta.saldo);
        }
        else { 
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente");
        }
    }
}
