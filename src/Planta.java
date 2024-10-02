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

    //definierar en metod som alla klasser som implementerar detta interface måste ha
    public interface Vatten {
        String getVattenBehov();
    }


    // abstrakt metod som varje underklass måste implementera
    public abstract String getVattenBehov();
}
