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
public class DemoMath1 {
    
    public static float rountFloat(float valor,int precision){
        return DemoMath.round(valor, precision);
    }
    
    public static void main(String[] args) {
//        System.out.println(rountFloat(234.45678f, 4));
        
        for (int i = 0; i < 100; i++) {
            System.out.println((long)   (  Math.random()*100   )     );
        }
        
    }
            
}
