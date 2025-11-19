import java.io.*;
import java.util.ArrayList;

public class WeatherLog {

    public static ArrayList<String> logs = new ArrayList<>();

    // SAVE logs to TEXT file
    public static void saveAsText() throws Exception {
        FileWriter writer = new FileWriter("weather_logs.txt");
        for (String log : logs) {
            writer.write(log + "\n");
        }
        writer.close();
    }

    // SERIALIZE logs (save object)
    public static void saveSerialized() throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("weather_report.ser"));
        out.writeObject(logs);
        out.close();
    }

    // LOAD serialized logs (restore object)
    public static void loadSerialized() throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("weather_report.ser"));
        logs = (ArrayList<String>) in.readObject();
        in.close();
    }
}
