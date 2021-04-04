package utils;

import com.codeborne.pdftest.PDF;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Files {
    public static String readTextFromFile(File file) throws IOException {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }

    public static String readTextFromPath(String path) throws IOException {
        return readTextFromFile(getFileFromPath(path));
    }

    public static File getFileFromPath(String path) {
        return new File(path);
    }

    public static PDF getPdfFromPath(String path) throws IOException {
        return new PDF(getFileFromPath(path));
    }

    public static String readTextFromDocFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        HWPFDocument document = new HWPFDocument(fis);
        WordExtractor extractor = new WordExtractor(document);
        fis.close();
        return extractor.getText();
    }
}
