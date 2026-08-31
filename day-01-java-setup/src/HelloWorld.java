public class HelloWorld{
    public static void main(String[] args) {
        printStudent("Kathy");
    }

    public static void printStudent(String name){
        //CREATING AN ARRAY FOR THE NAMES
        String[] students = {"Kathy", "James", "Lebo"};
        //BOOLEAN TO CHECK IF THE NAME HAS BEEN FOUND
        boolean found = false;

        //LOOPING THROUGH THE STUDENT ARRAY
        for(String student : students){
            //STATEMENT TO CHECK IF THE NAME IS FOUND
            if(student.equals(name)){
                System.out.println("Student found: " + student);
                //IF NAME MATCHES, CHANGE THE BOOLEN TO TRUE
                found = true;
                //SINCE THE NAME HAS BEEN FOUND, WE BREAK THE LOOP
                break;
            }
        }

        //IF THE NAME IS NOT FOUND IN THE ARRAY, WE PRINT THE ERROR STATEMENT
        if(!found){
            System.out.println("Student not found");
        }
    }
    
}