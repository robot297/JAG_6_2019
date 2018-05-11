package week_5;

import org.junit.Test;
import test_utils.FileUtils;

import java.io.*;
import java.lang.reflect.Method;

import static org.junit.Assert.*;


public class Question_2_Write_Recycling_ReportTest {
    
    
    @Test(timeout=3000)
    public void testWriteReport() {
        
        // Verify that the correct report is written
        
        // Example data
        
        int[] crates = { 1, 4, 2, 1 };  // Code should work with any length array
        int total = 0;
        for (int x : crates) {
            total += x;
        }
        
        Question_2_Write_Recycling_Report writeReport = new Question_2_Write_Recycling_Report();
        
        String filename = FileUtils.uniqueFilename("recycling_report"); // Random filename to avoid clashing with student's file
        
        writeReport.writeReport(crates, total, filename);
        
        // Read the file, verify correct contents
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            
            // Read the file into one String.
            
            StringBuilder lines = new StringBuilder();
            
            String line;
            while ((line = reader.readLine()) != null) {
                lines.append(line);
            }
            
            String fileContents = lines.toString();
            
            reader.close();
            FileUtils.moveToTemporaryTestFolder(filename);
            
            // Expected file contents
            
            String expectedContents = "House 0 recycled 1 crateHouse 1 recycled 4 cratesHouse 2 recycled 2 cratesHouse 3 recycled 1 crate";
            String expectedSummary = "Total crates recycled: 8";
            
            String msg = "Make sure you write the correct data to the file. " +
                    "\nOne line per house, in the format 'House 3 recycled 2 crates'. " +
                    "\nIf there's one crate, it should say '1 crate'. Else, use 'crates'" +
                    "\nThe test is looking for the specific strings given in the assignment description.";
            
            assertTrue(msg, fileContents.contains(expectedContents));
            
            assertTrue("Make sure you have the last line with the total crates, for example\n" +
                    expectedSummary, fileContents.contains(expectedSummary));
            
            
        }
        
        catch (IOException e) {
            e.printStackTrace();
            fail("Exception thrown. Write data to a file with the name given by the filename variable.");
        }
        
        finally  {
            // File not found?
            FileUtils.moveToTemporaryTestFolder(filename);
        }
        
        
        
    }
    
    
    
    @Test(timeout=3000)
    public void testUsesTryCatchBlocks() throws Exception {
        
        // Verify that the writeReport method does not throw any exceptions,
        // implying that exceptions are handled within the method.
        
        Class Q2 = Class.forName("week_5.Question_2_Write_Recycling_Report");
        Method mWrite = Q2.getMethod("writeReport", int[].class, int.class, String.class);
        assertEquals("Add try-catch blocks to your writeReport method. Handle any possible exceptions within the method.", 0, mWrite.getExceptionTypes().length);
        
    }
    
}