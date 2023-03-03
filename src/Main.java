public class Main {
    public static void main(String[] args){
        Student std1 = new Student("Shakir","shamsi","1");
        Student std2 = new Student("Aziz","habibi","13");
        std1.setGrade(20);
        std2.setGrade(12.25);
        std1.printstudeninfo();
        std2.printstudeninfo();
    }
}