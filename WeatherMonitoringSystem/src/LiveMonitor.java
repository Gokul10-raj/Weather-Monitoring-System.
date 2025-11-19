public class LiveMonitor extends Thread {

    private TemperatureSensor tempSensor = new TemperatureSensor();
    private HumiditySensor humiditySensor = new HumiditySensor();
    public boolean running = true; // NEW – allows stopping

    @Override
    public void run() {
        while (running) {
            try {
                tempSensor.readData();
                humiditySensor.readData();

                String record = "Temperature: " 
                    + tempSensor.getTemperature() + " C | Humidity: " 
                    + humiditySensor.getHumidity() + " %";

                WeatherLog.logs.add(record);
                System.out.println(record);

                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Monitoring stopped.");
    }
}
