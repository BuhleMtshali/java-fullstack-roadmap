import java.util.Scanner;

public class FinanceSnapshot {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("===== 💸 Mini Finance Snapshot 🚕 ====");

        //STARTING THE WHILE LOOP
        while (true) {
            System.out.print("Loop running..");



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
