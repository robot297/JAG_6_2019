package week_5;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

/**
 * Created by clara on 8/3/17.
 */
public class Question_8_Write_Operating_System_Info_To_File_In_Data_DirectoryTest {
    @Test
    public void writeOSName() throws Exception {
        
        Question_8_Write_Operating_System_Info_To_File_In_Data_Directory q8 = new Question_8_Write_Operating_System_Info_To_File_In_Data_Directory()  ;
        
        q8.writeOSName();
        
        // Read file, verify contains correct name
    
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(new File("data", "os.txt")));
            String line = reader.readLine();
            reader.close();
            
            assertTrue("Write the operating system name to the file os.txt",
                    line.contains(System.getProperty("os.name")));
        
        } catch (FileNotFoundException f) {
            fail("os.txt file not found. Make sure your code creates a file called " +
                    "\nos.txt in the data directory of this project. " +
                    "\nCreate a data directory if it does not exist. ");
        }
        
    }
    
}