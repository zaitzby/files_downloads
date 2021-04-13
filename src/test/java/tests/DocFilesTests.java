package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class DocFilesTests {

    @Test
    public void docTest() throws IOException {
        String filePath = "src/test/resources/Document_doc.doc";
        String expectedText = "This is fox doc file";
        String actualText = readTextFromDocFile(getFileFromPath(filePath));

        assertThat(actualText,containsString(expectedText));
    }
}
