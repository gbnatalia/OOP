package View.ComponentsViewer.ViewActions;

public class createAddChat  implements ICreatorViewAction{

    public ICreatorViewAction create(){
        System.out.println("Кнопка AddChat создана");
        return this;
    }
}
