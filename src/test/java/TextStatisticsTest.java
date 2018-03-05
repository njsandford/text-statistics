import com.njsandford.stats.TextStatistics;
import org.junit.*;

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
}
