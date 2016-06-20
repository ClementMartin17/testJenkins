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
public class CompteurCoinCoin implements EmissionSonore {

    private EmissionSonore decore;
    public static int compteur;   

    public CompteurCoinCoin(EmissionSonore d) {
        decore = d;
    }

    @Override
    public void EmetUnSon() {
        decore.EmetUnSon();
        compteur++;
    }

}
