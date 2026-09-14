import java.util.Scanner;

public class CreditChecker {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //GREETING MESSAGE
        System.out.println("--------- ⏳ CREDIT ELIGIBILITY 💴 ----------");

        //CREATING A WHILE LOOP
        while (true) {
            System.out.print("How much is Gross salary income before taxes and deductions (R):");
            double grossSalary = input.nextDouble();

            System.out.print("How much is your salary after deductions (R): ");
            double totalSalary = input.nextDouble();

            System.out.print("What is your credit score: ");
            int creditScore = input.nextInt();

            System.out.print("Enter the loan amount you require (R): ");
            double loanAmount = input.nextDouble();



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
