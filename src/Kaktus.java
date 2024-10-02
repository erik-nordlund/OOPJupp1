public class Kaktus extends Planta implements Vatten {

    // konstruktor
    public Kaktus(String name, double height) {
        super(name, (int) height);
    }

    // implementering av vattenbehovet för kaktusar
    @Override
    public String getVattenBehov() {
        return "Kaktus " + getName() + " behöver 2 cl av mineralvatten varje dag.";
    }
}