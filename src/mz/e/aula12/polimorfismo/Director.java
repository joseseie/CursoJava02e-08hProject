
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
public class Director extends Funcionario {
    
    @Override
    public void trabalhar() {
        System.out.println("Director coordena o trabalho...");
    }
    
}
