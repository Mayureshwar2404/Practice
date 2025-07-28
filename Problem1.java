package ExamCodes;
import java.util.*;
class Student {
    String name;
    int roll;
    int marks;

    Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + roll + ", Marks: " + marks;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student details:");

            System.out.print("Name:");
            String name = sc.nextLine();

            System.out.print("Roll Number:");
            int roll = sc.nextInt();

            System.out.print("Marks:");
            int marks = sc.nextInt();

            students.add(new Student(name, roll, marks));
        }

        students.sort((stud1, stud2) -> stud1.marks - stud2.marks);

        System.out.println("Students sorted by marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
