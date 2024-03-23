package dp.prototype;

import java.util.HashMap;

public class RederBlock {
    private HashMap<String, Block> blocks = new HashMap<>();

    public RederBlock() {
        inventory.put("Dirt", new DirtBlock());
        inventory.put("Stone", new StoneBlock());
    }

    public Block getBlock(String type) {
        try {
            return (Block) blocks.get(type).clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
