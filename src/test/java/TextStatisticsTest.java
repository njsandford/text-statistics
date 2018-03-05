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

    @Test
    public void canGetLineCount() {
        TextStatistics textStatistics = new TextStatistics("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_file.txt");
        int lineCount = textStatistics.lineCount();
        int expectedLineCount = 9;

        Assert.assertEquals(expectedLineCount, lineCount);

        textStatistics = new TextStatistics("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/blank_file.txt");

        lineCount = textStatistics.lineCount();
        expectedLineCount = 0;

        Assert.assertEquals(expectedLineCount, lineCount);
    }

    @Test
    public void canGetAverageLettersPerWord() {
        TextStatistics textStatistics = new TextStatistics("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_file.txt");
        double averageLetters = textStatistics.averageLettersPerWord();
        double expectedAverage = 5.5;

        Assert.assertEquals(expectedAverage, averageLetters,0);

        textStatistics = new TextStatistics("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/blank_file.txt");

        averageLetters = textStatistics.averageLettersPerWord();
        expectedAverage = 0;

        Assert.assertEquals(expectedAverage, averageLetters,0);
    }

    @Test
    public void canGetMostCommonWord() {
        TextStatistics textStatistics = new TextStatistics("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_file.txt");

        String mostCommonWord = textStatistics.mostCommonWord();
        String expectedWord = "sit";

        Assert.assertEquals(expectedWord, mostCommonWord);
    }
}
