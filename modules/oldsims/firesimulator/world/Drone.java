package firesimulator.world;

public class Drone extends MovingObject {

    public Drone(int id) {
        super(id);
    }

    public String getType() {
        return "DRONE";
    }
}
