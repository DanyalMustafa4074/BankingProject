import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of student: ");
        String name = input.nextLine();
        s.setName(name);
        System.out.println("enter the id of student: ");
        int id = input.nextInt();
        s.setID(id);


        System.out.println("name of student : "+ s.getName());
        System.out.println("id of students : "+ s.getID());
        System.out.println("grade of student : "+s.getGrade());


    }
}
