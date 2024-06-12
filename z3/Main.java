package z3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Item item1 = new Item(12, "calc1");
        Item item2 = new Item(214, "calc2");
        Item item3 = new Item(525, "calc3");
        Item item4 = new Item(432, "ALG1");
        Item item5 = new Item(16, "ALG2");
        Item item6 = new Item(16, "ALG3");
        Item item7 = new Item(16, "ING1");
        Item item8 = new Item(16, "ING2");
        Item item9 = new Item(16, "ING3");
        Item item10 = new Item(16, "PHY1");
        Item item11 = new Item(16, "PHY2");
        Item item12 = new Item(16, "PHY3");
        Item item13 = new Item(16, "CHM1");
        Item item14 = new Item(16, "CHM2");
        Item item15 = new Item(16, "CHM3");
        Item item16 = new Item(16, "CHM4");


        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);
        items.add(item11);
        items.add(item12);
        items.add(item13);
        items.add(item14);
        items.add(item15);
        items.add(item16);
        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        Map<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        
        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        List<Item> firstFiveItems = items.subList(0, 5);
        Set<Item> itemSet = new HashSet<>(firstFiveItems);

        System.out.println("HashSet of first five items:");
        for (Item item : itemSet) {
            item.show();
    }
}