/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._03_java_fundamentals_part2;

/**
 *
 * @author eros
 */
public class Demo2 {
    
    public static void main(String[] args) {
        //Explicit cast
        
        short s1 = 32767;
        byte b1 = (byte)s1;
        
        int i1 = 100;
        byte b2 = (byte)i1;
        
        int i2 = 256;
        
        byte b3 = (byte) i2;
        
        System.out.println(b1);
        System.out.println(i1);
        System.out.println(b3);
    }
    
}
