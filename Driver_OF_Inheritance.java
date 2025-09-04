package LAB_12;

import Bank.Account;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Person{
    String name;
    int YearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        YearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                '}';
    }
}

class Student extends Person{
    int studentID;
    int enrolledSemester;

    public Student(String name, int yearOfBirth, int studentID, int enrolledSemester) {
        super(name, yearOfBirth);
        this.studentID = studentID;
        this.enrolledSemester = enrolledSemester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", enrolledSemester=" + enrolledSemester +
                ", name='" + name + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                '}'+"\n";
    }

    public void Display(){
        System.out.println(toString());
    }
}
abstract class Employee extends Person{
    int employeeID;
    int joiningYear;
    String jobTitle;

    public Employee(String name, int yearOfBirth, int employeeID, int joiningYear, String jobTitle) {
        super(name, yearOfBirth);
        this.employeeID = employeeID;
        this.joiningYear = joiningYear;
        this.jobTitle = jobTitle;
    }

    abstract public float CalcPay();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", joiningYear=" + joiningYear +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                '}';
    }


}




class Administration extends Employee{
    public Administration(String name, int yearOfBirth, int employeeID, int joiningYear, String jobTitle) {
        super(name, yearOfBirth, employeeID, joiningYear, jobTitle);
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    @Override
    public String toString() {
        return "Administration{" +
                "employeeID=" + employeeID +
                ", joiningYear=" + joiningYear +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                '}';
    }

    @Override
    public float CalcPay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current year to find the admin person sallary:");
        int CurrentYear =input.nextInt();
        float paymentOFAdmin = ((CurrentYear-this.joiningYear)*5000);
        return paymentOFAdmin;
    }
}

class Faculty extends Employee{
    List<String> List_of_CourseID = new ArrayList<String>();

    public Faculty(String name, int yearOfBirth, int employeeID, int joiningYear, String jobTitle) {
        super(name, yearOfBirth, employeeID, joiningYear, jobTitle);
    }

    public void setCourseList(List<String> course){
        List_of_CourseID=course;
    }

    public List<String> getCourseList(){
        return List_of_CourseID;
    }

    @Override
    public float CalcPay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current year to find the salary of faculty member :");
        int CurrentYear =input.nextInt();
        float paymentOFfaculty = ((CurrentYear-this.joiningYear)*4000);
        return paymentOFfaculty;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "List_of_CourseID=" + List_of_CourseID +
                ", employeeID=" + employeeID +
                ", joiningYear=" + joiningYear +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                '}';
    }
}








public class Driver_OF_Inheritance {
    public static void main(String[] args) {


        Student junaid =new Student("Junaid",2003,1234,3);
        Student anwaar =(new Student("Anwaar",2002,1235,3));
        Student ab =(new Student("Abraham",2003,1236,3));
        Administration admin = new Administration("Faslullah",1990,9543,2000,"clark");
        Faculty af =(new Faculty("Afeef Sir",1980,9765,2012,"Assis.Prof."));
        Faculty hi =(new Faculty("Hina Ma'am",1981,9766,2010,"prof."));


        List<Person> List_of_Person = new ArrayList<Person>();
        Collections.addAll(List_of_Person,junaid,anwaar,ab,admin,af,hi);
        for(Person person_details: List_of_Person){
            System.out.println(person_details);
            System.out.println(" ");
        }

        junaid.Display();
        anwaar.Display();
        ab.Display();

        admin.setJobTitle("HOD");
        System.out.println(admin.getJobTitle());
        System.out.println("payment of "+admin.jobTitle +" " +admin.name+" :"+admin.CalcPay());

        List<String> subject_list_of_af = new ArrayList<String>();
        Collections.addAll(subject_list_of_af,"oop","CED","DLD","DM");
        System.out.println("payment of "+af.jobTitle +af.name+" :"+af.CalcPay());
        af.setCourseList(subject_list_of_af);
        System.out.println(af.name+"'s subject list is :"+af.getCourseList());

        List<String> subject_list_of_hi = new ArrayList<String>();
        Collections.addAll(subject_list_of_hi,"maths","geo","phy","chm");
        System.out.println("payment of "+hi.jobTitle +hi.name+" :"+hi.CalcPay());
        hi.setCourseList(subject_list_of_hi);
        System.out.println(hi.name+"'s subject list is :"+hi.getCourseList());
    }

}
