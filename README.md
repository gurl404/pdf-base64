PDF to Base64 Conversion POC

Overview

This project is a Proof of Concept (POC) that demonstrates the capabilities of converting PDF files to Base64 format and merging multiple PDF files into a single PDF document. It's built using Spring Boot and leverages libraries like OpenPDF and PDFBox to handle PDF operations.

Functionality

PDF to Base64 Conversion
The project provides an endpoint that allows you to convert a PDF file to Base64 format. The steps to convert a PDF to Base64 are as follows:

Send a GET request to the /pdf/base64 endpoint.
Include the pdfPath query parameter with the path to the PDF file you want to convert.
The service will convert the PDF file to Base64 and return the Base64-encoded content as the response.
PDF Merging
The project offers an endpoint for merging multiple PDF files into a single PDF document. Here's how the PDF merging works:

Send a GET request to the /pdf/merge endpoint.
Include the inputPDFs query parameter, providing a list of PDF file paths to be merged.
The service will merge the specified PDFs into a single PDF document, saving it as "merged.pdf" in the application's directory.
The response will confirm the successful merging of the PDFs.
Limitations

It's important to note that this project is a POC and has some limitations:

Basic Error Handling: The error handling in the POC is minimal. It does not handle various edge cases, such as invalid input files or PDFs with complex structures.
File Size: The project might not be suitable for handling very large PDF files due to potential memory limitations.
Output Path: The merged PDF is saved in the application's directory with the filename "merged.pdf." This may not be suitable for a production environment where you'd want to control the output location and file names.
Getting Started

To run this POC locally, you should have Java, Maven, and Spring Boot installed. Clone the repository and build the project using Maven. After that, you can start the Spring Boot application, and the endpoints will be available for testing with Postman or other HTTP clients.