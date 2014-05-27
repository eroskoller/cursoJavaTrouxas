/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavatrouxas._07_using_arrays;

/**
 *
 * @author eros
 */
public class ArrayDemo3 {

    public static void main(String[] args) {
        String[][] biDimentionArray = {{"00", "01", "02", "03", "04", "05"}, {"10", "11", "12", "13", "14", "15"}, {"20", "21", "22", "23", "24", "25"}, {"30", "31", "32", "33", "34", "35", "36"}};
//        String[][] biDimentionArray = new String[4][];
//        
//        biDimentionArray[0]  = new String[6];
//        biDimentionArray[0][0]  = "00";
//        biDimentionArray[0][1]  = "01";
//        biDimentionArray[0][2]  = "02";
//        biDimentionArray[0][3]  = "03";
//        biDimentionArray[0][4]  = "04";
//        biDimentionArray[0][5]  = "05";

        for (int i = 0; i < biDimentionArray.length; i++) {
            String[] arrayX = biDimentionArray[i];
            if (arrayX != null) {
                for (int y = 0; y < arrayX.length; y++) {
                    System.out.println(arrayX[ y]);
                }
                System.out.println("arrayX.length  = " + arrayX.length);
            }
        }
    }

}
