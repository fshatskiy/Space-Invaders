package Controlleur;
import java.util.Scanner;
import Modele.Grille;

public class Movement {

    private Scanner scanner;


    /*
    Déplacement du X vers la gauche crée dans la classe Grille
     */
    public void move() {

        scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "q":
                left();
                break;
        }
    }

/*
    On parcours la grille pour trouver le X initial
    Dès qu'il est repéré on le déplace vers la gauche en remplacant sa ancienne position par le Vide
 */
    public void left(){

        for(int i =0; i<10; i++){
            for(int j = 0; j<10; j++){
                if(Grille.getGrille()[i][j] == 1){
                    Grille.getGrille()[i][j] = 0;
                    int newPos = j-1;
                    Grille.getGrille()[i][newPos] =1 ;
                }

            }
        }
    }



}
