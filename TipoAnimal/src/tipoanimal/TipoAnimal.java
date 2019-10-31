/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoanimal;

import java.util.Scanner;

/**
 *
 * @author VivianReis
 */
public class TipoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o número de pernas do animal:");
        int pernas = teclado.nextInt();
        if (pernas == 1){
            System.out.println("Tipo Saci");
        }else{
            if(pernas == 2){
                System.out.println("Tipo Bípede");
            }else{
                if(pernas == 4){
                    System.out.println("Tipo Quadrúpede");
                }else{
                   if(pernas == 6 || pernas == 8){
                       System.out.println("Tipo Aranha");
                   }else{
                       System.out.println("Tipo ET");
                   }
                }
            }
        }                     
    }
    
}
