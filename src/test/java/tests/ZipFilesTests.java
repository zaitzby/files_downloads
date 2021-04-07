package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.unZip;

public class ZipFilesTests {

    @Test
    public void zipTest() throws IOException, ZipException {
        String filePath = "src/resources/Document_zip.zip";
        String unzipPath = "src/resources/unzip";
        String password = "fox";
        String fileUnzipPath = "src/resources/unzip/Document_txt.txt";
        String expectedText = "This is fox txt unzip file";
        String actualText = readTextFromPath(fileUnzipPath);

        unZip(filePath, unzipPath, password);
        assertThat(actualText, containsString(expectedText));
    }
}
