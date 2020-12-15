
package testes;
import calculadora.de.imc.Imc;

public class TestandoIMc {
    public static void main(String[] args){
        Imc imc = new Imc();
        
        System.out.println("Digite seu peso: ");
        imc.setPeso();
        System.out.println("Digite sua altura: ");
        imc.setAltura();
        System.out.println("\n seu IMC é de: " + imc.calcularImc() + "\n");
        System.out.println("Saindo da aplicação.");
        
    }
}
