package Tree;

import java.util.ArrayList;

public class PrintChildTree implements PrintInterface{
    GeneologTree gt;

    public PrintChildTree(GeneologTree gt){
        this.gt = gt;
    }
    private boolean printChildrens(int level, Human human){
        boolean result = false;
        if (gt.isExist(human)) {
            HumanFamily family = gt.getFamilyInfo(human);
            ArrayList<Human> childs = family.getChildrens();
            PrintPersonInfo pi = new PrintPersonInfo();
            if (childs != null) {
                result = true;
                for (Human child : childs) {
                    pi.print(level, child);
                    Human node_child = gt.findHumans(child.getFullName(), child.getBirthday());
                    if (node_child != null)
                        printChildrens(level + 1, node_child);
                }
            }
        }
        return result;
    }
    public void print(int level,  Human human){
        System.out.println("Потомки:");
        if (printChildrens(level + 1, human) == false)
            System.out.println("\tнет");
    }
}