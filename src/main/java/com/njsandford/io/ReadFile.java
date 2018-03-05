package com.njsandford.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public String getContentAsString(String filepath) {
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

    public List<String> getLines(String filepath) {
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
