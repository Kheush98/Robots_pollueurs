package sn.esp.dgi.dic1.robot;

import java.lang.Math;
import sn.esp.dgi.dic1.monde.Monde;

public abstract class Robot {
    protected int posx;
    protected int posy;
    protected Monde m;

    protected Robot(int x, int y, Monde m) {
        this.posx = x;
        this.posy = y;
        this.m = m;    
    }

    public int getPosX() {
        return posx;
    }
    public int getPosY() {
        return posy;
    }
    public Monde getM() {
        return m;
    }

    public void setPosX(int x) {
        this.posx = x;
    }
    public void setPosY(int y) {
        this.posy = y;
    }

    protected Robot(Monde m){
        this((int) (Math.random() * m.getNbL()), (int) (Math.random() * m.getNbC()), m);
    }

    public void vaEn(int i, int j) {
        if (m.estSale(i, j)){
            m.prendPapierGras(i, j);
        }
        posx = i;
        posy = j;
    }

    public abstract void parcourir();
}