package com.example;

public class Word implements WordService {

    private String word;

    public Word(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }


    @Override
    public int[] lettersInWord() {
        int[] alphabet = new int[26];
        for (int i = 0; i < word.length(); i++) {
            if ((this.getWord().charAt(i) - 'A') > 25 || (this.getWord().charAt(i) - 'A') < 0) {
                throw new IncorrectInputInTextException("File contains small letters/number/special characters.");
            }
            alphabet[this.getWord().charAt(i) - 'A']++;
        }
        return alphabet;
    }
}
