import java.util.Scanner;

class indiv {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount;
        int total = 0;
        int count = 0;
        double average;

        System.out.print("Enter amount spent on item (0 to stop): ");
        amount = input.nextInt();

        while (amount != 0) {

            total += amount;
            count++;

            System.out.print("Enter amount spent on item (0 to stop): ");
            amount = input.nextInt();
        }

        System.out.println("Total amount spent: " + total);
        System.out.println("Number of items purchased: " + count);

        input.close();
    }
}