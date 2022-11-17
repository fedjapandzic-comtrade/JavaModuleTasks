package org.example;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Logger logger = LoggerFactory.getLogger(SolutionTest.class);

    @BeforeAll
    public static void startedSolutionTestClass(){
        logger.info("Solution tests started.");
    }
    @AfterAll
    public static void finishedSolutionTestClass(){
        logger.info("Solution tests finished.");
    }

    @Test
    void correctSolutionTest() {
        logger.info("Test for using correct word and string in solution method of Solution class.");
        String word = "TEST";
        String string = "TESTTESTTESTTESSSTTTT";
        Solution solution = new Solution();

        int result = solution.solution(word,string);

        assertEquals(4,result);
        logger.info("Test for using correct word and string in solution method of Solution class passed.");
    }

    @Test
    void throwsIncorrectInputInFileExceptionForString(){
        logger.info("Test for exception being thrown if string has anything other than capital letters.");
        assertThrows(IncorrectInputInFileException.class, ()->{
            String word = "TEST";
            String string = "testTESTTESTTESSSTTTT";
            Solution solution = new Solution();

            int result = solution.solution(word,string);
        });
        logger.info("Test for exception being thrown if string has anything other than capital letters passed.");
    }

    @Test
    void throwsIncorrectInputInFileExceptionForWord(){
        logger.info("Test for exception being thrown if word has anything other than capital letters.");
        assertThrows(IncorrectInputInFileException.class, ()->{
            String word = "TesT";
            String string = "TESTTESTTESTTESSSTTTT";
            Solution solution = new Solution();

            int result = solution.solution(word,string);
        });
        logger.info("Test for exception being thrown if word has anything other than capital letters passed.");
    }
}