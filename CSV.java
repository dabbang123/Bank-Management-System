package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    //This function will read .csv file and return a List
    public static List<String []> read(String file){
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        }catch (FileNotFoundException e){
            System.out.println("Could not find a File");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Could not Read file");
            e.printStackTrace();
        }

        return data;
    }
}
