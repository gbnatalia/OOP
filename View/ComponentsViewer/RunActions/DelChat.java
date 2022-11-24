package View.ComponentsViewer.RunActions;

import Controller.IHandlerAction;

public class DelChat<ChatInfo> implements IRunAction<ChatInfo>{

    IHandlerAction handlerAction;

    public DelChat(IHandlerAction handlerAction){
        this.handlerAction = handlerAction;
    }

    public void exec(ChatInfo data){
        System.out.println("Нажата кнопка удаления чата");
        handlerAction.exec(data);
    }
}
