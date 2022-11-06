package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneologTree {
    private Map<Human, HumanFamily> familyMap;

    private static GeneologTree INSTANCE = null;

    private GeneologTree(){
        familyMap = new HashMap<>();
    }

    public static GeneologTree getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new GeneologTree();
        }
        return INSTANCE;
    }

    public void appendHuman(Human human, HumanFamily family){
        familyMap.put(human, family);
        Human father = findHumans(family.getFather().getFullName(), family.getFather().getBirthday());
        if (father != null){
            HumanFamily hf = familyMap.get(father);
            hf.addChildren(human);
            familyMap.put(father, hf);
        }
    }

    // может быть несколько
    public Human findHumans(String nameHuman, int year){
        for (Human human:  familyMap.keySet()) {
            if ((human.getFullName().equals(nameHuman)) &&
                    ( human.getBirthday()== year)){
                return human;
            }
        }
        return null;
    }

    public boolean isExist(Human human){
        return familyMap.containsKey(human);
    }

    public HumanFamily getFamilyInfo(Human human){
        return familyMap.get(human);
    }

}
