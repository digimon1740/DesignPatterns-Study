package observer;

public class Paginator {
    private int listSize = 0;

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    public int getListSize () {
        return this.listSize;
    }

    public Paginator() {
        this.listSize = 20;
    }

    public static void main(String[] args) {
        new Paginator();
    }
}
