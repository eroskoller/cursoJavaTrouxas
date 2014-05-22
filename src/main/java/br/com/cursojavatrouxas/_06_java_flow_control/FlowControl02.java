/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavatrouxas._06_java_flow_control;

/**
 *
 * @author eros
 */
public class FlowControl02 {

    public static void main(String[] args) {
        int i = 0;
        while(true){
            i++;
            if(i == 5){
            }else if(i == 10) {
                break;
            }else{
                System.out.println("i = "+i);
            }
        }
        
            System.out.println(">>>>>   Fim     <<<<<<");
    }

}
