package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MissingTextException {
//        WriterReader writerReader = new WriterReader();
//        Scanner scanner = new Scanner(System.in);
//        String fileToBeRead;
//        if(args != null && args.length>0){
//            fileToBeRead =args[0];
//        }
//        else {
//            System.out.println("Enter path to the file you want to read:");
//            fileToBeRead = scanner.nextLine();
//        }
//
//        writerReader.writeRead(fileToBeRead);

        Reader reader = new Reader();
        String path="C:\\Users\\fedjap\\IdeaProjects\\JavaModule\\src\\main\\java\\org\\example\\text.txt";
        reader.read(path);


    }

}