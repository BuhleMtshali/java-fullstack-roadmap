import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) throws Exception {
        System.out.println("====== 🧮 MINI CALCULATOR 🎲 =====");

        //SCANNER FOR GETTING THE USER INPUT
        Scanner input = new Scanner(System.in);

        //STARTING THE WHILE LOOP
        while (true) {
            //DECLARING THE OUTPUT
            Double output;


            //GETTING FIRST NUMBER
            System.out.print("\n 1️⃣ Enter your first number: ");
            Double firstNumber = input.nextDouble();

            //GETTING THE OPERATOR
            System.out.print("Choose an operator (+, -, *, x, /): ");
            char operator = input.next().charAt(0);

            //GETTING THE FINAL VALUE
            System.out.print("Enter your second value: ");
            Double secondNumber = input.nextDouble();



            //ASKING IF THE USER WANTS TO RERUN THE PROGRAM
            System.out.print("\n Wanna run another calculation? (yes/no): ");
            String answer = input.nextLine().trim().toLowerCase();

            //CLOSING STATEMENTS
            if(answer.equals("no")){
                System.out.println("🐝 Thank you for using my mini calculator🎲");
                break;
            } else {
                System.out.println("\n🔁 Okayyy let’s run another one! 🎉");
            }
        }

        //CLOSING THE LOOP
        input.close();
    }
}
