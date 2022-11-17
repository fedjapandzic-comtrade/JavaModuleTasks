package org.example;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final Logger logger = LoggerFactory.getLogger(SolutionTest.class);

    @BeforeAll
    public static void startedMainTestClass(){
        logger.info("Solution tests started.");
    }

    @Test
    void correctSolutionTest() {
        logger.info("correctSolutionTest test started.");
        String word = "TEST";
        String string = "TESTTESTTESTTESSSTTTT";
        Solution solution = new Solution();

        int result = solution.solution(word,string);

        assertEquals(4,result);
        logger.info("correctSolutionTest test ended.");
    }

    @Test
    void throwsIncorrectInputInFileExceptionForString(){
        logger.info("throwsIncorrectInputInFileExceptionForString test started.");
        assertThrows(IncorrectInputInFileException.class, ()->{
            String word = "TEST";
            String string = "testTESTTESTTESSSTTTT";
            Solution solution = new Solution();

            int result = solution.solution(word,string);
        });
        logger.info("throwsIncorrectInputInFileExceptionForString test ended.");
    }

    @Test
    void throwsIncorrectInputInFileExceptionForWord(){
        logger.info("throwsIncorrectInputInFileExceptionForWord test started.");
        assertThrows(IncorrectInputInFileException.class, ()->{
            String word = "TesT";
            String string = "TESTTESTTESTTESSSTTTT";
            Solution solution = new Solution();

            int result = solution.solution(word,string);
        });
        logger.info("throwsIncorrectInputInFileExceptionForWord test ended.");
    }
}