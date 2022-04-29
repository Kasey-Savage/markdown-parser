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
    public void getLinksTest1() throws IOException{
        Path testFile = Path.of("test-file.md");
        String testFileContents = Files.readString(testFile);

        assertEquals(List.of("https://something.com","some-thing.html"),
            MarkdownParse.getLinks(testFileContents) );
    }

    @Test
    public void getLinksTest2() throws IOException{
        Path testFile1 = Path.of("test-file1.md");
        String testFileContents = Files.readString(testFile1);

        assertEquals(List.of("https://hey.com", "hey.html"),
            MarkdownParse.getLinks(testFileContents));
    }

    @Test
    public void getLinksTest3() throws IOException{
        Path testFile1 = Path.of("test-file2.md");
        String testFileContents = Files.readString(testFile1);

        assertEquals(List.of("https://something.com", "some-page.html"),
            MarkdownParse.getLinks(testFileContents));
    }

    @Test
    public void getLinksTest4() throws IOException{
        Path testFile1 = Path.of("test-file3.md");
        String testFileContents = Files.readString(testFile1);

        assertEquals(List.of(),
            MarkdownParse.getLinks(testFileContents));
    }
}