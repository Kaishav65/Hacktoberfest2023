import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Stopwatch extends JFrame implements ActionListener {
    private long startTime;
    private Timer timer;
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private boolean running = false;

    public Stopwatch() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timeLabel = new JLabel("00:00.0");
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        timeLabel.setHorizontalAlignment(JLabel.CENTER);

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        timer = new Timer(100, this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        setLayout(new BorderLayout());
        add(timeLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!running) {
                startTime = System.currentTimeMillis() - (timeLabel.getText().equals("00:00.0") ? 0 : parseTime(timeLabel.getText()));
                timer.start();
                running = true;
                startButton.setText("Pause");
            } else {
                timer.stop();
                running = false;
                startButton.setText("Resume");
            }
        } else if (e.getSource() == stopButton) {
            if (running) {
                timer.stop();
                running = false;
                startButton.setText("Resume");
            }
        } else if (e.getSource() == resetButton) {
            timer.stop();
            running = false;
            startButton.setText("Start");
            timeLabel.setText("00:00.0");
        } else if (e.getSource() == timer) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - startTime;
            updateTimeLabel(elapsedTime);
        }
    }

    private void updateTimeLabel(long elapsedTime) {
        long minutes = (elapsedTime / 1000) / 60;
        long seconds = (elapsedTime / 1000) % 60;
        long tenths = (elapsedTime / 100) % 10;
        DecimalFormat df = new DecimalFormat("00");
        timeLabel.setText(df.format(minutes) + ":" + df.format(seconds) + "." + tenths);
    }

    private long parseTime(String timeStr) {
        String[] parts = timeStr.split(":");
        long minutes = Long.parseLong(parts[0]);
        String[] secondsParts = parts[1].split("\\.");
        long seconds = Long.parseLong(secondsParts[0]);
        long tenths = Long.parseLong(secondsParts[1]);
        return (minutes * 60 + seconds) * 1000 + tenths * 100;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.setVisible(true);
        });
    }
}
