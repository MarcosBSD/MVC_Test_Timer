package mvc_timer_test;

import java.awt.event.ActionListener;
import javax.swing.*;

public class GameView extends JFrame {
   private JLabel timerLabel = new JLabel();
   private JButton startButton = new JButton("Start");
   
   GameView() {
      JPanel gamePanel = new JPanel();
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(600,200);
      
      gamePanel.add(timerLabel);
      gamePanel.add(startButton);
      
      this.add(gamePanel);
   }
   
   public int getTimerLabel () {
      return Integer.parseInt(timerLabel.getText());
   }
   
   public void setTimerLabel(int timerValue) {
      timerLabel.setText(Integer.toString(timerValue));
   }
   
   void startButtonListener(ActionListener listenForStartButton) {
      startButton.addActionListener(listenForStartButton);
   }

}