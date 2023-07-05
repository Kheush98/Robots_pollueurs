package sn.esp.dgi.dci1.pollueur;

import  sn.esp.dgi.dci1.robot.Robot;
import sn.esp.dgi.dci1.monde.Monde;

public abstract class RobotPollueur extends Robot{
    protected RobotPollueur(int x, int y, Monde m) {
        super(x, y, m);
    }

    public static void polluer(Robot robot) {
        int positionX = robot.getPosX();
        int positionY = robot.getPosY();
        Monde monde = robot.getM();

        monde.metPapierGras(positionX, positionY);
    }
}
