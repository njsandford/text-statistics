import com.njsandford.stats.TextStatistics;
import org.junit.*;

import java.util.Map;

public class TextStatisticsTest {

    @Test
    public void canCountWordsInTextFile() {
        TextStatistics textStatistics = new TextStatistics();
        int wordCount = textStatistics.wordCountByWhiteSpace("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_words.txt");
        int expectedWordCount = 19;

        Assert.assertEquals(expectedWordCount, wordCount);

        wordCount = textStatistics.wordCountByWhiteSpace("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/blank_file.txt");
        expectedWordCount = 0;

        Assert.assertEquals(expectedWordCount, wordCount);
    }

    @Test
    public void canGetLineCount() {
        TextStatistics textStatistics = new TextStatistics();
        int lineCount = textStatistics.lineCount("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_file.txt");
        int expectedLineCount = 9;

        Assert.assertEquals(expectedLineCount, lineCount);

        lineCount = textStatistics.lineCount("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/blank_file.txt");
        expectedLineCount = 0;

        Assert.assertEquals(expectedLineCount, lineCount);
    }

    @Test
    public void canGetAverageLettersPerWord() {
        TextStatistics textStatistics = new TextStatistics();
        double averageLetters = textStatistics.averageLettersPerWord("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_file.txt");
        double expectedAverage = 5.5;

        Assert.assertEquals(expectedAverage, averageLetters,0);

        averageLetters = textStatistics.averageLettersPerWord("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/blank_file.txt");
        expectedAverage = 0;

        Assert.assertEquals(expectedAverage, averageLetters,0);
    }

    @Test
    public void canGetMostCommonWord() {
        TextStatistics textStatistics = new TextStatistics();

        String mostCommonWord = textStatistics.mostCommonWord("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_file.txt");
        String expectedWord = "sit";

        Assert.assertEquals(expectedWord, mostCommonWord);
    }
}
