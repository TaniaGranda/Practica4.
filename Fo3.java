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
public class Fo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        int i=1, n, z=0, za=0;
        System.out.println("ingrese un limite");
        n=s.nextInt();
        for(i = 0; i <=n; i++){
            if (i%2==0){
                z=i*1;
                za+=z;
                System.out.println("(1*"+i+")+");
            }else{
                z=2*i;
                za+=z;
                System.out.println("(2*"+i+")+");
            }
            
        }
        System.out.println("resultado"+za);
    }
    
}
