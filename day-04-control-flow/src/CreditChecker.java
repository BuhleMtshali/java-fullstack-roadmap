import java.util.Scanner;

public class CreditChecker {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //GREETING MESSAGE
        System.out.println("--------- ⏳ CREDIT ELIGIBILITY 💴 ----------");

        //CREATING A WHILE LOOP
        while (true) {
            System.out.print("What is your name: ");
            String name = input.nextLine();

            System.out.print("What is your age: ");
            int age = input.nextInt();

            System.out.print("How much is your salary after deductions (R): ");
            double totalSalary = input.nextDouble();

            System.out.print("What is your credit score: ");
            int creditScore = input.nextInt();

            System.out.print("Enter the loan amount you require (R): ");
            double loanAmount = input.nextDouble();

            double loanPercentage = loanAmount / totalSalary * 100;

            //CLEARING THE INPUT FIELD
            input.nextLine();

            //STARTING CONTROL FLOW STATEMENTS
            if(age >= 18 && creditScore >= 650 && loanPercentage <= 30){
                System.out.println("✅ Congratulations " + name + " your loan has been approved!");
            } else if (age >= 18 && creditScore >= 650 && loanAmount >= 30){
                System.out.println("⛔️ Unfortunately your loan application has been denied due to the fact that the requested loan amount of: R" + loanAmount + " is " + loanPercentage + "% and for a loan to be approved, the loan amount has to 30% or less than your salary!" );
            }else {
                System.out.print("🆘 Loan denied, your did not meet the requirements this time");
            }

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
