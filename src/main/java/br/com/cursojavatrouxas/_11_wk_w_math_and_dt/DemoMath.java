/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._11_wk_w_math_and_dt;

/**
 *
 * @author eros
 */
public class DemoMath {
    
    
     public static float round(float valorFracionado, int casaDeAredondamento) {
         
                      float pow = (float)Math.pow(10,casaDeAredondamento);
                      System.out.println("pow: "+pow);
                      valorFracionado = valorFracionado * pow;
                      float round = Math.round(valorFracionado);
                      System.out.println("round: "+round);
                      return (float)round/pow;
    }
     
     
     public static double roundDoubles(double valor,int casas){
         double pow = Math.pow(10, casas);
         valor = valor*pow;
         double arredondade = Math.round(valor);
         return arredondade/pow;
     }
     
     public static double round2(double valor,int casas){
         double pow = Math.pow(10, casas);
         valor = valor*pow;
         double arredondado = Math.round(valor);
         return arredondado/pow;
     }

    
    
    public static void main(String[] args) {
        System.out.println(Math.PI);
        
        System.out.println("arredondado: "+round(10.12345f, 2));
        System.out.println("arredondado: "+roundDoubles(10.12345f, 2));
        System.out.println("arredondado: "+round2(10.12345f, 2));
        
        
//        System.out.println(Math.random());
        
        
        for (int i = 0; i < 10000; i++) {
            System.out.println((long)(Math.random()*(1000-0)));
        }
        
        
    }
    
}
