package com.example;

public class Text implements TextService{

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


    @Override
    public int[] lettersInText() {
        int[] alphabet = new int[26];
        for (int i = 0; i < this.getText().length(); i++) {
            if ((this.getText().charAt(i) - 'A') > 25 || (this.getText().charAt(i) - 'A') < 0) {
                throw new IncorrectInputInTextException("File contains small letters/number/special characters.");
            }
            alphabet[this.getText().charAt(i) - 'A']++;
        }
        return alphabet;
    }
}
