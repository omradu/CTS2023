public class Pet {
    public static final int MIN_ENERGY = 100;
    String name;
    int energyLevel = 100;

    IMovingState movingState = new EnergizedMovingState();

    public Pet(String name) {
        this.name = name;
    }

    public void move() {
        this.movingState.move();
    }

    public void play(int points) {
        this.energyLevel -= points;
        if(this.energyLevel<MIN_ENERGY) {
            this.movingState = new TiredMovingState();
        }
    }

    public void sleep(int points) {
        this.energyLevel+=points;
        if(this.energyLevel>=MIN_ENERGY) {
            this.movingState = new EnergizedMovingState();
        }
    }
}
