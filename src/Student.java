public class Student {
    private String firstname;
    private String Lastname;
    //student Id Must have less then 7 digit;
    private String ID;
    private double grade;

    public Student(String firstname, String lastname, String ID) {
        this.firstname = firstname;
        if(checkId(ID)){
            this.ID = ID;
        }
        else{
            System.err.println("The Id is wrong");
        }
        this.Lastname = lastname;

        grade = 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printstudeninfo(){
        System.out.println(firstname + " "  +Lastname +" \nId: " + ID +"\nGrade: "+ grade);
    }

    public boolean checkId(String Id){
        if(Id.length() > 7){
            return false;
        }
        return  true;
    }

}
