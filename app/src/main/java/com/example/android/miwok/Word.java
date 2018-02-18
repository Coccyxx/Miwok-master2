package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word in Miwok.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    //a field for the default translation for the word
    private String defaultTranslation;

    //Miwok translation for the word
    private String miwokWord;

    // Constructor
    Word(String englishWord, String miwokWord) {
        this.defaultTranslation=englishWord;
        this.miwokWord=miwokWord;
    }

    //Getter method for the Miwok translation
    public String getMiwokTranslation(){
        return miwokWord;
    }

    //Getter method for the default translation
    public String getDefaultTranslation() {
        return miwokWord;
    }
    
}
