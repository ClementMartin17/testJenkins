/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornithologue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Clément
 */
public class CanardObservable implements EmissionSonore, Observable {

    EmissionSonore nomObservableDecore;
    List<Observateur> observateurs;

    public CanardObservable(EmissionSonore e) {
        nomObservableDecore = e;
        observateurs = new ArrayList<Observateur>();
    }

    @Override
    public void EmetUnSon() {
        nomObservableDecore.EmetUnSon();
        notifierObservateurs();
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur o : observateurs) {
        o.reagit(this);}
    }

    @Override
    public void enregisterObservateur(Observateur o) {
    observateurs.add(o);  }

}
