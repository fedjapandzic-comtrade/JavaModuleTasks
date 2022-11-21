package com.example;

import java.io.*;

public class WriterReader {

    private WriterReaderService wrService;
    public void writeRead(String pathToLoadFile) throws MissingTextException {

        try {
            BufferedReader reader;
            reader = new BufferedReader(new FileReader(pathToLoadFile));
            String word = reader.readLine();
            File newFile = new File("results.txt");
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
        }
        catch (IOException e){
            throw new MissingTextException("Incorrect path to file");
        }




    }
}
