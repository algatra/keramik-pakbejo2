/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttwo;

/**
 *
 * @author alfarkhan
 */
public class ProjectTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Keramik2 A = new Keramik2(30*30,10,54000,"A");
        A.hitungHarga();
        
        Keramik2 B = new Keramik2(40*40,5,65000,"B");
        B.hitungHarga();
        
        Keramik2 C = new Keramik2(30*40,8,60000,"C");
        C.hitungHarga();
    }
    
}
