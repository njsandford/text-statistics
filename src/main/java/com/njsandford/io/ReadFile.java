package com.njsandford.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides functionality to read from a text file and return the content of the file.
 *
 * @author Natalie Sandford
 */
public class ReadFile {

    /**
     * The full filepath of the text file.
     */
    private String filepath;

    /**
     * Constructs a read file object containing a filepath for a text file.
     * @param filepath the full filepath of the text file.
     */
    public ReadFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Get all text content from a text file and return as a single string.
     * Should only be used for text files that are known to be small enough to be held in a single String object.
     * @return a string representation of the text file content.
     */
    public String getContentAsString() {
        String content = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {

            String line;
            while ((line = br.readLine()) != null) {
                content += line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    /**
     * Get all lines from a text file stored as an array list of strings.
     * @return list of all lines in the text file.
     */
    public List<String> getLines() {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
