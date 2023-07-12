import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
/**
 This program reads a file with double values, then sort the aray, and finally
 calculate some statistics.
 */
public class dataProcessing
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Read Integer values from a file the data array data[]
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();

        console.close(); // close the console
        ArrayList<Double> data = new ArrayList<Double>();
        // Construct the Scanner and PrintWriter objects for reading and writing
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        // Read the input and write the output
        double total = 0;


        // have the program read strings instead of only doubles
        // that way the file won't
        while (in.hasNext())
        {
            if(in.hasNextDouble())
            {
                data.add(in.nextDouble());
            }
            else
            {
                in.next();
            }
        }
        in.close();
        // Sort the data array
        double temp;
        int size = data.size();
        if(!data.isEmpty())
        {
            Collections.sort(data); // use Collections.sort() to sort with ease

        }


        // calculate statistics
        int length = data.size();
        double med, var, sd, mean, sum, varsum;
        sum = 0.0;
        for (double num : data)
        {
            sum += num;
        }
        med   = data.get(length / 2 );
        mean = sum / length;
        varsum = 0.0;
        for (int i = 0; i < length; i++)
        {
            varsum = varsum  + ((data.get(i) - mean) * (data.get(i) - mean));
        }
        var = varsum / ( length - 1 );
        sd  = Math.sqrt ( var );
        System.out.println ("length:                   " + length);
        System.out.println ("mean:                    " + mean);
        System.out.println ("median:                 " + med);
        System.out.println ("variance:                " + var);
        System.out.println ("standard deviation: " + sd);
    }
}