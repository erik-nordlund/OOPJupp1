import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        //skapa växtobjekt
        Planta igge = new Kaktus("Igge", 0.2); // 20 cm hög
        Planta laura = new Palm("Laura", 5);   // 5 meter hög
        Planta meatloaf = new Köttätande("Meatloaf", 0.7); // 0,7 meter hög
        Planta olof = new Palm("Olof", 1);     // 1 meter hög

        //lägger till växterna i en array
        Planta[] plants = {igge, laura, meatloaf, olof};

        // Variabel för att hålla reda på om vi har hittat en växt
        boolean found = false;

        //skriver rätt eller trycker på "Cancel"
        while (!found) {
            String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            //cancel
            if (plantName == null || plantName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas.");
                break;  // Avsluta loopen och programmet
            }

            // Loopa igenom växterna och kolla om det finns en match
            for (Planta plant : plants) {
                //här används polymorfism genom att anropa getVattenBehov() på en referens av typen Planta
                //det kommer att kalla den specifika implementationen beroende på objektets verkliga typ
                if (plant.getName().equalsIgnoreCase(plantName.trim())) {
                    // Visa växtens vattenbehov
                    JOptionPane.showMessageDialog(null, plant.getVattenBehov());
                    found = true;  // Avsluta loopen
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(null, "Växten " + plantName + " finns inte på hotellet. Försök igen.");
            }
        }
    }
}