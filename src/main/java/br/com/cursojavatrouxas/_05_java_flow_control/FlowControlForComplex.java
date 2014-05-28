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
public class FlowControlForComplex {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {

            switch (i) {
                case 0:
                    System.out.println("case 0:");
                    while (i < 3) {
                        i++;
                        System.out.println("i = " + i);
                    }
                    break;
                case 1:
                    System.out.println("case 1:");
                    break;
                case 2:
                    System.out.println("case 2:");
                    break;
                case 3:
                    System.out.println("case 3:");
                    System.out.println("valor de i = " + i);
                    break;
                case 4:
                    System.out.println("case 4:");
                    System.out.println("valor de i = " + i);
                default:
                    System.out.println("default = " + i);
            }
        }
    }

}
