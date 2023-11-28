package QuestionSolve;

import java.util.ArrayList;

class Bag{
    class Item{
        String name;
        int quantity;
        Item(String name, int quantity){
            this.name = name;
            this.quantity = quantity;
        }
    }
    ArrayList<Item> Items = new ArrayList<Item>();
    public void add(String itemName){
        for(var it:Items){
            if(it.name==itemName){
                it.quantity++;
                return;
            }
        }
        Items.add(new Item(itemName,1));
    }
    public int count(String itemName){
        for(var it:Items){
            if(it.name==itemName){
                return it.quantity;
            }
        }
        return 0;
    }
}

public class problem2{
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.add("watch");
        bag.add("fan");
        bag.add("watch");
        System.out.println(bag.count("watch"));
        System.out.println(bag.count("fan"));
        System.out.println(bag.count("ladkf"));
    }
}