package com.njsandford.stats;

import com.njsandford.io.ReadFile;

import java.util.List;

/**
 * Provides functionality to compute statistics on text files.
 */
public class TextStatistics {

    private ReadFile readFile = new ReadFile();


    public TextStatistics() {
        this.readFile = new ReadFile();
    }

    /**
     * @param filepath the full filepath in the text file.
     * @return number of whitespace delimited words in text document.
     */
    public int wordCountByWhiteSpace(String filepath) {
        String text = readFile.getContentAsString(filepath);
        if (text == "") {
            return 0;
        }
        String[] words = text.split("\\s");
        return words.length;
    }

    /**
     * @param filepath the full filepath of the text file.
     * @return the number of lines within the text file.
     */
    public int lineCount(String filepath) {
        List<String> lines = readFile.getLines(filepath);

        return lines.size();
    }
}
