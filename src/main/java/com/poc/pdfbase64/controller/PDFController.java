package com.poc.pdfbase64.controller;

import com.poc.pdfbase64.service.PDFConversionService;
import com.poc.pdfbase64.service.PDFMergingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/pdf")
public class PDFController {
    @Autowired
    private PDFMergingService mergingService;

    @Autowired
    private PDFConversionService conversionService;

    @GetMapping("/merge")
    public String mergePDFs(@RequestParam List<String> inputPDFs) {
        mergingService.mergePDFs(inputPDFs, "merged.pdf");
        return "PDFs merged successfully!";
    }

    @GetMapping("/base64")
    public String convertToBase64(@RequestParam String pdfPath) {
        String base64PDF = conversionService.convertPDFToBase64(pdfPath);
        return Objects.requireNonNullElse(base64PDF, "Error converting PDF to Base64.");
    }
}

