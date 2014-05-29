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
public class StringDemo1 {
    
    public static void main(String[] args) {
            String s1 = "TM Rocks";
            String s2 = s1;
            String s3 = "TM Rocks";
            
//            System.out.println(s1.contains("2Rocks1".subSequence(1, 6)));
            s2 += "dude .";
            StringBuilder sb1 = new StringBuilder();
            sb1.append("TM Rocks");
            
            StringBuilder sb2 = sb1;
            sb2.append(" dude .");
            
            
            System.out.println(s1);
            System.out.println(s2);
            
            System.out.println(sb1);
            System.out.println(sb2);
            sb2.insert(15, "    ----------------    ");
            System.out.println(sb2);
            System.out.println(sb2.reverse());
            System.out.println(sb2.reverse());
            System.out.println(sb2.replace(15, 39, " replace"));
            System.gc();
    }
    
}
