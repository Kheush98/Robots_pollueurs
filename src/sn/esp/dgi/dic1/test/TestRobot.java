package sn.esp.dgi.dic1.test;

import java.util.Scanner;

import sn.esp.dgi.dic1.distrait.NettoyeurDistrait;
import sn.esp.dgi.dic1.monde.Monde;
import sn.esp.dgi.dic1.nettoyeur.RobotNettoyeur;
import sn.esp.dgi.dic1.sauteur.PollueurSauteur;
import sn.esp.dgi.dic1.toutDroit.PollueurToutDroit;

public class TestRobot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n\n*******Bienvenue dans le monde des Rebots*******\n");
        System.out.println("Créer un monde pour commencer :");
        System.out.println("   1-Créer un monde par default (10x10)");
        System.out.println("   2-Créer un monde personnalisé");

        int choix = in.nextInt();
        String choix1;

        if(choix == 1) {
            Monde defaultMonde = new Monde();
            System.out.println("Monde (10x10) crée !");
            System.out.println("Voici l'etat du monde actuel :");
            System.out.println(defaultMonde.toString());

            do {
                polluerMonde(defaultMonde, in);
                System.out.println("Veux tu polluer encore ?(Y/N):");
                choix1 = in.next();
            } while (!choix1.equals("N")  &&  !choix1.equals("n"));

            do {
                nettoyerMonde(defaultMonde, in);             
                System.out.println("Veux tu nettoyer encore ?(Y/N):");
                choix1 = in.next();
            } while (!choix1.equals("N")  &&  !choix1.equals("n"));
        
        } else if(choix == 2) {
            System.out.println("Entrer le nombre de ligne :");
            int nbl = in.nextInt();
            System.out.println("Entrer le nombre de colonne :");
            int nbc = in.nextInt();

            Monde monde = new Monde(nbl, nbc);
            System.out.println("Monde crée !\n");
            System.out.println("Voici l'etat du monde actuel :");
            System.out.println(monde.toString());

            do {
                polluerMonde(monde, in);
                System.out.println("Veux tu polluer encore ?(Y/N):");
                choix1 = in.next();
            } while (!choix1.equals("N") && !choix1.equals("n"));

            do {
                nettoyerMonde(monde, in);
                System.out.println("Veux tu polluer encore ?(Y/N):");
                choix1 = in.next();
            } while (!choix1.equals("N") && !choix1.equals("n"));

        } else {
            System.out.println("Choix indisponible");
        }
    }

    public static void polluerMonde(Monde monde, Scanner in) {

            System.out.println("Tester les Robots pollueurs :");
            System.out.println("   1-Pollueur tout droit");
            System.out.println("   2-Pollueurs sauteur");

            int choix1 = in.nextInt();

            if (choix1 == 1) {

                System.out.println("Entrer la colonne de depart");
                int colDepart = in.nextInt();

                PollueurToutDroit robot = new PollueurToutDroit(colDepart, monde);
                robot.parcourir();

                System.out.println("Monde pollué !!");
                System.out.println(monde.toString());

            } else if (choix1 == 2) {

                System.out.println("Entrer la colonne de depart:");
                int colDepart = in.nextInt();
                System.out.println("Entrer la taille du saut:");
                int deltax = in.nextInt();

                PollueurSauteur robot = new PollueurSauteur(colDepart, deltax, monde);
                robot.parcourir();

                System.out.println("Monde pollué !!");
                System.out.println(monde.toString());

            } else {

                System.out.println("Choix indisponible");
                System.exit(0);
            }
    }

    public static void nettoyerMonde(Monde monde, Scanner in) {
        System.out.println("Tester les Robots nettoyeurs :");
        System.out.println("   1-Nettoyeur normal");
        System.out.println("   2-Nettoyeur distrait");

        int choix2 = in.nextInt();

        if (choix2 == 1) {
            RobotNettoyeur robotNettoyeur = new RobotNettoyeur(monde);
            robotNettoyeur.parcourir();
            System.out.println("Monde nettoyé !!");
            System.out.println(monde.toString());

        } else if (choix2 == 2) {
            NettoyeurDistrait robotNettoyeur = new NettoyeurDistrait(monde);
            robotNettoyeur.parcourir();
            System.out.println("Monde en partie nettoyé !!");
            System.out.println(monde.toString());

        } else {
            System.out.println("Choix indisponible");
            System.exit(0);
        }
    }
}
