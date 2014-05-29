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
public class StringDemoSBuilder {
    
    public static void main(String[] args) {
        
        
        StringBuffer sb = new StringBuffer();
        sb.append("1T2|3M4 5|6R7|8 9o0|c|k|s");
        
         System.out.println(sb.insert(2, "  tadeu   "));
         
//         System.out.println(sb.replace(2, 12, "").toString().split("\\R"));
         
//         String[] arrayStr = sb.replace(2, 12, "").toString().split("\\|");
//         
//         for (int i = 0; i < arrayStr.length; i++) {
//             System.out.println(arrayStr[i]);
//        }
         
         System.out.println(sb.toString().replaceAll("\\D", "").toString());
         
         char[] arrayChar = "TM Rocks....".toCharArray();
         
         
         System.out.println(new String(arrayChar));
    }
    
}
