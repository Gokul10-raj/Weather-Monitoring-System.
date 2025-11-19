import javax.swing.*;

public class MainPage {

    JFrame frame = new JFrame("Weather Monitoring System");

    public MainPage() {

        // BUTTON 1 — Start Monitoring
        JButton startBtn = new JButton("Start Monitoring");
        startBtn.setBounds(80, 60, 200, 40);

        // BUTTON 2 — View Logs
        JButton viewLogsBtn = new JButton("View Logs");
        viewLogsBtn.setBounds(80, 120, 200, 40);

        // BUTTON 3 — Live Dashboard (Advanced GUI)
        JButton liveBtn = new JButton("Live Dashboard");
        liveBtn.setBounds(80, 180, 200, 40);

        // ACTION — Start Monitoring Thread
        startBtn.addActionListener(e -> {
            LiveMonitor monitor = new LiveMonitor();
            monitor.start();
            JOptionPane.showMessageDialog(frame, "Monitoring Started");
        });

        // ACTION — Open Logs Page
        viewLogsBtn.addActionListener(e -> {
            new LogPage();
        });

        // ACTION — Open Live Dashboard Page
        liveBtn.addActionListener(e -> {
            new LivePage();
        });

        frame.add(startBtn);
        frame.add(viewLogsBtn);
        frame.add(liveBtn);

        frame.setSize(380, 320);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
