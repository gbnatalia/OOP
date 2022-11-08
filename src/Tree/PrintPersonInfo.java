package Tree;

import java.util.ArrayList;

interface PrintInterface {

    void changeStream(MyOutStream stream);

    void print(int tab_level,  Human human);
}

public class PrintPersonInfo implements PrintInterface{

    MyOutStream stream;
    public PrintPersonInfo(MyOutStream stream){
        this.stream = stream;
    }

    public void changeStream(MyOutStream stream){
        this.stream = stream;
    }

    public void print(int tab_level,  Human human){
        String tab_str = "";
        while (tab_level > 0) {
            tab_str += "\t";
            tab_level--;
        }

        stream.OutStream(String.format("%s%s, %d года рождения", tab_str, human.getFullName(), human.getBirthday()));
    }
}



