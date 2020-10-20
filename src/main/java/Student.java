import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;
    public Student(long id, String name){
        this.id = id;
        this.name= name;
        this.grades = new ArrayList<>();
    }
    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double output = 0;
        for(int grade: this.grades){
            output += grade;
        }
        return output/ this.grades.size();
    }
    public ArrayList<Integer> updateGrade(int oldNum, int newNum) {
        for (int grade : this.grades) {
            if (grade == oldNum) {
                this.grades.set(this.grades.indexOf(grade), newNum);
                break;
            }
        }
            return this.grades;
    }
    public ArrayList<Integer> deleteGrade(int oldNum) {
        for (int grade : this.grades) {
            if (grade == oldNum) {
                this.grades.remove(this.grades.indexOf(grade));
                break;
            }
        }
        return this.grades;
    }


    public static void main(String[] args) {
        Student bob = new Student (23234, "Bob");
        bob.addGrade(100);
        bob.addGrade(77);
        bob.addGrade(100);
        System.out.println(bob.updateGrade(100, 55));
    }
}
