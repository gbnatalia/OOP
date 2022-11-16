import Goods.*;

public class Main {
    public static void main(String[] args)
    {

        Goods t = CreateGoods.getInstance()
                .setName("елка")
                .setDescription("елка новогодняя зеленая")
                .setPrice(100.0f)
                .Create();
        t.print();


        Goods t2 = CreateGoods.getInstance()
                .setName("снегурочка")
                .setDescription("игрушка на елку")
                .setPrice(30.0f)
                .setDiscount(0.9f)
                .Create();
        t2.print();


        Goods t3 = CreateGoods.getInstance()
                .setName("дед мороз")
                .Create();
        t3.print();


    }
}