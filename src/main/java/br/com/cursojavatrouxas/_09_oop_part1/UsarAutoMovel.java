/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavatrouxas._09_oop_part1;

import java.util.*;

/**
 *
 * @author eros
 */
public class UsarAutoMovel {

    public static void main(String[] args) {

        ArrayList<AutoMovel> listAutoMovels = new ArrayList<>();

        listAutoMovels.add(new AutoMovel(4, "turbo", 300, "blue", 46));
        listAutoMovels.add(new Onibus(6, 30));
        listAutoMovels.add(new Carro(5, 400));
        listAutoMovels.add(new Moto());

        AutoMovel am3 = new AutoMovel(10, "diesel", 300, "azul", 46);
        AutoMovel onibus = new Onibus(10, 50);
        AutoMovel carro = new Carro(2, 201);

        ArrayList<AutoMovel> listAutoMovel = new ArrayList<>();
        listAutoMovel.add(am3);
        listAutoMovel.add(onibus);
        listAutoMovel.add(carro);
        listAutoMovel.add(new Moto());
        listAutoMovel.add(new Cupee(4, 500));

        for (int i = 0; i < listAutoMovel.size(); i++) {
            AutoMovel a = listAutoMovel.get(i);
//            if(a instanceof Onibus){
//                System.out.println("A eh um intancia de um Onibus..");
//            }else if(a instanceof Carro){
//                Carro c = (Carro) a;
//                c.movimentar();
//            }else if(a instanceof Moto){
////                a.movimentar();
//                Moto m = (Moto) a;
//                m.movimentar();
//            }else if(a instanceof Cupee){
//                System.out.println("Esse sim ehn prayboy....");
//            }

//            if(a instanceof Utilitario){
//                Utilitario u = (Utilitario) a;
//                u.levaAFamiliaParaViajar();
//                u.pagaIPVAcaroPacas();
//                u.carregaAsCompras();
//            }
//            if(a instanceof TrioEletricoAmbulante){
//                TrioEletricoAmbulante t = (TrioEletricoAmbulante) a;
//                t.temSomInterno();
//            }
            if (a instanceof Conversivel) {
                System.out.println("djdjdfhjdhjeeherh");
            }

        }

    }

}
