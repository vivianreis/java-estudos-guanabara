/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author VivianReis
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r, s;
        n1 = 8;
        n2 = 14;
        r = (n1>n2)?n1:n2;      
        System.out.println(r);

        s = (n1>n2)?n1+n2:n1-n2;      
        System.out.println(s);
    }
    
}
