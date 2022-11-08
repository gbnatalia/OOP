package Tree;

import java.util.ArrayList;

public class PrintBrotherAndSister extends FindPerson implements PrintInterface {
    MyOutStream stream;
    public PrintBrotherAndSister(GeneologTree gt, MyOutStream stream)
    {
        super(gt);
        this.stream = stream;
    }

    public void changeStream(MyOutStream stream){
        this.stream = stream;
    }
    private boolean printBaS(Human human){
        boolean result = false;
        PrintPersonInfo pi = new PrintPersonInfo(stream);

        ArrayList<Person> resFind = FindUp(1, human);  // поиск родителей
        if (resFind.size() == 0)
            return result;

        for (Person el: resFind) {
            ArrayList<Person> resFind2 = FindDown(1, el);  // поиск детей родителей
            if (resFind2.size() != 0) {
                result = true;
                for (Person el2: resFind2) {
                    pi.print(1, (Human) el2);
                }
            }
        }
        return result;
    }

    public void print(int tab_level,  Human human){
        stream.OutStream("Братья и Сестры:");
        if (printBaS(human) == false)
            stream.OutStream("\tнет");

    }
}
