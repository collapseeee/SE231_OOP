/**
* 672115014, Nattikorn Sae-sue
*/
public class Dog extends Pets {
    private String group; // Contains Toy group, Sporting group, and Working group.
    public Dog(String name, int age, String color, boolean certificate, String group) {
        super(name, age, color, certificate);
        this.group = group;
    }
    @Override
    public void displayInformation() {
        System.out.println("Dog name: " + getName() + ", " + getAge() + " years old." + "\nColor: " + getColor() + ", Certificate: " + getCertificate() + "\nGroup of Dog: " + getGroup());
        System.out.println();
    }
    public String getGroup() {
        return this.group;
    }
}