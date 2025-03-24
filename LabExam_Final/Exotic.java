/**
* 672115014, Nattikorn Sae-sue
*/
public class Exotic extends Pets {
    private String continent; //Asia, Europe, America, and Africa.
    public Exotic(String name, int age, String color, boolean certificate, String continent) {
        super(name, age, color, certificate);
        this.continent = continent;
    }
    @Override
    public void displayInformation() {
        System.out.println("Exotic pet name: " + getName() + ", " + getAge() + " years old." + "\nColor: " + getColor() + ", Certificate: " + getCertificate() + "\nContinent of the pet: " + getContinent());
        System.out.println();
    }
    public String getContinent() {
        return this.continent;
    }
}