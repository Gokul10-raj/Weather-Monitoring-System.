import java.io.Serializable;

public abstract class Sensor implements Monitorable, Serializable {

    protected String sensorName;

    public Sensor(String name) {
        this.sensorName = name;
    }
}
