package dp.prototype;

public class DirtBlock extends Block{
    String type;

    public DirtBlock() {
        type = "Dirt Block";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DirtBlock clone = (DirtBlock) super.clone();
        if(type!= null) {
            clone.type = type;
        } else {
            clone.type = null;
        }

        return clone;
    }
}
