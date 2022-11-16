package Goods;

// класс - построитель описаний товаров
public class CreateGoods {

    private static CreateGoods instance = null;
    Goods item;

    public static CreateGoods getInstance(){
        if (instance == null){
            instance = new CreateGoods();
        }
        instance.init();
        return instance;
    }

    private void init(){
        item =  new Goods();
        item.name        = "Неизвестный товар";
        item.description = "Описания нет";
        item.price      = 100.0f;
        item.discount   = 1.0f;
    }

    public Goods Create(){
        return item;
    }

    public CreateGoods setName(String name){
        item.name = name;
        return this;
    }

    public CreateGoods setDescription(String description){
        item.description = description;
        return this;
    }

    public CreateGoods setPrice(float price){
        item.price = price;
        return this;
    }

    public CreateGoods setDiscount(float discount){
        item.discount = discount;
        return this;
    }
}
