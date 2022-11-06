package Tree;

public class PrintParentsTree implements PrintInterface{
    GeneologTree gt;

    public PrintParentsTree(GeneologTree gt){
        this.gt = gt;
    }

    private boolean printParents(int level, Human human){
        boolean result = false;
        if (gt.isExist(human)) {
            HumanFamily family = gt.getFamilyInfo(human);
            PrintPersonInfo pi = new PrintPersonInfo();
            if (family.getFather() != null) {
                result = true;
                pi.print(level, family.getFather());
                printParents(level+1, family.getFather());
            }
            if (family.getMother() != null) {
                result = true;
                pi.print(level, family.getMother());
                printParents(level+1, family.getMother());
            }
        }
        return result;
    }
    public void print(int level,  Human human){
        System.out.println("Предки:");
        if (printParents(level + 1, human) == false)
            System.out.println("\tнет");
    }
}