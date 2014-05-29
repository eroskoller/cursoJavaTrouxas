/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._08_strings;

/**
 *
 * @author eros
 */
public class StringDemoSimple {
    
    public static void main(String[] args) {
        
        String s1 = "                       TM Rocks  .....                       ";
        String s2 = s1;
        
//        s1.concat("  dude..");
        
//        s1 = s1+"  sei lah ";
        String sx = s1.trim();
//        System.out.println(sx.substring(3, sx.length()-5));
        
        System.out.println(
                s1.contains("Rocks".subSequence(0, 5)));
        
        
    }
    
}
