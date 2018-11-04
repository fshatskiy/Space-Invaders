package Modele;
public class Grille {

    private static int [][] grille = new int[10][10];

    private static int VIDE = 0;



    public static void initialise(int [][] grille){
        for(int i=0; i<grille.length; i++){
            for(int j=0; j<grille[i].length; j++){
                grille[i][j] = VIDE;
            }
        }
    }

    public static void affiche(int [][] grille) {
        System.out.println();

        for (int[] ligne : grille) {
            System.out.print("|");
            for (int cellule : ligne) {
                if (cellule == VIDE) {
                    System.out.print(' ');
                }
                else {
                    System.out.print('x');
                }

                System.out.print("|");
            }
            System.out.println();
        }
    }

    public static int[][] getGrille() {
        return grille;
    }

    public static void setGrille(int[][] grille) {
        Grille.grille = grille;
    }
}
