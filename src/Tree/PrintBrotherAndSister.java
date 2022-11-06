package Tree;

import java.util.ArrayList;

public class PrintBrotherAndSister implements PrintInterface {
    GeneologTree gt;

    public PrintBrotherAndSister(GeneologTree gt){
        this.gt = gt;
    }

    private boolean printBaS(Human human){
        boolean result = false;

        if (gt.isExist(human)) {
            HumanFamily family = gt.getFamilyInfo(human);

            ArrayList<Human> bs = new ArrayList<>();

            if (family.getFather() != null &&
                    gt.findHumans(family.getFather().getFullName(), family.getFather().getBirthday()) != null) {
                HumanFamily parentFamily = gt.getFamilyInfo(family.getFather());
                ArrayList<Human> ch = parentFamily.getChildrens();
                for (Human h : ch) {
                    if (!bs.contains(h) && !h.equals(human)) {
                        bs.add(h);
                    }
                }
            }

            if (family.getMother() != null &&
                    gt.findHumans(family.getMother().getFullName(), family.getMother().getBirthday()) != null) {
                HumanFamily parentFamily = gt.getFamilyInfo(family.getMother());
                ArrayList<Human> ch = parentFamily.getChildrens();
                for (Human h : ch) {
                    if (!bs.contains(h) && !h.equals(human)) {
                        bs.add(h);
                    }
                }
            }

            for (Human h : bs) {
                result = true;
                PrintPersonInfo pi = new PrintPersonInfo();
                pi.print(1, h);
            }
        }

       return result;
    }

    public void print(int level,  Human human){
        System.out.println("Братья и Сестры:");
        if (printBaS( human) == false)
            System.out.println("\tнет");
    }
}
