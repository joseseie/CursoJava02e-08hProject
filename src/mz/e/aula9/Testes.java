
package mz.e.aula9;

import java.util.ArrayList;

/**
 *
 * @author joseseie
 */
public class Testes {
    
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Abel", 10, "Gestor");
        Funcionario f1 = new Funcionario("Teste", 101, "Fachineiro");
        Funcionario f2 = new Funcionario("Bom funcionario", 13, "Teste");

        Gato g = new Gato();

        System.out.println("NOme do funcionario: " + f2.getNome() );
        System.out.println("Numero do funcionario: " + f2.getNum() );
        System.out.println("Posicao do funcionario: " + f2.getPosicao() );
        
        
    }
    
}
