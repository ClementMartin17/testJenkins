/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornithologue;

/**
 *
 * @author Clément
 */
public class Chasseur implements Observateur {

    @Override
    public void reagit(Observable o) {
        System.out.println("PAN! PAN!"); }
    
}
