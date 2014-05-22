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

        int codigo_convenio = 1;

        switch (codigo_convenio) {
            case 1:
                System.out.println("ronaldo.....1");
                vaiRonaldo(codigo_convenio);
                break;
            case 2:
                System.out.println("ronaldo.....2");
                break;
            case 3:
                System.out.println("ronaldo.....3");
                break;
            case 4:
                System.out.println("ronaldo.....4");
                break;
            case 5:
                System.out.println("ronaldo.....5");
                break;
            default:
                System.out.println("default.....  sem ronaldo ......");
        }

    }

    private static void vaiRonaldo(int x) {
        System.out.println("Ronaldo foi   x = " + x);
    }

}
