package org.example;

import java.io.IOException;
import java.util.Scanner;

public class FilePaths {
    public void paths(String createFilePath, String readFilePath) throws IOException {
        WriterReader writerReader = new WriterReader();
        writerReader.writeRead(createFilePath, readFilePath);
    }
}
