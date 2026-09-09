//IMPORT THE UTILITY SCANNNER
import java.util.Scanner;


public class UtilityBill {
    public static void main(String[] args) throws Exception {
        
        //CREATING THE SCANNER OBJECT
        //SYSTEN IN MEANS WE WANT TO RECEIVE THE INPUT FROM THE KEYBOARD
        Scanner input = new Scanner(System.in);

        //STARTING THE WHILE LOOP TO REASK IF THEY WANT TO RECALCULATE THE BILL
        while (true) {

            //GREETING MESSAGE
            System.out.print("========== 🧾 UTILITY BILL CALCULATOR 💡 =============");

            //GETTING THE USERS CONSUMES UNITS
            System.out.print("💡 Enter units consumed (kWh): ");
            Double units = input.nextDouble();


            //CHECKING IF THIS WAS DOMESTIC CONSUMPTION OR COMMERCIAL
            System.out.print("🕹️ Enter connection type (1 for Domestic, 2 for commercial): ");
            int type = input.nextInt();

            //NOW LETS CREATE THE BILL AND CATEGORY VARIABLES
            Double totalBill = 0.0;
            String category = "";


            //STARTING THE CALCULATIONS

            //1. FIRST ITS FOR THE COMMERCIAL USECASE
            if(type == 1){
                category = "DOMESTIC";

                //FIRST CALCULATING IF THE USER CONSUMED LESS/EQUALL TO 100 UNITS
                if(units <= 100){
                    //FIRST 100 UNITS ARE CALCULATED AT R3 PER UNIT
                    totalBill = units * 3.0;
                }
            }


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
