
package mz.e.aula10;

import java.util.Vector;

/**
 *
 * @author joseseie
 */
public class Recursividade {
    
    // 10 = 10 + 9 + 8 + 7 + 6 + 5 + 4 ... 0;
    
    // 3 = 3 x 2 x 1;
    
    // String str = Julio. => J.u.l.i.o, Mateus => M.a.t.u.e.u.s
    // 
    
    // 3 = [2]
    
    // 10 = [10, 8, 6, 4, 2]
    
    
    static String pontuarNome (String nome) {
        
        if (nome.length() == 0) return "";
        
        
        String str0 = String.valueOf(nome.charAt(0));
        
        return str0 + "." + pontuarNome(nome.substring(1, nome.length()));
        
    }
    
    static Vector pares (Vector array, int numero) {
        
        if (numero == 0) 
            return array;
        
        if (numero % 2 == 0) 
            array.add(numero);
        
        
        return pares(array, numero -1);
        
    }
    
    static int factorial (int num) {
        
        if (num == 1) {
            return 1;
        }
            
        return num * factorial(num-1);
        
    }
    
    static int soma (int valor) {
        
        if (valor == 0) {
            return 0;
        }
        
        return valor + soma (valor -1);
    }
    
    public static void main(String[] args) {
        
        int valor = factorial(10);
        
        Vector v = pares(new Vector(), 13);
        
        String pont = pontuarNome("Fenias");
        
        System.out.println("Nome pontuado: " + pont);
        
//        System.out.println("Vector de pares: " + v.toString());
        
//        System.out.println("factorial: " + valor);
        
    }
    
}
