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
public class FlowControlForSimple {
    
    public static void main(String[] args) {
        
        int i = 0;
        
        while(true){
            System.out.println("antes do break...... i = "+i);
            i ++;
            
            if(i == 50){
                continue;
            }else if(i == 100){
                break;
            }
            System.out.println("depois do break......");
        }
        
    }
    
}
