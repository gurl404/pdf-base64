package com.poc.pdfbase64.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

@Service
public class PDFConversionService {
    public String convertPDFToBase64(String pdfPath) {
        try {
            byte[] pdfBytes = Files.readAllBytes(Paths.get(pdfPath));
            return Base64.getEncoder().encodeToString(pdfBytes);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}