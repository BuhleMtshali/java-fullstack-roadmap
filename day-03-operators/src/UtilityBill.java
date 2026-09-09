//IMPORT THE UTILITY SCANNNER
import java.util.Scanner;


public class UtilityBill {
    public static void main(String[] args) throws Exception {
        
        //CREATING THE SCANNER OBJECT
        //SYSTEN IN MEANS WE WANT TO RECEIVE THE INPUT FROM THE KEYBOARD
        Scanner input = new Scanner(System.in);

        //STARTING THE WHILE LOOP TO REASK IF THEY WANT TO RECALCULATE THE BILL
        while (true) {
            System.out.print("Loop is running...");





            //CLOSING THE LOOP
            //ASKING THE USER IF THEY WANT TO RERUN THE LOOP
            System.out.print("\n 🧾 Wanna run another calculation? (yes/no): ");
            String answer = input.nextLine().trim().toLowerCase();


            //CLOSING STATEMENTS
            if(answer.equals("no")){
                System.out.println("\n--------- 🧾 THANK YOU FOR TRYING MY UTILITY BILL CALCULATOR 🧾 -----------");
                break;
            } else {
                System.out.println("\n ------ ⏪ Okayyy, let's run another Calculation 💡 ------------");
            }
        }




        //CLOSING THE INPUT SCANNER
        input.close();
    }
}
