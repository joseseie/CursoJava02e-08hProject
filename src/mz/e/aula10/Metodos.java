
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
    
    static String lerMsg (int idade, String nome) {
        Scanner s = new Scanner(System.in);
        String stratamento = (idade > 21 && idade < 30) ? "Jovem" 
                : (idade > 31) ? "Sr. " : "";
        
        System.out.println(stratamento + " " + nome + ", insira a mensagem desejada:");
        String msg = s.nextLine();

        return msg;
    }
    
    static String lerMsg () {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira a mensagem desejada:");
        String msg = s.nextLine();

        return msg;
    }
    
    
    public static void main(String[] args) {
        
//        String str = lerMsg ();
//        String str1 = lerMsg ("Carlos");
        String str2 = lerMsg (29, "Carlos");
        
        mostrarMensagem(str2);
        

    }
    
}

