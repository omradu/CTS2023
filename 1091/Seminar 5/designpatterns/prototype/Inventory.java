package designpatterns.prototype;

import java.util.HashMap;

public class Inventory {
    private HashMap<Block, Integer> inventory = new HashMap<>();

    public Inventory() {
        inventory.put(new DirtBlock(), 7);
        inventory.put(new StoneBlock(), 10);
    }

    public int getNumberOfBlocks(Block block) {
        try {
            return inventory.get(block);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

}
