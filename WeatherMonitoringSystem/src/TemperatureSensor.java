public class TemperatureSensor extends Sensor {

    private double temperature;

    public TemperatureSensor() {
        super("Temperature Sensor");
    }

    @Override
    public void readData() throws InvalidReadingException {
        // Generate random temperature between -10 and 50
        temperature = Math.random() * 60 - 10;

        if (temperature < -10 || temperature > 50) {
            throw new InvalidReadingException("Temperature out of acceptable range!");
        }
    }

    public double getTemperature() {
        return temperature;
    }
}
