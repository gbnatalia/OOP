package Tree;

import java.util.ArrayList;

public class PrintParentsTree extends FindPerson implements PrintInterface{

    MyOutStream stream;
    public PrintParentsTree(GeneologTree gt, MyOutStream stream){
        super(gt);
        this.stream = stream;
    }

    public void changeStream(MyOutStream stream){
        this.stream = stream;
    }

    private boolean printParents(int level, int tab_level, Human human){

        boolean result = false;
        PrintPersonInfo pi = new PrintPersonInfo(stream);

        ArrayList<Person> resFind = FindUp(1, human);
        if (resFind.size() == 0)
            return result;

        for (Human el: resFind) {
            result = true;
            pi.print(tab_level, el);
            printParents(level+1, tab_level+1, el);
        }
        return result;
    }

    public void print(int tab_level,  Human human){
        stream.OutStream("Предки:");
        if (printParents(1,tab_level + 1, human) == false)
            stream.OutStream("\tнет");
    }
}