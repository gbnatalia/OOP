import Controller.*;
import Model.Chat.Chat;
import Model.Chat.IModelChat;
import Model.Chat.UserInfo;
import Model.Messager.ChatInfo;
import Model.Messager.IMessager;
import Model.Messager.Messager;
import Model.Storage.Storage;
import View.ComponentsViewer.ComponentViewer;
import View.ComponentsViewer.RunActions.*;
import View.ComponentsViewer.ViewActions.*;

import java.util.*;

public class MyMessager {
    final int cntBtn = 4;
    final int ADD_CHAT = 0, DEL_CHAT = 1, ADD_USER = 2, DEL_USER = 3;
    final int ADD = 0, DEL = 1;

    IMessager modelMsgr;
    IModelChat modelChat;
    List<ComponentViewer<ChatInfo>> componentViewer;
    List<IHandlerAction<ChatInfo>>  handlerActionsChat;
    List<IHandlerAction<ChatInfo>>  handlerActionsMsgr;


    public MyMessager(){
        createModel();                   // создание классов модели
        createController();              // создание классов контролллера
        createView();                    // создание классов визуализации
    }

    // создание модели
    private void createModel(){

        modelChat = new Chat(new Storage<ChatInfo>());
        modelMsgr = new Messager(new Storage<ChatInfo>());
    }

    // создание контроллера
    private void createController(){
        System.out.println("\nСоздание контроллеров:");
        createChatController();
        createUserController(modelChat);
    }

    private void createUserController(IModelChat modelChat){
        handlerActionsChat = new ArrayList<>();
        handlerActionsChat.add(new HandlerAddUser(modelChat));
        handlerActionsChat.add(new HandlerDelUser(modelChat));
    }

    private void createChatController(){
        handlerActionsMsgr = new ArrayList<>();
        handlerActionsMsgr.add(new HandlerAddChat(modelMsgr));
        handlerActionsMsgr.add(new HandlerDelChat(modelMsgr));
    }

    // создание визуализатора
    private void createView(){
        // создание кнопок (визулизация)
        System.out.println("\nВизуалиация взаимодействия с пользователем:");

        ICreatorViewAction[] createArr = new ICreatorViewAction[cntBtn];
        createArr[ADD_CHAT] = new createAddChat();
        createArr[DEL_CHAT] = new createDelChat();
        createArr[ADD_USER] = new createAddUser();
        createArr[DEL_USER] = new createDelUser();

        // создание обработчиков для кнопок
        List<IRunAction<UserInfo>> handlerArr = new ArrayList<>() ;
        handlerArr.add(new AddChat(handlerActionsMsgr.get(ADD)));
        handlerArr.add(new DelChat(handlerActionsMsgr.get(DEL)));
        handlerArr.add(new AddUser(handlerActionsChat.get(ADD)));
        handlerArr.add(new DelUser(handlerActionsChat.get(DEL)));

        // создание классов работы с кнопками
        componentViewer = new ArrayList<>();
        componentViewer.add( new ComponentViewer(createArr[ADD_CHAT], handlerArr.get(ADD_CHAT)));
        componentViewer.add( new ComponentViewer(createArr[DEL_CHAT], handlerArr.get(DEL_CHAT)));
        componentViewer.add( new ComponentViewer(createArr[ADD_USER], handlerArr.get(ADD_USER)));
        componentViewer.add( new ComponentViewer(createArr[DEL_USER], handlerArr.get(DEL_USER)));
    }

    // имитация нажатия на кнопку "AddChatClick()"
    public void createChatClick(ChatInfo chat)
    {
        System.out.println("\n==нажатие кнопки создания чата==");
        componentViewer.get(ADD_CHAT).runAction(chat);
    }


    // имитация нажатия на кнопку "DelChatClick()"
    public void deleteChatClick(ChatInfo chat)
    {
        System.out.println("\n==нажатие кнопки удаления чата==");
        componentViewer.get(DEL_CHAT).runAction(chat);
    }


    // имитация нажатия на кнопку "AddUser" пользователем User
    public void addUserClick(ChatInfo chatInfo)
    {
        System.out.println("\n==нажатие кнопки добавления пользователя в чат==");
        componentViewer.get(ADD_USER).runAction(chatInfo);
    }

    // имитация нажатия на кнопку "DelUser" пользователем User
    public void delUserClick(ChatInfo chatInfo)
    {
        System.out.println("\n==нажатие кнопки удаления пользователя из чата==");
        componentViewer.get(DEL_USER).runAction(chatInfo);
    }

}
