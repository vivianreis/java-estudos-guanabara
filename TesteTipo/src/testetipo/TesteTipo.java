/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipo;

/**
 *
 * @author VivianReis
 */
public class TesteTipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor = "30.5";
        float idade = Float.parseFloat(valor); 
        System.out.printf("%.3f", idade);
    }   
}
