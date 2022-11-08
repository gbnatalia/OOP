package Tree;

import java.util.ArrayList;


public class Print_GT_Data{
    ArrayList<PrintInterface> printType;
    MyOutStream stream;

    public Print_GT_Data(MyOutStream stream){
        printType = new ArrayList<PrintInterface>();
        this.stream = stream;
    }

    public void addInterface(PrintInterface pi){
        printType.add(pi);
    }

    public void changeStream(MyOutStream stream){
        this.stream = stream;
        for (PrintInterface type:printType) {
            type.changeStream(stream);
        }
    }
    public void print(Human human){
        stream.OutStream("");
        for (PrintInterface type:printType) {
            type.print(0, human);
        }
    }
}
