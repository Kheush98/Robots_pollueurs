package sn.esp.dgi.dic1.pollueur;

import sn.esp.dgi.dic1.monde.Monde;
import sn.esp.dgi.dic1.robot.Robot;

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
