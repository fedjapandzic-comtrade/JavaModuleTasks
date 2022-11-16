package org.example;

import org.junit.jupiter.api.Test;
import org.example.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void correctSolutionTest() {
        String word = "TEST";
        String string = "TESTTESTTESTTESSSTTTT";
        Solution solution = new Solution();

        int result = solution.solution(word,string);

        assertEquals(4,result);
    }

    @Test
    void throwsIncorrectInputInFileExceptionForString(){
        assertThrows(IncorrectInputInFileException.class, ()->{
            String word = "TEST";
            String string = "testTESTTESTTESSSTTTT";
            Solution solution = new Solution();

            int result = solution.solution(word,string);
        });
    }

    @Test
    void throwsIncorrectInputInFileExceptionForWord(){
        assertThrows(IncorrectInputInFileException.class, ()->{
            String word = "TesT";
            String string = "TESTTESTTESTTESSSTTTT";
            Solution solution = new Solution();

            int result = solution.solution(word,string);
        });
    }

}