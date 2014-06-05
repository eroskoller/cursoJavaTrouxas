/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._11_wk_w_math_and_dt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author eros
 */
public class DemoDates {
    
    public static void main(String[] args) {
            Date hoje = new Date();
            DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, Locale.ITALY);
            
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            
            System.out.println(dateFormat.format(hoje));
            System.out.println(format.format(hoje));
            
    }
    
}
