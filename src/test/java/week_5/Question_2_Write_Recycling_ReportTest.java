package week_5;

import org.junit.Test;
import test_utils.FileUtils;

import java.io.*;
import java.lang.reflect.Method;
import java.util.UUID;

import static org.junit.Assert.*;



public class Question_2_Write_Recycling_ReportTest {


    @Test
    public void testWriteReport() throws Exception {
    
        // Verify that the correct report is written
        
        // Example data
        
        int[] crates = { 1, 4, 2, 1 };  // Code should work with any length array
        int total = 0;
        for (int x : crates) {
            total += x;
        }
        
        Question_2_Write_Recycling_Report writeReport = new Question_2_Write_Recycling_Report();
        
        String filename =  "recycling_report_" + UUID.randomUUID().toString() + ".txt";  // Random filename to avoid clashing with student's file
        
        writeReport.writeReport(crates, total, filename);
    
        // How large is the file?
        File file = new File(filename);
        if (file.length() > 5000) {   // An arbitrary number... This file should not be more than 10KB, and for this test data, would be expected to be less than 1KB
            FileUtils.deleteFile(filename);
            fail("The output file is too large. Make sure you only write the recycling data, one line per house.");
        }
        
        if (file.length() == 0)  {
            // No data in file, or file doesn't exist
            FileUtils.deleteFile(filename);
            fail("File not found, or no data in the file. Write the data to a file called " + writeReport.filename);
        }
        
        
        // Read the file, verify correct contents
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            
            // Read the file into one String.
            
           StringBuffer lines = new StringBuffer();
           // ArrayList<String> lines = new ArrayList<>();
            
            String line;
            while ((line = reader.readLine()) != null) {
                lines.append(line);
                //lines.add(line);
            }
            
           String fileContents = lines.toString();
            
            // Expected file contents
            
            String[] expectedContents = "House 0 recycled 1 crate\nHouse 1 recycled 4 crates\nHouse 2 recycled 2 crates\nHouse 3 recycled 1 crate\nTotal crates recycled: 8".split("\n");
            
            // Should find all of the strings in expectedContents, TODO in the right order.
            
            int expectedCounter = 0;
            
            for (String l : expectedContents) {
                if (fileContents.contains(l)) {
                    expectedCounter++;
                }
            }
            
            assertEquals("Make sure you write the correct data to the file. " +
                    "One line per house, in the format 'House 3 recycled 2 crates'. " +
                    "If there's one crate, it should say '1 crate'. Else, use 'crates' ",
                    expectedCounter, expectedContents.length);
            
            
        } catch (IOException ioe) {
            // File not found?
            FileUtils.deleteFile(filename);
            fail("Write data to a file called " + writeReport.filename);
        }
    
    
        FileUtils.deleteFile(filename);
        
    }
    
    
    
    @Test
    public void testUsesTryCatchBlocks() throws Exception {
        
        // Verify that the writeReport method does not throw any exceptions,
        // implying that exceptions are handled within the method.
        
        Class Q2 = Class.forName("week_5.Question_2_Write_Recycling_Report");
        Method mWrite = Q2.getMethod("writeReport", int[].class, int.class, String.class);
        assertEquals("Add try-catch blocks to your writeReport method. Handle any possible exceptions within the method.", 0, mWrite.getExceptionTypes().length);
        
    }
    
}