package Tree;

import java.util.ArrayList;

interface PrintInterface {

    void print(int level,  Human human);
}

public class PrintPersonInfo implements PrintInterface{
    public PrintPersonInfo(){}

    public void print(int level,  Human human){
        while (level > 0) {
            System.out.print("\t");
            level--;
        }
        System.out.printf("%s, %d года рождения\n", human.getFullName(), human.getBirthday());
    }
}



