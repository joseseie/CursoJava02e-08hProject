
package mz.e.aula12.polimorfismo;

/**
 *
 * @author joseseie
 * @author Horcha Chambule
 * @author Fenias Manhenge
 * @author Alfredo Francisco
 * @author Iben Enky
 * @author Abdul Rasac
 * @author Micaela Freitas
 * @author Nicolas Muchate
 * @author Hassan Mutola
 */
public class Chefe extends Funcionario {

    private String nome = "Mateus";
    
    @Override
    public void atrasar() {

        System.out.println("O chefe " + this.nome +", atrasou... que feio!");

    }
    
    
    
}
