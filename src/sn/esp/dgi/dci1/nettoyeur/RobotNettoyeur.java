package sn.esp.dgi.dci1.nettoyeur;

import sn.esp.dgi.dci1.monde.Monde;
import sn.esp.dgi.dci1.robot.Robot;

public class RobotNettoyeur extends Robot {

    public RobotNettoyeur(Monde m) {
        super(0, 0, m);
    }

    public void nettoyer() {
        m.prendPapierGras(posx, posy);
    }
    public void parcourir() {
        int j = 0;
        for (int i = 0; i < m.getNbL(); i++) {
            if (j == 0) {
                while (j < m.getNbC()) {
                    posy = j;
                    if (m.estSale(posx, posy)) {
                        nettoyer();
                    }
                    j++;
                }
            } else {
                while (j > 0) {
                    posy = j;
                    if (m.estSale(posx, posy)) {
                        nettoyer();
                    }
                    j--;
                }
            }
        }
        posx++;
    }
    
}
