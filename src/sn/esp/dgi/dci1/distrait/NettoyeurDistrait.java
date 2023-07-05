package sn.esp.dgi.dci1.distrait;

import sn.esp.dgi.dci1.monde.Monde;
import sn.esp.dgi.dci1.nettoyeur.RobotNettoyeur;

public class NettoyeurDistrait extends RobotNettoyeur{

    public NettoyeurDistrait(Monde m) {
        super(m);
    }
    
    public void parcourir() {
        int compteur = 0;
        int j = 0;
        for (int i = 0; i < m.getNbL(); i++) {
            if (j == 0) {
                while (j < m.getNbC()) {
                    posy = j;
                    if (m.estSale(posx, posy)) {
                        if (compteur % 2 == 0) {
                            nettoyer();
                        }
                        compteur++;
                    }
                    j++;
                }
            } else {
                while (j > 0) {
                    posy = j;
                    if (m.estSale(posx, posy)) {
                        if (compteur % 2 == 0) {
                            nettoyer();
                        }
                        compteur++;
                    }
                    j--;
                }
            }
        }
        posx++;
    }

}
