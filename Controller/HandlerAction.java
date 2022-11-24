package Controller;

import View.ComponentsViewer.RunActions.IRunAction;

public class HandlerAction<T> {
    IHandlerAction<T> handlerAction;

    public HandlerAction(IHandlerAction<T> handlerAction){
        this.handlerAction = handlerAction;
    }

    public void exec(T data){
        handlerAction.exec(data);
    }
}
