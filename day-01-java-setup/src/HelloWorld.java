public class HelloWorld{
    public static void main(String[] args) {
        printStudent("Buhle");
    }

    public static void printStudent(String name){
        String[] students = {"Kathy", "James", "Lebo"};
        boolean found = false;

        //LOOPING THROUGH THE STUDENT ARRAY
        for(String student : students){
            System.out.println("Student found: " + student);
            found = true;
            break;
        }
    }
}