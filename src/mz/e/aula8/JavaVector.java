/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.aula8;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author joseseie
 */
public class JavaVector {
    
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();
        Vector vector = new Vector(2);
        
        Integer num = 0;
                
        double num1 = 90.5;
        
        lista.add("Abel");
        lista.add("Francisco");
        
        vector.add("Abel");
        vector.add("Francisco");
        
        System.out.println("ArrayList tam: " + lista.size());
        System.out.println("ArrayList elements: " + lista.toString());
        
        System.out.println("Vector tam: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity());
        System.out.println("Vector elements: " + vector.toString());

        
        
    }
    
}
