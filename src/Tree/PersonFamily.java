package Tree;

import java.util.ArrayList;


interface HumanFamily{
    Human getFather();
    Human getMother();
    void setFather(Human father);
    void setMother(Human mother);
    void addChildren(Human children);

    ArrayList<Human> getChildrens();
}

public class PersonFamily implements HumanFamily{
    Human father;
    Human mother;
    ArrayList<Human> childrens;

    public PersonFamily(Human father, Human mother){
        this.father = father;
        this.mother = mother;
        this.childrens = new ArrayList<Human>();
    }

    public Human getFather(){return father;}
    public Human getMother(){return mother;}

    public ArrayList<Human> getChildrens(){return this.childrens;}

    public void setFather(Human father){ this.father = father;}
    public void setMother(Human mother){this.mother = mother;}


    public void addChildren(Human children){this.childrens.add(children);}

}

