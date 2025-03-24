/**
* 672115014, Nattikorn Sae-sue
*/
public class Testing {
    public static void main(String[] args) {
        Pets myPet = new Pets("MisterPet", 2, "blue", true);
        Dog myDog = new Dog("MisterDog", 6, "black", false, "sporting group");
        Dog myDog1 = new Dog("MissyDog", 9, "white", true, "working group");
        Cat myCat = new Cat("MisterCat", 4, "orange", false, "Persian");
        Cat myCat1 = new Cat("MissyCat", 3, "gray", true, "Scottish");
        Exotic myExotic = new Exotic("MisterExotic", 2, "green", true, "Africa");
        Exotic myExotic1 = new Exotic("MissyExotic", 3, "blue", true, "America");
        myPet.displayInformation();
        myDog.displayInformation();
        myDog1.displayInformation();
        myCat.displayInformation();
        myCat1.displayInformation();
        myExotic.displayInformation();
        myExotic1.displayInformation();
    }
}
    