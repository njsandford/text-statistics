import com.njsandford.stats.TextStatistics;
import org.junit.*;

public class TextStatisticsTest {

    @Test
    public void canCountWordsInTextFile() {
        TextStatistics textStatistics = new TextStatistics("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_words.txt");
        int wordCount = textStatistics.wordCountByWhiteSpace();
        int expectedWordCount = 19;

        Assert.assertEquals(expectedWordCount, wordCount);

        textStatistics = new TextStatistics("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/blank_file.txt");
        wordCount = textStatistics.wordCountByWhiteSpace();
        expectedWordCount = 0;

        Assert.assertEquals(expectedWordCount, wordCount);
    }
}
