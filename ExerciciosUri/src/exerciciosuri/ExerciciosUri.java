/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosuri;

import java.util.Scanner;

/**
 *
 * @author VivianReis
 */
public class ExerciciosUri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Ex: 1001
        
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int soma = a + b;
        
        System.out.println("X = " + soma);
        */
        
        Scanner teclado = new Scanner(System.in);        
        float r = teclado.nextFloat();
        float n = 3.14159f;

        double raioQuadrado = Math.pow(r, 2);
        double area = n * raioQuadrado;
        System.out.printf("A=%.4f\n", area); 
        
    }
    
}
