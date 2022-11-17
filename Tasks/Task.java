package Tasks;

// некоторая абстрактная задача
public class Task extends Thread{

    TaskDesc.TaskInfo rec;

    public Task(TaskDesc.TaskInfo rec){
       super(rec.getDescription());
        this.rec = rec;
    }

    public void run(){

        System.out.printf("Выполнение задачи \"%s\"\n", rec.getDescription());

        try{
            System.out.printf("Старт задачи \"%s\"\n", rec.getDescription());

            int maxTime = (int) (Math.random() * 21);
            while (maxTime > 0){
                System.out.print("*");
                sleep(500);
                maxTime--;
            }
            System.out.println("");
        }
        catch(InterruptedException e){
            System.out.printf("Прерывание задачи \"%s\"\n" + rec.getDescription());
        }
        finally {
            System.out.printf("Задача \"%s\" завершена\n", rec.getDescription());
        }
    }
}
