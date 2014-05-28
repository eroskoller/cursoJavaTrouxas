/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._05_java_flow_control;

/**
 *
 * @author eros
 */
public class FlowControlDoWhile {
    
    public static void main(String[] args) {
        
        int i = 0;

        do{
            i ++;
            System.out.println("  fazendo algo  i = "+i);
            if(i == 50)
            break;
        }while (true);

        
    }
    
}
