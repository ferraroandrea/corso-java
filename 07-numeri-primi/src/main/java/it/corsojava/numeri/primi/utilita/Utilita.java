/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.numeri.primi.utilita;

/**
 *
 * @author java
 */
public class Utilita {
    public static boolean isNumeroPrimo2(int numero) {
        if (numero < 2) {
            return false;
        }
        boolean primo = true;
        int divisore = 2;
        while (divisore < numero && primo == true) {
            if (numero % divisore == 0) {
                primo = false;
            }
            divisore++;
        }
        return primo;
    }
}
