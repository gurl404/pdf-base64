package com.poc.pdfbase64.service;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class PDFMergingService {
    public void mergePDFs(List<String> inputPDFs, String outputPDF) {
        try {
            try (PDDocument finalDocument = new PDDocument()) {

                for (String filePath : inputPDFs) {
                    PDDocument pdfDocument = PDDocument.load(new File(filePath));

                    // Iterate through pages and add them to the final document
                    for (PDPage page : pdfDocument.getPages()) {
                        finalDocument.addPage(page);
                    }

                    pdfDocument.close();
                }

                finalDocument.save(outputPDF);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
