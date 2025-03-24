/**
* 672115014, Nattikorn Sae-sue
*/
public class Pets {
    private String name;
    private int age;
    private String color;
    private boolean certificate;
    
    public Pets() {
        this.name = null;
        this.age = 0;
        this.color = "white";
        this.certificate = false;
    }
    public Pets(String name, int age, String color, boolean certificate) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.certificate = certificate;
    }
    
    public void displayInformation() {
        System.out.println("Pet name: " + getName() + ", " + getAge() + " years old." + "\nColor: " + getColor() + ", Certificate: " + getCertificate());
        System.out.println();
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getColor() {
        return this.color;
    }
    public boolean getCertificate() {
        return this.certificate;
    }
}
    