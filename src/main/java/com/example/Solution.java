package com.example;

public class Solution {

    public int solution(String word,String text){
        Word wordObject = new Word(word);
        Text textObject = new Text(text);
        int[] textAlphabet;
        int[] wordAlphabet;
        wordAlphabet = wordObject.lettersInWord();
        textAlphabet = textObject.lettersInText();

        int counter = 0;
        boolean isTrue = true;

        while (isTrue) {

            for (int i = 0; i < textAlphabet.length; i++) {
                if (textAlphabet[i] - wordAlphabet[i] >= 0) {
                    textAlphabet[i] -= wordAlphabet[i];
                } else {
                    isTrue = false;
                    break;
                }
                if (i == 25) {
                    counter++;
                }
            }

        }

        return counter;
    }
}
