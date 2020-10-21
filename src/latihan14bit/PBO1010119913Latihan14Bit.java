/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan14bit;

/**
 *
 * @author Muhammad Alvin Rizqi Ramadhan
 * @author NIM 10119913
 * Kelas : IF10K
 * Deskripsi Program : Program Class Kambing
 */
public class PBO1010119913Latihan14Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;
        
        c = a & b;
        System.out.println("a & b = " + c);
        
        c = a | b;
        System.out.println("a | b = " + c);
        
        c = a ^ b;
        System.out.println("a ^ b = " + c);
        
        c = ~a;
        System.out.println("~a = " + c);
        
        c = a << 2;
        System.out.println("a << 2 = " + c);
        
        c = a >> 2;
        System.out.println("a >> 2 = " + c);
    }
    
}
