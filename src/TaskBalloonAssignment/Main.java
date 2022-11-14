package TaskBalloonAssignment;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your string(in capital letters!): ");
        String letters = scanner.nextLine();
        System.out.println("Possible instances of the word \"BALLOON\" in the string is: " + solution.solution(letters));
    }

}