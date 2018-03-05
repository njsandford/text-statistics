package com.njsandford.io;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ReadFileTest {

    @Test
    public void canGetFileContentAsString() {
        ReadFile rf = new ReadFile("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_para.txt");
        String content = rf.getContentAsString();
        String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. A arcu cursus vitae congue mauris rhoncus aenean vel elit. Commodo elit at imperdiet dui. Faucibus in ornare quam viverra. Lobortis mattis aliquam faucibus purus. Cursus sit amet dictum sit amet justo donec enim. At ultrices mi tempus imperdiet nulla malesuada. Purus non enim praesent elementum facilisis. Ut lectus arcu bibendum at varius vel pharetra vel. Scelerisque eleifend donec pretium vulputate sapien. Feugiat in ante metus dictum at tempor commodo. Risus feugiat in ante metus. Integer feugiat scelerisque varius morbi. Varius sit amet mattis vulputate enim nulla. Pellentesque habitant morbi tristique senectus et netus. Aliquet nec ullamcorper sit amet. Tempus urna et pharetra pharetra massa massa ultricies mi. Nibh praesent tristique magna sit amet purus gravida. Laoreet suspendisse interdum consectetur libero id faucibus nisl tincidunt eget. Iaculis urna id volutpat lacus.";

        Assert.assertEquals(expected, content);
    }

    @Test
    public void canGetLinesFromFile() {
        ReadFile rf = new ReadFile("/Users/natalie/IdeaProjects/text-statistics/src/main/resources/files/test_file.txt");
        List<String> lines = rf.getLines();
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. A arcu cursus vitae congue mauris rhoncus aenean vel elit. Commodo elit at imperdiet dui. Faucibus in ornare quam viverra. Lobortis mattis aliquam faucibus purus. Cursus sit amet dictum sit amet justo donec enim. At ultrices mi tempus imperdiet nulla malesuada. Purus non enim praesent elementum facilisis. Ut lectus arcu bibendum at varius vel pharetra vel. Scelerisque eleifend donec pretium vulputate sapien. Feugiat in ante metus dictum at tempor commodo. Risus feugiat in ante metus. Integer feugiat scelerisque varius morbi. Varius sit amet mattis vulputate enim nulla. Pellentesque habitant morbi tristique senectus et netus. Aliquet nec ullamcorper sit amet. Tempus urna et pharetra pharetra massa massa ultricies mi. Nibh praesent tristique magna sit amet purus gravida. Laoreet suspendisse interdum consectetur libero id faucibus nisl tincidunt eget. Iaculis urna id volutpat lacus.");
        expectedLines.add("");
        expectedLines.add("Volutpat lacus laoreet non curabitur gravida. Nec nam aliquam sem et tortor consequat id porta. Viverra orci sagittis eu volutpat odio. In hac habitasse platea dictumst quisque sagittis purus sit. Potenti nullam ac tortor vitae purus faucibus ornare. In hendrerit gravida rutrum quisque. Lacinia at quis risus sed vulputate odio. Accumsan sit amet nulla facilisi morbi tempus iaculis. Tempor id eu nisl nunc mi. Dictum fusce ut placerat orci nulla pellentesque dignissim enim. Tristique nulla aliquet enim tortor at auctor urna nunc. Consequat nisl vel pretium lectus quam.");
        expectedLines.add("");
        expectedLines.add("Commodo quis imperdiet massa tincidunt. Cras pulvinar mattis nunc sed blandit libero volutpat. Bibendum ut tristique et egestas quis ipsum. Eu lobortis elementum nibh tellus molestie nunc non. Elit pellentesque habitant morbi tristique senectus et netus et. Vulputate enim nulla aliquet porttitor lacus luctus accumsan tortor. Est velit egestas dui id ornare arcu odio ut. A arcu cursus vitae congue mauris rhoncus. In hac habitasse platea dictumst vestibulum rhoncus est pellentesque elit. Amet dictum sit amet justo donec enim diam vulputate ut. Ultrices vitae auctor eu augue ut. Tempus quam pellentesque nec nam aliquam sem et. Sapien faucibus et molestie ac feugiat sed lectus vestibulum. Elit pellentesque habitant morbi tristique senectus et netus et. Enim sit amet venenatis urna cursus eget nunc scelerisque. Libero justo laoreet sit amet cursus sit amet. Malesuada fames ac turpis egestas maecenas pharetra convallis posuere morbi.");
        expectedLines.add("");
        expectedLines.add("Suspendisse ultrices gravida dictum fusce ut placerat orci nulla. Bibendum neque egestas congue quisque egestas diam in arcu. Euismod elementum nisi quis eleifend. Id volutpat lacus laoreet non curabitur gravida. Senectus et netus et malesuada fames ac turpis egestas. Eget mauris pharetra et ultrices neque ornare aenean euismod. At auctor urna nunc id. Natoque penatibus et magnis dis parturient montes nascetur. Vitae auctor eu augue ut lectus arcu bibendum at. Sit amet aliquam id diam. Nam aliquam sem et tortor consequat id porta nibh venenatis. Ullamcorper morbi tincidunt ornare massa eget egestas. Urna nec tincidunt praesent semper feugiat nibh sed. Venenatis lectus magna fringilla urna porttitor rhoncus dolor. Vitae semper quis lectus nulla at volutpat diam ut. Pharetra sit amet aliquam id diam. Aliquam sem et tortor consequat.");
        expectedLines.add("");
        expectedLines.add("Purus faucibus ornare suspendisse sed nisi lacus sed viverra. Proin libero nunc consequat interdum varius sit amet mattis vulputate. Tellus integer feugiat scelerisque varius morbi enim nunc. Tincidunt vitae semper quis lectus nulla. Mattis molestie a iaculis at erat pellentesque. Non sodales neque sodales ut. Aliquam ultrices sagittis orci a scelerisque purus semper eget. Sed egestas egestas fringilla phasellus faucibus scelerisque. Sed faucibus turpis in eu mi. Velit aliquet sagittis id consectetur purus ut faucibus pulvinar. Sit amet cursus sit amet dictum sit amet. Quis blandit turpis cursus in hac habitasse platea dictumst quisque. Id aliquet lectus proin nibh nisl condimentum id. Est sit amet facilisis magna. Quis imperdiet massa tincidunt nunc pulvinar sapien et. Lorem sed risus ultricies tristique nulla aliquet. Ornare suspendisse sed nisi lacus sed viverra tellus.");

        Assert.assertEquals(expectedLines, lines);
    }
}
