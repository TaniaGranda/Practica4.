/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class For4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        //Declarar variables
        int i=0, n, m,res=0, res1=1, prom=0, suma=0, res2=0;
        
        for(i = 0; res1==1; i++){
            System.out.println("Ingrese las notas del estudiante");
            n=s.nextInt();
            m=s.nextInt();
            res=(n+m)/2;
            System.out.println(" Promedio "+res);
            System.out.println("Desea ingresar otro estudiante: 1.si 2.no");
            res1=s.nextInt();
            res2=res2+res;
        }
       
        prom=res2/i;
        System.out.println("Promedio aula: "+prom);        
        
    }
    
}
