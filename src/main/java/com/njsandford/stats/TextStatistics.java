package com.njsandford.stats;

import com.njsandford.io.ReadFile;

/**
 * Provides functionality to compute statistics on text files.
 */
public class TextStatistics {

    private String text;

    public TextStatistics(String filepath) {
        ReadFile readFile = new ReadFile();
        this.text = readFile.getContentAsString(filepath);
    }

    /**
     * @return number of whitespace delimited words in text document.
     */
    public int wordCountByWhiteSpace() {
        if (text == "") {
            return 0;
        }
        String[] words = text.split("\\s");
        return words.length;
    }
}
