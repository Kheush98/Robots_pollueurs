package sn.esp.dgi.dci1.sauteur;

import sn.esp.dgi.dci1.monde.Monde;
import sn.esp.dgi.dci1.robot.Robot;

public class PollueurSauteur extends Robot{

    private int deltax;
    private int colDepart;
    public PollueurSauteur(int colDepart, int deltax, Monde m) {
        super(0, colDepart, m);
        this.deltax = deltax;
        this.colDepart = colDepart;
    }

    public void parcourir() {
        for (int i = 0; i < m.getNbL(); i++) {
            m.metPapierGras(i, colDepart);
            colDepart += deltax;
            if (colDepart >= m.getNbC()) {
                colDepart %= m.getNbC();
            }
        } 
    }
    
}
