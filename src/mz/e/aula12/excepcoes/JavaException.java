
package mz.e.aula12.excepcoes;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joseseie
 */
public class JavaException {
    
    static int lerNumero () throws Exception {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int num = s.nextInt();
        
        return  num;
    }
    
    public static void main(String[] args) {
        int num = -1;
        do {
            try {
            
                num = lerNumero();
                System.out.println("Numero lido: " + num);
            
            } catch (Exception ex) {
                System.err.println("Metodo de ler numero chamado, mas lancou uma excepcao.");
            }
        } while (num < -1);
        
        
        
    }
    
}
