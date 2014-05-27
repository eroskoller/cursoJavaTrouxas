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
public class FlowControl03 {
    
    public static void main(String[] args) {
        
        
        String  atacante = "ronaldo";
        
        switch (atacante) {
            case "ronaldo":
                System.out.println("comer uma fejuca");
                break;
            case "cristiano":
                System.out.println("pentiar o cabelo...");
                break;
            case "neymar":
                System.out.println("vai cai .....");
                break;
            case "romario":
                System.out.println("fazer mais um filho");
                break;
            case "kaka":
                System.out.println("vai kagar...");
                break;
            case "maradona":
                System.out.println("cheiar tudo e mais um pouco...");
                break;
            default:
        }
    }
    
}
