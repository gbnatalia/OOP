package View.ComponentsViewer;

/*      ======= IViewMessager =======
        Требуются классы реализации на основе интерфейса IViewMessager логики формирования
        для пользователя графической возможности выполнения какого-либо действия.
        Например: cоздания, удаления чата;
                  добавления, удаления пользователя в чат,
                  отправки сообщения, отображения сообщения,
                  связи события действия с обработчиком

        ======= IRunAction =======
        Требуются классы реализации на основе интерфейса IRunAction
        логики выполнения какого-либо действия.
 */

import View.ComponentsViewer.ViewActions.ICreatorViewAction;
import View.ComponentsViewer.RunActions.IRunAction;

public class ComponentViewer<T> {
    IRunAction<T> action;

    public ComponentViewer(ICreatorViewAction creatorAction, IRunAction<T> action){
        // прорисовка визуализатора действия
        creatorAction.create();
        // --- регистрация для созданного объекта обработчика action ---
        this.action = action; // в нашем случае просто сохранения объекта действия
    }

    public void runAction(T data){
        action.exec(data);
    }
}
