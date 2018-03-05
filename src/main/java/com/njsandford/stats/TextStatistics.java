package com.njsandford.stats;

import com.njsandford.io.ReadFile;

import java.util.*;

/**
 * Provides functionality to compute statistics on text files.
 *
 * @author Natalie Sandford
 *
 * @see ReadFile
 */
public class TextStatistics {

    private ReadFile readFile = new ReadFile();


    /**
     * Constructs a text statistic object with a new instance of {@link ReadFile}.
     */
    public TextStatistics() {
        this.readFile = new ReadFile();
    }

    /**
     * Counts the number of words in a text file delimited by whitespace characters.
     * @param filepath the full filepath in the text file.
     * @return number of whitespace delimited words in text document.
     */
    public int wordCountByWhiteSpace(String filepath) {
        List<String> lines = readFile.getLines(filepath);
        List<String> words = getAllWordsFromLines(lines);
        return words.size();
    }

    /**
     * Counts the number of lines in a text file.
     * @param filepath the full filepath of the text file.
     * @return the number of lines in the text file.
     */
    public int lineCount(String filepath) {
        List<String> lines = readFile.getLines(filepath);

        return lines.size();
    }

    /**
     * Calculates the average number of letters in a text file to one decimal place.
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

    /**
     * Finds the most commonly occuring word in a text file.
     * @param filepath the full filepath of the text file.
     * @return the most common word.
     */
    public String mostCommonWord(String filepath) {

        List<String> content = readFile.getLines(filepath);
        Map<String, Integer> wordFreq = getWordFrequencies(content);

        String modeWord = "";
        int modeFreq = 0;
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            if (modeFreq < entry.getValue()) {
                modeWord = entry.getKey();
                modeFreq = entry.getValue();
            }
        }
        return modeWord;
    }

    /**
     * Produces a hash map consisting of all words mapped to the number of occurrences in a list of lines from a text file.
     * @param lines a list of strings representing all lines in a text file.
     * @return mapping of words to frequencies.
     */
    private Map<String, Integer> getWordFrequencies(List<String> lines) {
        Map<String, Integer> wordFrequencies = new HashMap<>();

        List<String> words = getAllWordsFromLines(lines);

        for (String word : words) {
            word = word.toLowerCase();
            if (wordFrequencies.get(word) == null) {
                wordFrequencies.put(word, 1);
            } else {
                wordFrequencies.put(word, wordFrequencies.get(word) + 1);
            }
        }
        return wordFrequencies;
    }

    /**
     * Get a list of all words that occur in a list of strings, e.g. lines from a text file.
     * @param lines a list of strings, e.g. lines from a text file.
     * @return a list of all words.
     */
    private List<String> getAllWordsFromLines(List<String> lines) {
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            if (line != null && line != "") {
                words.addAll(Arrays.asList(line.split("[\\W]+")));
            }
        }
        return words;
    }
}
