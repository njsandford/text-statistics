import com.njsandford.io.ReadFile;
import org.junit.*;

public class ReadFileTest {

    @Test
    public void canGetFileContentAsString() {
        ReadFile rf = new ReadFile();
        String content = rf.getContentAsString("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_para.txt");
        String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. A arcu cursus vitae congue mauris rhoncus aenean vel elit. Commodo elit at imperdiet dui. Faucibus in ornare quam viverra. Lobortis mattis aliquam faucibus purus. Cursus sit amet dictum sit amet justo donec enim. At ultrices mi tempus imperdiet nulla malesuada. Purus non enim praesent elementum facilisis. Ut lectus arcu bibendum at varius vel pharetra vel. Scelerisque eleifend donec pretium vulputate sapien. Feugiat in ante metus dictum at tempor commodo. Risus feugiat in ante metus. Integer feugiat scelerisque varius morbi. Varius sit amet mattis vulputate enim nulla. Pellentesque habitant morbi tristique senectus et netus. Aliquet nec ullamcorper sit amet. Tempus urna et pharetra pharetra massa massa ultricies mi. Nibh praesent tristique magna sit amet purus gravida. Laoreet suspendisse interdum consectetur libero id faucibus nisl tincidunt eget. Iaculis urna id volutpat lacus.";

        Assert.assertEquals(expected, content);
    }
}
