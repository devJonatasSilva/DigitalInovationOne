/*
 *o objetivo desta aula é entendercomo funciona o optional, 
 *sendo o optional uma boa forma de se trabalhar com valores nulos
 *  o optional possui 2 estados:
        * presente
        * nulo
 *  permite que se trabalhe com valores que podem ser nulos,
sem se preocupar com as famosas NullPointExeptions.
 */

/*
                    exercicio final

1- criar um optional de um determinado tipo de dado
    ° crie com estado vazio, estado presente, e com null
    ° se presente exiba o valor no console
    ° se vazio, lance uma exeção IlegalStateExeption
    ° se vazio exiba "Optional nvakzio" no console
    ° se presente, trasforme o valor e exiba no console
    ° se presente, pegue o valor do optional e atribua em uma variavel
    ° se presente filtre o optional com uma determinada regra de negocio
*/
package Implementando_Collections_e_Streams_com_Java;
import java.util.Optional;

import java.util.Optional;

/**
 *
 * @author jony
 */
public class Ultilizando_o_Optional {
    
    public static void main(String[] args){
        
        Optional<String> optionalString = Optional.of("valor presente");
        
        System.out.println("valor opcional está presente");
        optionalString.ifPresentOrElse(System.out.println, () -> System.out.println("não está presente"));
    }
    
}
