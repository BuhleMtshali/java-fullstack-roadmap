public class HelloWorld{
    public static void main(String[] args) {
        printStudent("Kathy");
    }

    public static void printStudent(String name){
        String[] students = {"Kathy", "James", "Lebo"};
        boolean found = false;

        //LOOPING THROUGH THE STUDENT ARRAY
        for(String student : students){
            if(student.equals(name)){
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Student not found");
        }
    }
    
}