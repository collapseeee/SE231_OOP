public class Student {
    //Attributes:
    private String firstName;
    private String lastName;
    private String email;
    private String stdNo; //8 digits
    private double score;
    //Constructor:
    public Student(){
    }
    public Student(String fName, String lName, String email, String SID, double
    score) {
    this.firstName = fName;
    this.lastName = lName;
    this.stdNo = SID;
    this.score = score;
    }
    //Methods:
    // - getter:
    public String getFirstName() {return this.firstName; }
    public String getLastName() {return this.lastName; }
    public String getEmail() { return this.email; }
    public String getSID() { return this.stdNo; }
    public double getScore() { return this.score; }
    // - setter:
    public void setFirstName(String fName) { this.firstName = fName; }
    public void setLastName(String lName) { this.lastName = lName; }
    public void setEmail(String email) { this.email = email;}
    public void setID(String SID) { this.stdNo = SID; }
    public void setScore(double score) { this.score = score; }
    // - toString:
    @Override
    public String toString() {
    return("First name: " + this.firstName + " Last name: " + this.lastName + 
    "Email: " + this.email + " ID: " + this.stdNo + " score: " + this.score + "\n" +
    grade());
    }
    // - score evaluation:
    public String grade() {
    if (this.score>=50) {
    return "You passed.";
    } else {
    return "You failed.";
    }
    }

}
