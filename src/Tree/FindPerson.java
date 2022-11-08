package Tree;

import java.util.ArrayList;



public class FindPerson {
    GeneologTree gt;

    public FindPerson(GeneologTree gt){
        this.gt = gt;
    }

    private ArrayList<Person> privateFindUp(ArrayList<Person> arr, int maxLevel, int level, Human human){
        if (level == maxLevel) {
            arr.add((Person)human);
            return arr;
        }

        if (gt.isExist(human)) {
            HumanFamily family = gt.getFamilyInfo(human);
            if (family.getFather() != null) {
                privateFindUp(arr, maxLevel, level+1, family.getFather());
            }
            if (family.getMother() != null) {
                privateFindUp(arr, maxLevel, level+1, family.getMother());
            }
        }

        return arr;
    }
    public ArrayList<Person> FindUp(int level, Human human){
        ArrayList<Person> lst = new ArrayList<Person>();
        if (!gt.isExist(human))
            return lst;
        return privateFindUp(lst, level, 0, human);
    }

    private ArrayList<Person> privateFindDown(ArrayList<Person> arr, int maxLevel, int level, Human human){
        if (level == maxLevel) {
            arr.add((Person)human);
            return arr;
        }
        if (gt.isExist(human)) {
            HumanFamily family = gt.getFamilyInfo(human);
            ArrayList<Human> childs = family.getChildrens();
            for (Human child: childs){
                privateFindDown(arr, maxLevel, level+1, child);
            }
        }
        return arr;
    }

    public ArrayList<Person> FindDown(int level, Human human){
        ArrayList<Person> lst = new ArrayList<Person>();
        if (!gt.isExist(human))
            return lst;
        return privateFindDown(lst, level, 0, human);
    }
}
