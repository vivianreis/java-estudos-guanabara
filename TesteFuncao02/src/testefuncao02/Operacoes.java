/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author VivianReis
 */
public class Operacoes {
    
    public static String contador(int i, int f){
        String s = "";
        for(int cc = i; cc <= f; cc++){
            s += cc + " ";
        }
        return s;
    }
    
}
