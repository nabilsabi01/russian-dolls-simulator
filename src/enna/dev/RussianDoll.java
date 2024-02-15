package enna.dev;

public class RussianDoll extends Doll{
    // fields
    private Doll contained;

    // constructor parameter
    public RussianDoll(int size) {
        super(size);
        contained = null;
    }

    // getter and setter
    public Doll getContained() {
        return contained;
    }

    public void setContained(Doll contained) {
        this.contained = contained;
    }

    // Override Methode
    // methode open the doll
    @Override
    public void open() {
        if (!isOpened()){
            this.setOpened(true);
        }
    }

    // methode close the doll
    @Override
    public void close() {
        if (isOpened()){
            this.setOpened(false);
        }
    }

    // methode place the current doll in the p doll.
    @Override
    public void placeIn(Doll p) {
        if (p.isOpened() && p.getSize() > this.getSize()){
            this.contained = p;
            p.close();
        }else {
            System.out.println("Impossible de placer la poupée dans " + p);
        }
    }

    // methode takes out the current doll from the p doll
    @Override
    public void outIn(Doll p) {
        if (p.equals(this.contained)){
            this.contained = null;
            p.open();
        }else {
            System.out.println("La poupée n'est pas contenue dans " + p);
        }
    }
}
