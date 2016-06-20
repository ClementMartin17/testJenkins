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
public class Ornithologue {
sdfsdf
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabriqueAbstraiteCanard fac = new FabriqueCanardCompte();
        EmissionSonore colvert = new Colvert();
        EmissionSonore appeau = new Appeau();
        EmissionSonore morillon = new Morillon();
        EmissionSonore cec = new CanardEnCaoutchouc();
        EmissionSonore oie = new AdapteurOie(new Oie());
        EmissionSonore dc = fac.creerColvert();
        EmissionSonore dc1 = fac.creerMorillon();
        EmissionSonore dc2 = fac.creerColvert();
        CanardObservable co = new CanardObservable(dc);
        CanardObservable co1 = new CanardObservable(dc1);
        CanardObservable co2 = new CanardObservable(dc2);
        Observateur jorj = new Chasseur();
        List<EmissionSonore> liste = new ArrayList<EmissionSonore>();
        co.enregisterObservateur(jorj);
        co1.enregisterObservateur(jorj);
        co2.enregisterObservateur(jorj);
        liste.add(co);
        liste.add(appeau);
        liste.add(co1);
        liste.add(co2);
        liste.add(cec);
        liste.add(oie);

        for (EmissionSonore e : liste) {
            e.EmetUnSon();
        }
        System.out.println(CompteurCoinCoin.compteur);

    }

}
