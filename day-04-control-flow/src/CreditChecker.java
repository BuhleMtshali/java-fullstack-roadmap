import java.util.Scanner;

public class CreditChecker {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //GREETING MESSAGE
        System.out.println("--------- ⏳ CREDIT ELIGIBILITY 💴 ----------");

        //CREATING A WHILE LOOP
        while (true) {
            System.out.println("loop is running...");




            //CLOSING THE LOOP
            System.out.print("\n 🕯️ Wanna check again? (yes/no): ");
            String answer = input.nextLine().trim().toLowerCase();

            //CLOSING STATEMENTS
            if(answer.equals("no")){
                System.out.println("------------ 🧾 THANK YOU FOR TRYING MY ELIGIBILITY STATUS CHECKER 💡 -----------");
                break;
            }else {
                System.out.println("\n ------ ⏪ Okayyy, let's run another Calculation 💡 ------------");
            }
        }




        //CLOSING THE SCANNER
        input.close();
    }
}
