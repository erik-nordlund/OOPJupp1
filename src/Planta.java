//superklass
public abstract class Planta {
    private String name;
    private double height;

    //konstruktor
    public Planta(String name, double height) {
        this.name = name;
        this.height = height;
    }

    //getter
    public String getName() {
        return name;
    }

    //getter
    public double getHeight() {
        return height;
    }


    // abstrakt metod som varje underklass måste implementera
    public abstract String getVattenBehov();
}
