package factory.object;

public abstract class Human {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract String puberty();

    public void arrive() {
        System.out.print(this.name);
        System.out.print(" 이 태어났습니다. 성별은 ");
        System.out.print(this.getClass().getSimpleName());
        System.out.println();
        System.out.print(puberty());
        System.out.println();
    }

}
