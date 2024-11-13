package com.example.backend;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class DocumentComparisonController {

    // Basic GET method that returns a welcome message
    @GetMapping("/")
    public String getWelcomeMessage() {
        return "<html><body><h1>Welcome to the Document Comparison API</h1>" +
                "<p>Use the POST method to upload documents for comparison at /compare-documents.</p></body></html>";
    }

    // POST method for comparing two uploaded documents
    @PostMapping("/compare-documents")
    public ResponseEntity<?> compareDocuments(@RequestParam("sample_file") MultipartFile sampleFile,
                                              @RequestParam("uploaded_file") MultipartFile uploadedFile) {
        try {
            // Read the content of the uploaded files (for mock processing here)
            String sampleContent = new String(sampleFile.getBytes());
            String uploadedContent = new String(uploadedFile.getBytes());

            // Simulating document comparison (mock function for now)
            DocumentComparisonResult result = compareDocuments(sampleContent, uploadedContent);

            // Return the result of comparison
            return ResponseEntity.ok(result);
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Error reading files: " + e.getMessage());
        }
    }

    // Mock method for comparing documents (to be replaced with actual logic)
    private DocumentComparisonResult compareDocuments(String sampleContent, String uploadedContent) {
        // Example logic: Comparing the content line by line (just a simulation here)
        List<String> addedLines = new ArrayList<>();
        List<String> removedLines = new ArrayList<>();
        List<String> changedLines = new ArrayList<>();

        // Simple mock logic (in reality, you would parse and compare the files)
        addedLines.add("Line 1 added");
        removedLines.add("Line 3 removed");
        changedLines.add("Line 5 changed");

        return new DocumentComparisonResult(addedLines, removedLines, changedLines);
    }
}

class DocumentComparisonResult {
    private List<String> addedLines;
    private List<String> removedLines;
    private List<String> changedLines;

    // Constructor, getters, and setters
    public DocumentComparisonResult(List<String> addedLines, List<String> removedLines, List<String> changedLines) {
        this.addedLines = addedLines;
        this.removedLines = removedLines;
        this.changedLines = changedLines;
    }

    public List<String> getAddedLines() {
        return addedLines;
    }

    public void setAddedLines(List<String> addedLines) {
        this.addedLines = addedLines;
    }

    public List<String> getRemovedLines() {
        return removedLines;
    }

    public void setRemovedLines(List<String> removedLines) {
        this.removedLines = removedLines;
    }

    public List<String> getChangedLines() {
        return changedLines;
    }

    public void setChangedLines(List<String> changedLines) {
        this.changedLines = changedLines;
    }
}

