package Tree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintToTxtFile implements MyOutStream {

    String fileName;

    public PrintToTxtFile(String fileName){
        this.fileName = fileName;
        File file = new File(fileName);
        if (file.exists() && !file.isDirectory())
            file.delete();
    }

    public void OutStream(String data){
        try(FileWriter writer = new FileWriter(fileName, true))
        {
            writer.write(data);
            writer.write("\n");
            writer.flush();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
