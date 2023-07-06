package sn.esp.dgi.dic1.toutDroit;

import sn.esp.dgi.dic1.monde.Monde;
import sn.esp.dgi.dic1.pollueur.RobotPollueur;

public class PollueurToutDroit extends RobotPollueur{
    private int colDepart;
    
    public PollueurToutDroit(int colDepart, Monde m) {
        super(0, colDepart, m);
        this.colDepart = colDepart;
    }

    public void parcourir() {
        for (int i = 0; i < m.getNbL(); i++) {
            m.metPapierGras(i, colDepart);
        }   
    }
    
}
