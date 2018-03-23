package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstGUI extends JFrame{
    private JButton button1 = new JButton("OK");
    private JLabel label1 = new JLabel("Animal name:");
    private JTextField input1 = new JTextField();
    private JRadioButton domestic = new JRadioButton("domestic");
    private JRadioButton wild = new JRadioButton("wild");
    private JCheckBox hungry = new JCheckBox("Hungry");
    public FirstGUI(){
        super("Animals");
        this.setBounds(200,200,200,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label1);
        container.add(input1);
        ButtonGroup rboxes = new ButtonGroup();
        rboxes.add(domestic);
        rboxes.add(wild);
        container.add(domestic);
        container.add(wild);
        container.add(hungry);
        button1.addActionListener(new ButtonEventListener());
        container.add(button1);
    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String messege = "The animal. ";
            messege += "My name is " + input1.getText() + ". ";
            messege += "I am a " + (domestic.isSelected() ? "domestic":"wild") + " animal. ";
            messege += "I am " + (hungry.isSelected()? "very hungry! ":"not hungry! ");
            JOptionPane.showMessageDialog(null,messege,"Animal say", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
