package View.ComponentsViewer.RunActions;

import Controller.IHandlerAction;
import Model.Messager.ChatInfo;

public class AddUser<ChatInfo> implements IRunAction<ChatInfo>{

    IHandlerAction handlerAction;

    public AddUser(IHandlerAction handlerAction){
        this.handlerAction = handlerAction;
    }

    public void exec(ChatInfo data)
    {
        System.out.println("Нажата кнопка добавления пользователя");
        handlerAction.exec(data);

    }
}
