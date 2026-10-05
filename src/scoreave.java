import java.util.Scanner;

class scoreave {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score;
        int total = 0;
        int count = 0;
        double average;

        System.out.print("Enter a score (-1 to stop): ");
        score = input.nextInt();

        while (score != -1) {

            total += score;
            count++;

            System.out.print("Enter a score (-1 to stop): ");
            score = input.nextInt();
        }

        average = (double) total / count;

        System.out.println("Total= " + total);
        System.out.println("Number of Quizzes = " + count);
        System.out.println("Average score = " + average);

        input.close();
    }
}