public class Palm extends Planta implements Vatten {

    // konstruktor
    public Palm(String name, double height) {
        super(name, (int) height);
    }

    // implementering av vattenbehovet för palmer
    @Override
    public String getVattenBehov() {
        double waterAmount = 0.5 * getHeight(); // 0.5 liter kranvatten per meter
        return "Palmen " + getName() + " behöver " + waterAmount + " liter av kranvatten varje dag.";
    }
}