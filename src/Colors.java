package WypozyczalniaRowerow;

public enum Colors {

    RED("Red",500),
    BLUE("Blue",250),
    GREEN("Green",100);


    private int value;
    private String name;

    Colors(String name,int value) {
        this.name=name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
