package Vue;
import Modele.*;
import Controlleur.*;
public class VueConsole {
/*
Affichage des 2 classes
 */
    public static void main(String[] args){
        Movement move = new Movement();
        Grille gri = new Grille();
        gri.initialise(gri.getGrille());
        gri.getGrille()[8][5] = 1;
        for(int i=0;i<10;i++) { //on bouge sans que le code ne s'arrête (sauf quand il arrive au bout)
        	move.move();
        	Grille.affiche(Grille.getGrille());
        }
    }
}
