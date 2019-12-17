
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
public class TesteHeranca {
    
    public static void main(String[] args) {
        
//        Pessoa pessoa  = new Pessoa();
        
        Funcionario chefe = new Chefe();
        chefe.setNome("Marcos");
//        Pessoa funcionario = new Funcionario();
        Pessoa director = new Director();
        Funcionario faxineiro = new Faxineiro();
        Pessoa visitante = new Visitante();
        visitante.setNome("João");
        
        chefe.trabalhar();
        faxineiro.trabalhar();
       
//        chefe.atrasar();
//        visitante.atrasar();
//        
    }
    
}
