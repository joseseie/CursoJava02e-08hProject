
package mz.e.aula9;

/**
 *
 * @author joseseie
 */
public class Funcionario {
    
    private String nome;
    private int num;
    private String posicao;
    
    // Construtor
    public Funcionario (String nome, int num, String posicao) {
        this.nome = nome;
        this.num = num;
        this.posicao = posicao;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public int getNum () {
        return this.num;
    }
    
    public String getPosicao () {
        return this.posicao;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
}
