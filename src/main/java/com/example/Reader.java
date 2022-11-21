package com.example;

import javax.servlet.http.HttpServlet;
import java.io.*;

public class Reader{

    public void read(String pathToLoadFile) throws MissingTextException {
        try {
            BufferedReader reader;
            reader = new BufferedReader(new FileReader(pathToLoadFile));
            line = reader.readLine();

            while(line != null){
                String text = line;
                line = reader.readLine();
                System.out.println(line);
            }
            reader.close();

        }
        catch (IOException e){
            throw new MissingTextException("Incorrect path to file");
        }
    }

    public void setLine(String line) {
        this.line = line;
    }

    private String line;

}
