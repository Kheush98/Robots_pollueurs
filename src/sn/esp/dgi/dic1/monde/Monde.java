package sn.esp.dgi.dic1.monde;

public class Monde {
    private int nbL; 
    private int nbC; 
    private boolean[][] matrice;  

   
    public Monde() {
        this(10, 10);  
    }
 
    public Monde(int nbL, int nbC) {
        this.nbL = nbL;
        this.nbC = nbC;
        this.matrice = new boolean[nbL][nbC];  // Initialise la matrice avec des valeurs par défaut (false)
    }

    
    public String toString() {
        String result = "";
        for (int i = 0; i < nbL; i++) {
            for (int j = 0; j < nbC; j++) {
                if (matrice[i][j]) {
                    result += "o";
                } else {
                    result += ".";
                }
            }
            result += "\n";
        }
        return result;
   }

    public void setNbC(int nbC) {this.nbC = nbC;}
    public void setNbL(int nbL) {this.nbL = nbL;}

    public int getNbC() {return this.nbC;}
    public int getNbL() {return this.nbL;}

    public void metPapierGras(int i, int j) {
        if (validerIndices(i, j)) {
            matrice[i][j] = true;
        } else {
            System.out.println("Valeur(s) choisie(s) incorrecte(s)");
        }
    }

    public void prendPapierGras(int i, int j) {
        if (validerIndices(i, j)) {
            matrice[i][j] = false;
        } else {
            System.out.println("Valeur(s) choisie(s) incorrecte(s)");
        }
    }

    public boolean estSale(int i, int j) {
        if (validerIndices(i, j)) {
            return matrice[i][j];
        }
        return false;
    }

    public int nbPapiersGras() {
        int count = 0;
        for (int i = 0; i < nbL; i++) {
            for (int j = 0; j < nbC; j++) {
                if (matrice[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean validerIndices(int i, int j) {
        return i >= 0 && i < nbL && j >= 0 && j < nbC;
    }
}
