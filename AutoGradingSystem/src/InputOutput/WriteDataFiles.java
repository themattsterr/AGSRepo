package InputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;

/**
 *
 * @author
 */
public class WriteDataFiles<T>
{
    private Formatter output;
    private FileWriter fileWriter;
    private BufferedWriter bufferWriter;
            
    public void writeData(File inFile, T dataClass)
    {
        System.out.println("Writing to file = " + inFile);
       
        try
        {
            output = new Formatter(inFile);
            output.format(dataClass.toString());
            output.flush();          
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
        finally
        {
            if(output != null)
                output.close();
        }
    }
    
    public void appendData(File inFile, T dataClass)
    {
        System.out.println("Writing to file = " + inFile);
        
        try
        {
            fileWriter = new FileWriter(inFile, true);
            bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write("\n");
            bufferWriter.write(dataClass.toString());
            bufferWriter.close();               
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }    
}
    