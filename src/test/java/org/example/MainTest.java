package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Writer;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static final Logger logger = LoggerFactory.getLogger(SolutionTest.class);

    @BeforeAll
    public static void startedMainTestClass() {
        logger.info("Main tests started.");
    }

    @AfterAll
    public static void finishedMainTestClass() {
        logger.info("Main tests finished.");
    }

    @Test
    void solutionWorksInMain() throws IOException {
        logger.info("Testing for solution method working in Main class.");
        WriterReader writerReader = new WriterReader();
        String createdFile = "C:\\Users\\fedjap\\IdeaProjects\\JavaModule\\src\\main\\java\\org\\example\\result.txt";
        String readingFile = "C:\\Users\\fedjap\\IdeaProjects\\JavaModule\\src\\main\\java\\org\\example\\text.txt";
        writerReader.writeRead(createdFile, readingFile);
        logger.info("Testing for solution method working in Main class passed.");
    }

    @Test
    void mainMethodThrowsException() {
        logger.info("Testing for main method throwing exception.");
        assertThrows(MissingFileException.class, () -> {
            Main testingMain = new Main();
            String[] CreatingAndReadingFiles = {"C:\\Users\\fedj\\src\\main\\java\\org\\example\\result.txt",
                    "C:\\Users\\fedjap\\IdeaProjects\\JavaModule\\src\\main\\java\\org\\example\\text.txt"};
            testingMain.main(CreatingAndReadingFiles);
        });
        logger.info("Testing for main method throwing exception passed");
    }

    @Test
    void mainMethodWorksInMain() throws MissingFileException {
        logger.info("Testing for main method working in main.");
        Main testingMain = new Main();
        testingMain.main(null);
        logger.info("Testing for main method working in main passed.");
    }
}