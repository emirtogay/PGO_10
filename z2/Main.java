package z2;

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

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
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
    }
}