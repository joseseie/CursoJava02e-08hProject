
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
public abstract class Pessoa {
    
    String nome;
    private int idade;
    private char sexo;

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    // metodos adicionais
    
    /**
     * Metodo atrasar de uma pessoa qualquer.
     */
    public void atrasar () {
        System.out.println("A pessoa atrasou");
    }
    
    public void entrar () {
        System.out.println("A pessoa entrou");
    }
    
    public void sair () {
        System.out.println("A pessoa saiu");
    }
    
    public void tocir () {
        System.out.println("A pessoa tociu");
    }
    
}
