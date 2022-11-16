package Goods;

public class Goods {
    String name;
    String description;
    float  price;
    float  discount;

    public void print(){
        System.out.printf("\nТовар: %s\nОписание: %s\nТекущая цена: %f\n", name, description, price * discount);
    }
}
