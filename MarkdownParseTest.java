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

    @Test
    public void getLinksTest1() throws IOException{
        Path testFile1 = Path.of("test-file1.md");
        String testFileContents = Files.readString(testFile1);

        assertEquals(List.of("https://hey.com", "hey.html"),
            MarkdownParse.getLinks(testFileContents));
    }

    @Test
    public void getLinksTest2() throws IOException{
        Path testFile2 = Path.of("test-file2.md");
        String testFileContents = Files.readString(testFile2);

        assertEquals(List.of("https://something.com", "some-page.html"),
            MarkdownParse.getLinks(testFileContents));
    }

    @Test
    public void getLinksTest3() throws IOException{
        Path testFile3 = Path.of("test-file3.md");
        String testFileContents = Files.readString(testFile3);

        assertEquals(List.of(),
            MarkdownParse.getLinks(testFileContents));
    }

    @Test
    public void getLinksTest4() throws IOException{
        Path testFile4 = Path.of("test-file4.md");
        String testFileContents = Files.readString(testFile4);

        assertEquals(List.of(),
            MarkdownParse.getLinks(testFileContents) );
    }

    @Test
    public void getLinksTest5() throws IOException{
        Path testFile5 = Path.of("test-file5.md");
        String testFileContents = Files.readString(testFile5);

        assertEquals(List.of(),
            MarkdownParse.getLinks(testFileContents) );
    }

    @Test
    public void getLinksTest6() throws IOException{
        Path testFile6 = Path.of("test-file6.md");
        String testFileContents = Files.readString(testFile6);

        assertEquals(List.of(),
            MarkdownParse.getLinks(testFileContents) );
    }

    @Test
    public void getLinksTest7() throws IOException{
        Path testFile7 = Path.of("test-file7.md");
        String testFileContents = Files.readString(testFile7);

        assertEquals(List.of(),
            MarkdownParse.getLinks(testFileContents) );
    }

    @Test
    public void getLinksTest8() throws IOException{
        Path testFile8 = Path.of("test-file8.md");
        String testFileContents = Files.readString(testFile8);

        assertEquals(List.of("a link on the first line"),
            MarkdownParse.getLinks(testFileContents) );
    }

    /*
    @Test
    public void getLinksTest9() throws IOException{
        Path testFile9 = Path.of("test-file9.md");
        String testFileContents = Files.readString(testFile9);

        assertEquals(List.of("google.com"),
            MarkdownParse.getLinks(testFileContents));
    }

    */
}