package View.ComponentsViewer.RunActions;

import Controller.IHandlerAction;

public class DelUser<UserInfo> implements IRunAction<UserInfo>{

    IHandlerAction handlerAction;

    public DelUser(IHandlerAction handlerAction){
        this.handlerAction = handlerAction;
    }

    public void exec(UserInfo data){
        System.out.println("Нажата кнопка удаления пользователя");
        handlerAction.exec(data);
    }
}