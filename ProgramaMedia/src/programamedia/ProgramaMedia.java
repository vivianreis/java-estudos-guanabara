/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author VivianReis
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a nota da primeira prova: ");
        float n1 = teclado.nextFloat();
        System.out.print("Informe a nota da segunda prova: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2)/2;
        System.out.println("Sua média foi de: " + media);
        if (media > 9){
            System.out.println("Parabéns você foi aprovado!. Sua média foi: " + media);
        }
        else{
            System.out.println("Você foi reprovado sua média foi de: " + media + " estude mais!");
        }
    }       
    
}
