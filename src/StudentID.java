import java.util.Scanner;
public class StudentID {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("---Student ID---");
        System.out.print("Enter your first name: ");
        String name = s.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = s.nextLine();
        System.out.print("Enter your grade level: ");
        int grade = s.nextInt();
        System.out.print("Enter your id: ");
        long id = s.nextLong();

        System.out.println("");
        System.out.println("The text for your student ID is: ");
        System.out.println(StudentID.studentID(name, lastName,  grade, id));
    }

    public static String studentID(String firstName, String lastName, int grade, long id){
        return "Name: " + lastName + ", " + firstName + "\nGrade: " + grade + "\nID: " + id;
    }
}
