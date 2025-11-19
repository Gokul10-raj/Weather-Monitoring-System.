import javax.swing.*;

public class LivePage {

    JFrame frame = new JFrame("Live Weather Dashboard");
    JLabel tempLabel = new JLabel("Temperature: --");
    JLabel humidityLabel = new JLabel("Humidity: --");

    LiveMonitor monitor;

    public LivePage() {

        tempLabel.setBounds(50, 50, 250, 30);
        humidityLabel.setBounds(50, 100, 250, 30);

        JButton startBtn = new JButton("Start Monitoring");
        startBtn.setBounds(50, 150, 150, 40);

        JButton stopBtn = new JButton("Stop Monitoring");
        stopBtn.setBounds(220, 150, 150, 40);

        // START Monitoring
        startBtn.addActionListener(e -> {
            monitor = new LiveMonitor();
            monitor.start();

            // Auto update labels
            new Timer(2000, event -> updateLabels()).start();

            JOptionPane.showMessageDialog(frame, "Live Monitoring Started");
        });

        // STOP Monitoring
        stopBtn.addActionListener(e -> {
            if (monitor != null) {
                monitor.running = false;
            }
            JOptionPane.showMessageDialog(frame, "Monitoring Stopped");
        });

        frame.add(tempLabel);
        frame.add(humidityLabel);
        frame.add(startBtn);
        frame.add(stopBtn);

        frame.setSize(450, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void updateLabels() {
        if (!WeatherLog.logs.isEmpty()) {
            String latest = WeatherLog.logs.get(WeatherLog.logs.size() - 1);
            String[] parts = latest.split("\\|");

            tempLabel.setText(parts[0]);
            humidityLabel.setText(parts[1]);
        }
    }
}
