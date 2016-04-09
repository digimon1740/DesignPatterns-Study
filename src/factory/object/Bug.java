package factory.object;

public abstract class Bug {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void arrive() {
        System.out.print(getName());
        System.out.print(" 이(가) 태어났습니다. 종류는 ");
        System.out.println(this.getClass().getSimpleName());
        System.out.print(puberty());
        System.out.println();
    }

    public abstract String puberty();
}
