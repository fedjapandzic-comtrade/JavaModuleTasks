package TaskBalloonAssignment;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your word(in capital letters!): ");
        String word = scanner.nextLine();
        System.out.print("Please enter your string(in capital letters!): ");
        String letters = scanner.nextLine();

        System.out.println("The number of times the word \"" + word + "\" can be written is:" + solution.solution(word,letters));

    }

}