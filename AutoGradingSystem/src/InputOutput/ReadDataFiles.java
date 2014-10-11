package InputOutput;

import AGSMain.*;
import GraderSpec.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class ReadDataFiles<T> 
{    
    private Scanner input;
    private ArrayList<T> data = new ArrayList<T>();

    /**
     * 
     * @param inFile
     * @param dataClass
     * @return cast as list of type processed
     */
    public ArrayList<T> processFile(File inFile, T dataClass)
    {
        System.out.println("Processing file = " + inFile);
             
        try
        {
            input = new Scanner(inFile);
            input.useDelimiter(",");
            
            while(input.hasNext())
            {

                if ( dataClass.getClass().equals(Assignment.class) )
                {
                    Assignment assignment = new Assignment();
                    assignment.SetTitle(input.next());

                    data.add((T)assignment);
                }
                else if ( dataClass.getClass().equals(Rubric.class) )
                {
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
        finally
        {
            input.close();
        }
        
        return data;
    }    
}
