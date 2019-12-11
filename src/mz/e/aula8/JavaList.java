
package mz.e.aula8;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author joseseie
 */
public class JavaList {
    
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();
        Integer num = 0;
                
        double num1 = 90.5;
                
        String[] strs = new String[10];
        
        // adição
        strs[0] = "Abel";
        strs[1] = "Teste";
        strs[2] = "Mário";
        strs[4] = "Claudio";
        
        lista.add(num1);
        
        
        lista.add("Abel");
        lista.add("Francisco");
        
        
        // apagar tudo
//        lista.clear();
        strs = new String[10];
        
        
        System.out.println("ArrayList tam: " + lista.size());
        System.out.println("ArrayList elements: " + lista.toString());
        System.out.println("Array Simples tam: " + strs.length);
        
        
    }
    
}
