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
public class FlowControl02 {

    public static void main(String[] args) {

        int x = 5;
        switch (x) {
            case 1:
                System.out.println("Vc escolheu 1");
                break;
            case 2:
                System.out.println("Vc escolheu 2");
                break;
            case 3:
                System.out.println("Vc escolheu 3");
                break;
            case 4:
                System.out.println("Vc escolheu 4");
                break;
            case 5:
                System.out.println("Vc escolheu 5");
                break;
            default:
                System.out.println("escolha uma opcao valida");
        }

    }

}
