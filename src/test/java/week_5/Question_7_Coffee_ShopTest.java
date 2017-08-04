package week_5;

import org.junit.After;
import org.junit.Test;
import test_utils.FileUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by Clara on 8/3/17.
 */
public class Question_7_Coffee_ShopTest {
    
    
    String testPriceFilename = "temporary_file_for_testing_test_price_data.txt";
    String testSalesFilename = "temporary_file_for_testing_test_sales_data.txt";
    String testOutputFile = "temporary_file_for_testing_report.txt";
    
    @Test
    public void salesReport() throws Exception {
    
        Question_7_Coffee_Shop q7 = new Question_7_Coffee_Shop();
        
        String originalReportFilename = q7.output_report_file;
        
        //Create some example input files
        
        String priceData = "Coke;0.1;2\n" +
                "Sprite;0.2;2.50";
        
        String salesData = "Coke:4\n" +
                "Sprite:7";
    
        FileWriter writer = new FileWriter(testPriceFilename);
        writer.write(priceData);
        writer.close();
    
        writer = new FileWriter(testSalesFilename);
        writer.write(salesData);
        writer.close();
        
        
        // Replace the original filenames with these testing files
    
        q7.output_report_file = testOutputFile;
        q7.sales_data_file = testSalesFilename;
        q7.price_data_file = testPriceFilename;
    
        // Contents of expected sales report, based on the data above
        
        String expectedSalesReport = "Coke: Sold 4, Expenses $0.40, Revenue $8.00, Profit $7.60\n" +
                "Sprite: Sold 7, Expenses $1.40, Revenue $17.50, Profit $16.10\n" +
                "All Drinks: Sold 13, Expenses $1.80, Revenue $25.50, Profit $23.70";
        
        
        q7.salesReport();
        
        // Read the file and compare to expectedSalesReport
    
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(q7.output_report_file));
            
            String data = "";
            String line = reader.readLine();
            while (line != null) {
                data = data + line + "\n";
                line = reader.readLine();
            }
            
            data = data.trim();  // remove trailing white space
        
            reader.close();
            
            assertEquals("Make sure you write the data in the exact format requested, and verify your math is correct.", expectedSalesReport, data);
            
        } catch (FileNotFoundException f) {
            
            fail("Write the report to a file called " + originalReportFilename + ". Use the variable output_report_file for the file name.");
        }
        
    }
    
    
    @Test
    public void checkMethodDoesNotThrowException() throws Exception {
        //Verify readCoffeeDataFiles and writeReportFile do not throw exceptions
    
    
        // TODO verify try-with-resources is used.
    
        Class q7 = Class.forName("week_5.Question_7_Coffee_Shop");
        
        Method mRead = q7.getMethod("readCoffeeDataFiles", String.class, String.class);
        assertEquals("Add try-catch blocks to your readCoffeeDataFiles method. Handle any possible exceptions with try-catch statements within the method.", 0, mRead.getExceptionTypes().length);
    
        Method mWrite = q7.getMethod("writeReportFile", Object.class, String.class);
        assertEquals("Add try-catch blocks to your writeReportFile method. Handle any possible exceptions with try-catch statements within the method.", 0, mWrite.getExceptionTypes().length);

        
    }
    
    
    // Since the implementation of the code is mostly up to you, it's impossible for me to write any more
    // detailed tests. Maybe you could write some tests for your methods?
    
    
    @After
    public void cleanupFiles() {
        
        // Delete temporary files used for the tests.
        
        FileUtils.deleteFile(testOutputFile);
        FileUtils.deleteFile(testPriceFilename);
        FileUtils.deleteFile(testSalesFilename);
    }


    
    


}

