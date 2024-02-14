package enna.dev;

public abstract class Doll {
    // fields
    private int size;
    private boolean opened;

    // methode abstract
    public abstract void open();
    public abstract void close();
    public abstract void placeIn(Doll p);
    public abstract void outIn(Doll p);

    // constructor parameter
    public Doll(int size){
        this.size = size;
        this.opened = false;
    }

    // getter and setter
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }
}
