/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patika.pkg2;

import java.util.Scanner;
public class Patika2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner inp= new Scanner(System.in);
       int n;
       
        System.out.print("Enter an integer: ");
        n = inp.nextInt();
        
        for( int i=1; i<=n; i*=2){
            System.out.println(i);
        }
        
    }
    
}
