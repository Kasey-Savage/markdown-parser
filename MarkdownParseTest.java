import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTest() throws IOException{
        Path testFile = Path.of("test-file.md");
        String testFileContents = Files.readString(testFile);

        assertEquals(List.of("https://something.com","some-thing.html"),
            MarkdownParse.getLinks(testFileContents) );
    }
}