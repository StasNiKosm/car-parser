package read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTextReader {

    private String path;

    public FileTextReader(String path) {
        this.path = path;
    }

    public List<String> read(){
        if(path == null) {
            System.out.println("variable path equals null");
            return null;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            List<String> lineList = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lineList.add(line);
            }
            return lineList;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found. " + e);
        } catch (IOException e) {
            throw new RuntimeException("IO exception. " + e);
        }

    }
}
