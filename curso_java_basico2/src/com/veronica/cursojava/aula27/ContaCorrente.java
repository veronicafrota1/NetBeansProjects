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
public class ContaCorrente {

    String numero;
    String agencia;
    double limiteEspecial;
    double valorEsecialUsado;
    double saldo;
    boolean especial;
    
    
    boolean RealizarSaque(double quantiaASacar) {
        //Tem saldo na conta
        if(saldo <= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        }
        else { //Não tem saldo na conta, verificar o cheque especial
            if(especial) {
                //Verifica se o limite especial tem saldo
                double limite = limiteEspecial - saldo;
                
                if(limite <= quantiaASacar) {
                        saldo -= quantiaASacar;
                        return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false; //Se não conter cheque especial
            }
        }
    }
}