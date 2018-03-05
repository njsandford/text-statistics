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

    /**
     * @param filepath the full filepath of the text file.
     * @return the average number of letters per word in the text file to one decimal place.
     */
    public double averageLettersPerWord(String filepath) {
        double averageLetters = 0;

        double totalWords = 0;
        double totalLetters = 0;
        double currentWords = 0;

        List<String> lines = readFile.getLines(filepath);
        for (String line : lines) {
            String[] words = line.split("[\\W]+");
            currentWords = words.length;
            totalWords += currentWords;
            for (int i = 0; i < currentWords; i++) {
                totalLetters += words[i].length();
            }
        }

        averageLetters = Math.round((totalLetters/totalWords) * 10.0) / 10.0;
        return averageLetters;
    }
}
