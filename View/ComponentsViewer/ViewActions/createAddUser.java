package View.ComponentsViewer.ViewActions;

public class createAddUser implements ICreatorViewAction {

    public ICreatorViewAction create(){
        System.out.println("Кнопка AddUser создана");
        return this;
    }
}
