package Tree;

import java.util.ArrayList;

public class Print_GT_Data{
    ArrayList<PrintInterface> printType;

    public Print_GT_Data(){
        printType = new ArrayList<PrintInterface>();
    }

    public void addInterface(PrintInterface pi){
        printType.add(pi);
    }

    public void print(Human human){
        System.out.println("");
        for (PrintInterface type:printType) {
            type.print(0, human);
        }
    }
}
