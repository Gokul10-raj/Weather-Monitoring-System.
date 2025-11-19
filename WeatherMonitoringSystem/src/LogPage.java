import javax.swing.*;
import java.io.*;

public class LogPage {

    JFrame frame = new JFrame("Weather Logs");

    public LogPage() {

        JTextArea area = new JTextArea();

        for (String log : WeatherLog.logs) {
            area.append(log + "\n");
        }

        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(20, 20, 350, 200);

        JButton saveTxtBtn = new JButton("Save as Text");
        saveTxtBtn.setBounds(20, 230, 120, 40);

        JButton saveSerBtn = new JButton("Serialize");
        saveSerBtn.setBounds(150, 230, 120, 40);

        JButton loadSerBtn = new JButton("Load");
        loadSerBtn.setBounds(280, 230, 90, 40);

        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(150, 280, 120, 40);


        // SAVE TEXT FILE
        saveTxtBtn.addActionListener(e -> {
            try {
                WeatherLog.saveAsText();
                JOptionPane.showMessageDialog(frame, 
                    "Logs saved as weather_logs.txt");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error saving text file.");
            }
        });

        // SERIALIZE
        saveSerBtn.addActionListener(e -> {
            try {
                WeatherLog.saveSerialized();
                JOptionPane.showMessageDialog(frame, 
                    "Logs serialized to weather_report.ser");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error serializing logs.");
            }
        });

        // LOAD SERIALIZED DATA
        loadSerBtn.addActionListener(e -> {
            try {
                WeatherLog.loadSerialized();
                area.setText("");
                for (String log : WeatherLog.logs) {
                    area.append(log + "\n");
                }
                JOptionPane.showMessageDialog(frame, "Logs Loaded!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error loading logs.");
            }
        });

        // CLEAR BUTTON
        clearBtn.addActionListener(e -> {
            WeatherLog.logs.clear();
            area.setText("");
        });

        frame.add(scroll);
        frame.add(saveTxtBtn);
        frame.add(saveSerBtn);
        frame.add(loadSerBtn);
        frame.add(clearBtn);

        frame.setSize(420, 380);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
