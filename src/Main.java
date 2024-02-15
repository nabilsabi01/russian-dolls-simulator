import enna.dev.RussianDoll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // insert the size of doll
        RussianDoll p1 = new RussianDoll(70);
        RussianDoll p2 = new RussianDoll(30);

        int choice;
        do {
            System.out.println("taille de Poupée 1 est " + p1.getSize());
            System.out.println("taille de Poupée 2 est " + p2.getSize());

            System.out.println("|===========================================================================|");
            System.out.println("|=============              Gestion Poupée Russe              ==============|");
            System.out.println("|===========================================================================|");
            System.out.println("|-------------  1: Placement une poupée dans une autre poupée   ------------|");
            System.out.println("|-------------  2: Sort une poupée dans une autre poupée        ------------|");
            System.out.println("|-------------  3: Quitter application                          ------------|");
            System.out.println("|===========================================================================|");
            System.out.println("Enter votre choix: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Entrer le numero de première poupée : ");
                    int pr1 = sc.nextInt();
                    break;
            }
        }while (choice != 3);
//        System.out.println("Enter la taille de poupée russe : ");
//        int sd1 = sc.nextInt();
//        System.out.println("Enter la taille de poupée russe : ");
//        int sd2 = sc.nextInt();
//        System.out.println("Enter la taille de poupée russe : ");
//        int sd3 = sc.nextInt();


    }
}