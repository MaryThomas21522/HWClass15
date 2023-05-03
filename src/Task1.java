public class Task1 {

    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {


        Task1 student1 = new Task1();
        student1.name="Darko";
        student1.ID="111-111";
        numberOfStudents++;

        Task1 student2 = new Task1();
        student1.name="Marko";
        student1.ID="222-222";
        numberOfStudents++;

        Task1 student3 = new Task1();
        student1.name="Connor";
        student1.ID="333-333";
        numberOfStudents++;


        System.out.println(numberOfStudents);

    }
}


/*
Create three variables Name , ID and numberOfStudents
Create three objects of the Students Class Set the value for studentName , studentID and increment
the numberOfStudents for each object
Print out total number of students

 */
