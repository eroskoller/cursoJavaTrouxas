/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cursojavatrouxas._11_wk_w_math_and_dt;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.ejb.Local;

/**
 *
 * @author eros
 */
public class DateDemo1 {
    
    public static void main(String[] args) throws ParseException {
        Date agora = new Date();
        agora.setHours(0);
        
        Calendar  calendario = Calendar.getInstance();
        
//        calendario.set(Calendar.YEAR, 2012);
//        calendario.set(Calendar.MONTH, 1);
//        calendario.set(Calendar.DAY_OF_MONTH, 1);
//        calendario.set(Calendar.HOUR, 0);
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
//        Date d = calendario.getTime();
//        System.out.println(formatador.format(d));
        
//        DateFormat dtFormatador = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,new Locale("pt","BR"));
        
//        System.out.println(calendario.get(Calendar.WEEK_OF_YEAR));
//        System.out.println(dtFormatador.format(calendario.getTime()));
        System.out.println(calendario.getFirstDayOfWeek());
        
        
        
        System.out.println(formatador.parse("25/06/2014 20:10:15"));
        
        
                
        
    }
    
}
