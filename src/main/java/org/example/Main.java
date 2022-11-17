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


}