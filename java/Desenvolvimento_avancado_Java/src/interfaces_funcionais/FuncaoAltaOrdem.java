/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_funcionais;

/**
 *
 * @author jony_
 */
public class FuncaoAltaOrdem {
    
    public static void main(String[] args){
        Soma soma = (numero1, numero2) -> numero1 + numero2; 
        System.out.println(realizarSoma(soma, 200,100));
    }
    public static int realizarSoma(Soma soma, int numero1, int numero2){
        return soma.somar(numero1, numero2);
    }    
}

interface Soma{
    public int somar(int numero1, int numero2);
}
