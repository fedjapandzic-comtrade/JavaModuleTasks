package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MissingFileException {
        Main main = new Main();
        try {
            FilePaths filePaths = new FilePaths();
            String createdFile = "C:\\Users\\fedjap\\IdeaProjects\\JavaModule\\src\\main\\java\\org\\example\\result.txt";
            String readingFile = "C:\\Users\\fedjap\\IdeaProjects\\JavaModule\\src\\main\\java\\org\\example\\text.txt";
            if (args != null && args.length > 0) {
                createdFile = args[0];
                readingFile = args[1];
                filePaths.paths(createdFile, readingFile);
            } else {

                filePaths.paths(createdFile, readingFile);
            }


        } catch (IOException e) {
            throw new MissingFileException("File path is incorrect.");
        }
    }


    public void solution(String createdFile, String readingFile) throws IOException {
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