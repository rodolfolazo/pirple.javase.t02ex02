/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02ex02;

/**
 *
 * @author rodo
 */
public class T02ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aquí vamos a ver la máxima capacidad de int
        // -2147483648 <= integer <= 2147483647
        int x = 2147483647;
        int y = 2147483647;
        x = x + 1;
        System.out.println(x);
        System.out.println(++y);
        System.out.println(y+1);
        
        // Si hacemos un x = x + 1
    }
    
}
