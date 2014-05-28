/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._07_using_arrays;

/**
 *
 * @author eros
 */
public class ArrayDemo1Complex {
    
    public static void main(String[] args) {
        
//        String [ ] [ ]  arrayBidimention = new String [2] [];
        String [ ] [ ]  arrayBidimention = {{"00","01","02"},{"10","11","12","13"},{"20","21"}};
        
//            for (int i = 0; i < arrayBidimention.length ; i++) {
//                String[] arrayInterna = arrayBidimention[i];
//                for (int j = 0; j < arrayInterna.length; j++) {
//                    System.out.println(arrayInterna[j]);
//                }
//            }
        
        System.out.println(arrayBidimention[0][2]);
    }
    
}
