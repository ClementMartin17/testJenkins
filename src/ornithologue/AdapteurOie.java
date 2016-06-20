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
public class AdapteurOie extends Oie implements EmissionSonore {

    Oie oie;

    public AdapteurOie(Oie o) {
        this.oie = o;
    }

    @Override
    public void EmetUnSon() {
        oie.cancanne();
    }

}
