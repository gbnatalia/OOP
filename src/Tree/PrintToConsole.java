package Tree;


import java.io.OutputStream;

interface MyOutStream{
    void OutStream(String data);
}

public class PrintToConsole implements MyOutStream{
    public void OutStream(String data){
       System.out.println(data);
    }
}
