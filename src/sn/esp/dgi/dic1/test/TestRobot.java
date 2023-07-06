package sn.esp.dgi.dic1.test;

import java.util.Scanner;

import sn.esp.dgi.dic1.monde.Monde;

public class TestRobot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("*******Bienvenue dans le monde des Rebots*******\n\n");
        System.out.println("Créer un monde pour commencer :");
        System.out.println("   1-Créer un monde par default (10x10)");
        System.out.println("   2-Créer un monde personnalisé");

        int choix = in.nextInt();

        if(choix == 1) {
            Monde defaultMonde = new Monde();

            System.out.println("Monde (10x10) crée !");
            System.out.println("Voici l'etat du monde actuel :");
            System.out.println(defaultMonde.toString());
            System.out.println("Monde (10x10) crée !");
            System.out.println("Monde (10x10) crée !");

        } else if(choix == 2) {
            System.out.println("Entrer le nombre de ligne :");
            int nbl = in.nextInt();
            System.out.println("Entrer le nombre de colonne :");
            int nbc = in.nextInt();

            Monde monde = new Monde(nbl, nbc);
        } else {
            System.out.println("Choix indisponible");
        }
    }
}
