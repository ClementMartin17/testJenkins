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
public class FabriqueCanardCompte implements FabriqueAbstraiteCanard{

    @Override
    public EmissionSonore creerColvert() {
       return new CompteurCoinCoin(new Colvert());}

    @Override
    public EmissionSonore creerMorillon() {
     return new CompteurCoinCoin(new Morillon()); }
    
}
