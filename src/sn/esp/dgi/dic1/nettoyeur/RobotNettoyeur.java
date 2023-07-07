package sn.esp.dgi.dic1.nettoyeur;

import sn.esp.dgi.dic1.monde.Monde;
import sn.esp.dgi.dic1.robot.Robot;

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
            if (i % 2 == 0) {
                while (j < m.getNbC()) {
                    if (m.estSale(i, j)) {
                        posx = i;
                        posy = j;
                        nettoyer();
                    }
                    j++;
                }
            } else {
                while (j >= 0) {
                    if (m.estSale(i, j)) {
                        posx = i;
                        posy = j;
                        nettoyer();
                    }
                    j--;
                }
            }
        }
        posx++;
    }
    
}
