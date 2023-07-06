package sn.esp.dgi.dic1.distrait;

import sn.esp.dgi.dic1.monde.Monde;
import sn.esp.dgi.dic1.nettoyeur.RobotNettoyeur;

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
                    if (m.estSale(i, j)) {
                        if (compteur % 2 == 0) {
                            posx = i;
                            posy = j;
                            nettoyer();
                        }
                        compteur++;
                    }
                    j++;
                }
            } else {
                while (j > 0) {
                    posy = j;
                    if (m.estSale(i, j)) {
                        if (compteur % 2 == 0) {
                            posx = i;
                            posy = j;
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
