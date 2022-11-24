package View.ComponentsViewer.ViewActions;

public class createDelUser implements ICreatorViewAction {
    public ICreatorViewAction create(){
        System.out.println("Кнопка DelUser создана");
        return this;
    }
}
