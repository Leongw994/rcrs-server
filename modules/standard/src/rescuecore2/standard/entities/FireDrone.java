package rescuecore2.standard.entities;

import rescuecore2.worldmodel.Entity;
import rescuecore2.worldmodel.EntityID;
import rescuecore2.worldmodel.properties.IntProperty;

public class FireDrone extends Robot {

    private IntProperty height;

    /**
     * Construct a Drone object with entirely undefined values.
     *
     * @param id The ID of this entity.
     */
    public FireDrone(EntityID id) {
        super(id);
//        height = new IntProperty(StandardPropertyURN.HEIGHT);
//        registerProperties(height);
    }

    /**
     * Drone copy constructor.
     *
     * @param other The Drone to copy.
     */
    public FireDrone(Drone other) {
        super(other);
//        height = new IntProperty(other.height);
    }

    @Override
    protected Entity copyImpl() {
        return new FireDrone(getID());
    }

    @Override
    public StandardEntityURN getStandardURN() {
        return StandardEntityURN.FIRE_DRONE;
    }



    @Override
    protected String getEntityName() {
        return "FireDrone";
    }
}
