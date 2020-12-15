/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.de.imc;

import java.util.Scanner;

/**
 *
 * @author jony
 */
public class Imc {
    
    Scanner input = new Scanner(System.in);
    
    private double altura;
    private double peso;
    
    
    public void setAltura(){       
        this.altura = input.nextDouble();        
    }
    
    public double getAltura(){        
        return this.altura;
    }
    
    public void setPeso(){
        this.peso = input.nextDouble();
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public double calcularImc(){
        double resultado = this.peso / (this.altura * this.altura);
        return resultado;
    }
    
}
