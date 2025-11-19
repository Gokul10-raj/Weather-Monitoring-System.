public class HumiditySensor extends Sensor {

    private double humidity;

    public HumiditySensor() {
        super("Humidity Sensor");
    }

    @Override
    public void readData() throws InvalidReadingException {
        // Random humidity between 0 and 100
        humidity = Math.random() * 100;

        if (humidity < 0 || humidity > 100) {
            throw new InvalidReadingException("Humidity out of acceptable range!");
        }
    }

    public double getHumidity() {
        return humidity;
    }
}
