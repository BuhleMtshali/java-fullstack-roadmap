import java.util.Scanner;

public class FinanceSnapshot {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("===== 💸 Mini Finance Snapshot 🚕 ====");

        //STARTING THE WHILE LOOP
        while (true) {
            System.out.print("🙋🏻‍♀️How much is your cumulative income per month(R): ");
            Double salary = input.nextDouble();
            System.out.print("How much are your monthly expenses(R): ");
            Double expenses = input.nextDouble();
            System.out.print("What percentage of your salary do save(%): ");
            Double savings = input.nextDouble();

            //CALCULATING SAVINGS
            Double totalSavings = savings / 100 * salary;
            System.out.print("Saving: R" + totalSavings);

            //CALCULATING LEFTOVER MONEY
            Double leftOverMoney = salary - expenses - totalSavings;

            System.out.println("\n======== MONTLY SNAPSHOT =======");
            System.out.println("Montly Income: R" + salary);
            System.out.println("Montly Expenses: R" + expenses);
            System.out.println("Montly Savings Rate: " + savings + "%");
            System.out.println("Total Saving: R" + totalSavings);
            System.out.println("Leftover Money R: " + leftOverMoney);
            System.out.println("\n==================================");

            //CLEARING OUT THE INPUT
            input.nextLine();

            //CHECKING IF WE OKAY TO CLOSE THE LOOP HERE
            System.out.print("\n Wanna create another Snapshot? (yes/no): ");
            String response = input.nextLine().trim().toLowerCase();

            //IF STATEMENTS TO CHECK WHETHER TO CLOSE THE LOOP OR NOT
            if(response.equals("no")){
                System.out.println("======== THANK YOU =======");
                break;
            } else {
                System.out.println("===== Okay, lets create another Snapshot🧾 =====");
            }
        }

        //CLOSING THE SCANNER
        input.close();
    }
}
