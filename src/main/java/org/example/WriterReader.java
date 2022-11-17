package org.example;

import java.io.*;

public class WriterReader {
    public void writeRead(String createdFile, String readingFile) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(readingFile));
        String word = reader.readLine();
        File newFile = new File(createdFile);
        Solution solution = new Solution();
        System.out.println("Testing for word: " + word);
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        String line = reader.readLine();

        writer.write("The word " + word + " is repeated: \n");
        while (line != null) {
            String text = "In " + line + " " + solution.solution(word, line) + " times.";
            writer.write(text + "\n");
            line = reader.readLine();
        }
        reader.close();
        writer.close();

        System.out.println("Results written in result.txt file.");
    }
}
