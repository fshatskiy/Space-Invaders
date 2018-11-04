import java.util.*;
import java.lang.*;
import java.io.*;
public class JeuTest{

   public static int [][] grille = new int[10][10];

    Scanner scanner;


    public static int VIDE = 0;
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

   /*public void move(){
        Thread moveConsole = new Thread();
                public void run(){
                    while(true){
                        scanner = new Scanner(System.in);
                        switch(scanner.nextLine()){
                            case 'd' : right();break;
                            case 'q' : left();break;
                        }
                    }
       }

       moveConsole.start();
    }*/

   public void move() {

       scanner = new Scanner(System.in);
       switch (scanner.nextLine()) {
           case "d":
               right();
               break;
       }
   }


    public void right(){

        for(int i =0; i<10; i++){
            for(int j = 0; j<10; j++){
                if(grille[i][j] == 1){
                    grille[i][j] = 0;
                    int newPos = j-1;
                    grille[i][newPos] = 1;
                }

            }
        }
    }


    public static void main(String[] args ){

        JeuTest test = new JeuTest();

        test.initialise(grille);
        grille[9][4] = 1;
        test.move();
        test.right();
        test.affiche(grille);













    }
}
