public class Köttätande extends Planta implements Vatten {

    // konstruktor
    public Köttätande(String name, double height) {
        super(name, height);
    }

    // implementering av vattenbehovet för köttätande växter
    @Override
    public String getVattenBehov() {
        double waterAmount = 0.1 + (0.2 *getHeight());
        return "Köttätande växten " + getName() + " behöver " + waterAmount + " liter av proteindryck varje dag.";
    }
}
