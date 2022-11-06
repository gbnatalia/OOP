import Tree.*;

import java.util.ArrayList;


public class Main {

    static GeneologTree tree = null;

    private static void create_node(Person newPerson, Person father, Person mother){
        PersonFamily pf = new PersonFamily(father, mother);
        tree.appendHuman(newPerson, pf);
    }

    public static void main(String[] args) {
        // получение объекта класса генеологического дерева
        tree = GeneologTree.getInstance();

        // создание объекта класса вывода информации по узлу дерева родословной
        // определение состава выводимой информации
        Print_GT_Data pgt = new Print_GT_Data();
        pgt.addInterface(new PrintPersonInfo());
        pgt.addInterface(new PrintParentsTree(tree));
        pgt.addInterface(new PrintChildTree(tree));
        pgt.addInterface(new PrintBrotherAndSister(tree));

                // добавление в дерево отца
        Person father = new Person("папа", 1111);
        create_node( father,  new Person("дед от отца", 0001), new Person("бабушка от отца", 0002));

        // добавление в дерево матери
        Person mother = new Person("мама", 1111);
        create_node( mother,  new Person("дед от матери", 0001), new Person("бабушка от матери", 0002));

        // добавление в дерево субъекта
        Person newPerson = new Person("субъект", 5555);
        create_node(newPerson, father, mother);

        // добавление детей субъекта
        Person son1 = new Person("Сын1", 7777);
        create_node(son1,  newPerson, null);

        Person son2 = new Person("Сын2", 7778);
        create_node(son2,  newPerson, null);

        // добавление в дерево брата субъекта
        Person newPerson2 = new Person("брат", 5556);
        create_node(newPerson2, father, mother);

        // добавление в дерево сестры субъекта
        Person newPerson3 = new Person("сестра", 5556);
        create_node(newPerson3, father, mother);

        Person needPerson = (Person)tree.findHumans("субъект", 5555);
        if (needPerson != null)
            pgt.print(needPerson);
        else
            System.out.printf("В дереве нет информации о персоне \"%s\" %d года рождения", "субъект", 5555);

        Person needPerson2 = (Person)tree.findHumans("папа", 1111);
        if (needPerson2 != null)
            pgt.print(needPerson2);
        else
            System.out.printf("В дереве нет информации о персоне \"%s\" %d года рождения", "папа", 1111);

    }
}