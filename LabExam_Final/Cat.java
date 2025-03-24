/**
* 672115014, Nattikorn Sae-sue
*/
public class Cat extends Pets {
    private String species; // Persian, Scottish, and Siamese.
    public Cat(String name, int age, String color, boolean certificate, String species) {
        super(name, age, color, certificate);
        this.species = species;
    }
    @Override
    public void displayInformation() {
        System.out.println("Cat name: " + getName() + ", " + getAge() + " years old." + "\nColor: " + getColor() + ", Certificate: " + getCertificate() + "\nSpecies: " + getSpecies());
        System.out.println();
    }
    public String getSpecies() {
        return this.species;
    }
}
    