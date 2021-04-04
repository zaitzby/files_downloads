package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsExactText;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.*;

public class PdfFilesTests {

    @Test
    public void pdfTest() throws IOException {
        String filePath = "src/resources/Document_pdf.pdf";
        String expectedText = "This is fox pdf file";

        assertThat(getPdfFromPath(filePath), containsExactText(expectedText));
    }
}
