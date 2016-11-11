/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio14;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Unidad3Ejercicio14 {

    public static Scanner tc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int dia, mes, anio;

        mes = pedirMes();
        System.out.println("Introduce el primer limite ");
        int l1 = tc.nextInt();
        System.out.println("Introduce el segundo limite");
        int l2 = tc.nextInt();
        anio = pedirAnio(l1, l2);

        dia = pedirDia(mes, anio);
            

        //siguienteDia(dia,mes,anio);
    }

    public static int pedirMes() {
        int n;
        do {
            System.out.println("Introduce el mes");
            n = tc.nextInt();
        } while (n < 1 || n > 12);
        return n;
    }

    public static int pedirAnio(int l1, int l2) {

        int anio;
        do {
            System.out.println("Introduce el año");
            anio = tc.nextInt();

        } while (anio <= l1 || anio >= l2);
        return anio;
    }

    public static int pedirDia(int mes, int anio) {

        int dia;
        do {
            System.out.println("Introduce el dia");
            dia = tc.nextInt();
        } while (dia < 1 || dia > 31);
        switch (mes){
        
            case 2:
            if (dia >=1 && dia <=28)    
                ;break;
                
        }
            
            
            
        return dia;
    }

}
/*public static int siguienteDia(int l1, int l2){
    
    while (n > 1 && n <=12);
    return n;  
    }**/

/**
 * contruir una Fecha actual, calcular el dia siguiente pedir mes 1 - 12
 * pedriAnio (2000,2016) pedirdia (mes, anio) por teclado dia 
 *
 */
