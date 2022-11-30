package org.example;

import java.io.*;

public class PrintingClass {

    public void print(String pathToFile) throws IOException, InterruptedException {


        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        String word = reader.readLine();
        String line = reader.readLine();

        Solution solution = new Solution();
        System.out.println("The word " + word + " is repated:");
        while (line != null){
            System.out.println("In " + line + " " + solution.solution(word, line) + " times.");
            line = reader.readLine();
            Thread.sleep(1000);
        }
        reader.close();



    }
}
