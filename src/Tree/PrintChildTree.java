package Tree;

import java.util.ArrayList;

public class PrintChildTree extends FindPerson implements PrintInterface{

    MyOutStream stream;

    public PrintChildTree(GeneologTree gt, MyOutStream stream){
        super(gt);
        this.stream = stream;
    }

    public void changeStream(MyOutStream stream){
        this.stream = stream;
    }
    private boolean printChildrens(int level, int tabLevel, Human human){
        boolean result = false;

        PrintPersonInfo pi = new PrintPersonInfo(stream);

        ArrayList<Person> resFind = FindDown(1, human);
        if (resFind.size() == 0)
            return result;

        for (Human el: resFind) {
            result = true;
            pi.print(tabLevel, el);
            printChildrens(level+1, tabLevel+1, el);
        }

        return result;
    }
    public void print(int tab_level,  Human human){
        stream.OutStream("Потомки:");
        if (printChildrens(1,tab_level + 1, human) == false)
            stream.OutStream("\tнет");
    }
}