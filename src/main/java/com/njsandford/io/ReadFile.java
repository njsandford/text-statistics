package com.njsandford.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
}
