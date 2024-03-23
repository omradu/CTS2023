package dp.prototype;

public class StoneBlock extends Block{
    String type;

    public StoneBlock() {
        type = "Stone Block";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        StoneBlock clone = (StoneBlock) super.clone();

        if(type != null) {
            clone.type = type;
        } else {
            clone.type = null;
        }

        return clone;
    }
}
