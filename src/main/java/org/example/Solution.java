package org.example;

public class Solution {

    public int solution(String word,String S){
    int[] alphabetForWord = new int[26];
    int[] alphabet = new int[26];

    for (int i = 0; i < word.length(); i++) {
        if((word.charAt(i) - 'A') > 25 || (word.charAt(i) - 'A') < 0) {
            throw new IncorrectInputInFile("File contains small letters/number/special characters.");
        }
        alphabetForWord[word.charAt(i) - 'A']++;
    }

    for (int i = 0;i<S.length();i++){
        alphabet[S.charAt(i) - 'A']++;
    }

    int counter = 0;
    boolean isTrue = true;

    while (isTrue){

        for (int i = 0;i<alphabet.length;i++) {
            if (alphabet[i] - alphabetForWord[i] >= 0) {
                alphabet[i] = alphabet[i] - alphabetForWord[i];
            } else {
                isTrue = false;
                break;
            }
            if (i==25){
                counter++;
            }
        }

    }


    return counter;
}
}
