import enna.dev.Doll;
import enna.dev.RussianDoll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // insert the size the doll
        RussianDoll p1 = new RussianDoll("Poupe 1", "white", 70);
        RussianDoll p2 = new RussianDoll("Poupe 2", "black", 30);
        RussianDoll p3 = new RussianDoll("Poupe 3", "blue", 20);

        int choice, numDoll;
        do {
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||------------|              Gestion Poupée Russe           |-----------||");
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||------------|   1: Ouvre la poupée                        |-----------||");
            System.out.println("\t\t\t||------------|   2: Ferme la poupée                        |-----------||");
            System.out.println("\t\t\t||------------|   3: Place la poupée dans une autre poupée  |-----------||");
            System.out.println("\t\t\t||------------|   4: Sort la poupée d'une autre poupée      |-----------||");
            System.out.println("\t\t\t||------------|   5: Quitter application                    |-----------||");
            System.out.println("\t\t\t||======================================================================||");
            System.out.println("\t\t\t||\t\tName : " + p1.getName() + "\t\tColor : " + p1.getColor() + "\t\tSize : " + p1.getSize() + "\t\t\t\t||");
            System.out.println("\t\t\t||----------------------------------------------------------------------||");
            System.out.println("\t\t\t||\t\tName : " + p2.getName() + "\t\tColor : " + p2.getColor() + "\t\tSize : " + p2.getSize() + "\t\t\t\t||");
            System.out.println("\t\t\t||----------------------------------------------------------------------||");
            System.out.println("\t\t\t||\t\tName : " + p3.getName() + "\t\tColor : " + p3.getColor() + "\t\tSize : " + p3.getSize() + "\t\t\t\t||");
            System.out.println("\t\t\t||======================================================================||");

            System.out.println("Enter votre choix: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Numéro de la poupée à ouvrir (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    numDoll = sc.nextInt();
                    dollToOpen(numDoll, p1, p2, p3);
                    break;
                case 2:
                    System.out.print("Numéro de la poupée à ferme (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    numDoll = sc.nextInt();
                    dollToClose(numDoll, p1, p2, p3);
                    break;
                case 3:
                    System.out.print("Numéro de la poupée à placer (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    int numDollPlace = sc.nextInt();
                    System.out.print("Numéro de la poupée dans laquelle vous voulez placer (1 : Poupe 1, 2 : Poupe 2, 3: Poupe 3) : ");
                    int numDollDestination = sc.nextInt();
                    placeInDoll(numDollPlace, numDollDestination, p1, p2, p3);
                    break;
            }
        }while (choice != 4);
    }

    private static void placeInDoll(int numDoll, int sizeDestination, RussianDoll p1, RussianDoll p2, RussianDoll p3) {
        if (numDoll == 1 && sizeDestination == 2){
            p1.placeIn(p2);
        }
        else if (numDoll == 1 && sizeDestination == 3){
            p1.placeIn(p3);
        }
        else if (numDoll == 2 && sizeDestination == 1){
            p2.placeIn(p1);
        }
        else if (numDoll == 2 && sizeDestination == 3){
            p2.placeIn(p3);
        }
        else if (numDoll == 3 && sizeDestination == 1){
            p3.placeIn(p1);
        }
        else if (numDoll == 3 && sizeDestination == 2){
            p3.placeIn(p2);
        }
        else {
            System.out.println("impossible");
        }
    }

    public static void dollToOpen(int numDoll, RussianDoll p1, RussianDoll p2, RussianDoll p3){
        if (numDoll == 1){
            p1.open();
        }
        else if (numDoll == 2){
            p2.open();
        }
        else {
            p3.open();
        }
    }

    public static void dollToClose(int numDoll, RussianDoll p1, RussianDoll p2, RussianDoll p3){
        if (numDoll == 1){
            p1.close();
        }
        else if (numDoll == 2){
            p2.close();
        }
        else {
            p3.close();
        }
    }
}