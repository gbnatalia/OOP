package View.ComponentsViewer.RunActions;

import Controller.IHandlerAction;

public class AddChat<ChatInfo> implements IRunAction<ChatInfo>{

    IHandlerAction handlerAction;

    public AddChat(IHandlerAction handlerAction){
        this.handlerAction = handlerAction;
    }

    public void exec(ChatInfo data)
    {
        System.out.println("Нажата кнопка создания чата");
        handlerAction.exec(data);

    }
}