package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable {
    public static void main(String[] args) throws IOException {

        ExecutorService service = Executors.newCachedThreadPool();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of files: ");
        String numberOfFiles = scanner.nextLine();
        ArrayList<String> files = new ArrayList<String>();
        for(int i = 1;i<=Integer.parseInt(numberOfFiles);i++){
            System.out.println("Enter " + i + ". file path:");
            String filePath = scanner.nextLine();
            files.add(filePath);
        }


        for(int i = 0;i< files.size();i++){
            service.execute(new MyThread(files.get(i)));

        }



    }

    @Override
    public void run() {

    }

    static class MyThread implements Runnable{


        private String path;

        @Override
        public void run() {
            PrintingClass printingClass = new PrintingClass();
            try {
                printingClass.print(path);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        public MyThread(String path) {
            this.path = path;
        }
    }
}