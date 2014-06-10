/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._11_wk_w_math_and_dt;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author eros
 */
public class DemoDates {
    
    public static void main(String[] args) throws ParseException {
            Date hoje = new Date();
            DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, Locale.ITALY);
            GregorianCalendar gCalendar = new GregorianCalendar(new Locale("pt", "BR"));
            SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MM/yyyy");
            
//            System.out.println(dateFormat.format(hoje));
//            System.out.println(simpleformat.format(hoje));
//            String strDtformatada = simpleformat.format(hoje);
//            System.out.println(strDtformatada );
//            System.out.println(simpleformat.parse(strDtformatada));
//            System.out.println(gCalendar.get(Calendar.DAY_OF_YEAR));
//            System.out.println(gCalendar.get( Calendar.DAY_OF_WEEK ) );
//            System.out.println((new Date()).getTime());
            
    }
    
}
