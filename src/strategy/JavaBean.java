package strategy;

public class JavaBean {

    private String str;

    public void setStr (String str) {
        if (str == null || str.length() == 0) {
            this.str = "";
        }
        this.str = str;
    }

    public String getStr() {
        return this.str;
    }
}
