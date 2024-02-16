package enna.dev;

public class RussianDoll extends Doll{
    // fields
    private String name;
    private String color;
    private Doll doll;

    // constructor parameter
    public RussianDoll(String name, String color, int size) {
        super(size);
        this.name = name;
        this.color = color;
        this.doll = null;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Doll getDoll() {
        return doll;
    }

    public void setDoll(Doll doll) {
        this.doll = doll;
    }

    // Override Methode
    // methode open the doll
    @Override
    public void open() {
        if (isOpened()) {
            System.out.println("La poupée est déjà ouverte.");
        } else {
            System.out.println("Ouverture de la poupée russe de nom " + getName() + " de taille " + getSize());
            setOpened(true);
        }
    }

    // methode close the doll
    @Override
    public void close() {
        if (!isOpened()) {
            System.out.println("La poupée est déjà fermée.");
        } else if (doll != null) {
            System.out.println("Veuillez d'abord sortir la poupée contenue avant de fermer.");
        } else {
            System.out.println("Fermeture de la poupée russe dde nom " + getName() + " de taille " + getSize());
            setOpened(false);
        }
    }

    // methode place the current doll in the p doll.
    @Override
    public void placeIn(Doll p) {
        if (p.getSize() <= getSize()) {
            System.out.println("La poupée ne peut pas être placée dans une poupée de taille inférieure ou égale.");
        } else if (!p.isOpened()) {
            System.out.println("Veuillez d'abord ouvrir la poupée de destination.");
        } else {
            System.out.println("Placement de la poupée russe de taille " + getSize()+ " dans une poupée de taille " + p.getSize());
            setDoll(p);
        }
    }

    // methode takes out the current doll from the p doll
    @Override
    public void outIn(Doll p) {
        if (p != getDoll()) {
            System.out.println("La poupée n'est pas contenue dans cette poupée.");
        }
        else if(!isOpened()) {
            System.out.println("La poupée est ferme");
        }
        else {
            System.out.println("Sortie de la poupée russe de taille " + getSize() + " de la poupée de taille " + p.getSize());
            setDoll(null);
        }
    }
}
