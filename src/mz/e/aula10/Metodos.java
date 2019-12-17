
package mz.e.aula10;

import java.util.Scanner;

/**
 *
 * @author joseseie
 */
public class Metodos {
    
    final String MEU_NOME = "Teste";

    static void myMethod (String textMInhaensagem) {
        System.out.println("myMethod() called: " + textMInhaensagem);
    }
    
    static void mostrarMensagem (String msg) {
        myMethod(msg);
        System.out.println(msg);
    }
    
    static String lerMsg (String nome) {
        Scanner s = new Scanner(System.in);
        System.out.println(nome + ", insira a mensagem desejada:");
        String msg = s.nextLine();

        return msg;
    }
    
    
    public static void main(String[] args) {
        
        String str = lerMsg ("Carlos");
        
        mostrarMensagem(str);

    }
    
}

