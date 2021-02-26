package ru.geebrains.online;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {

    private Account currentAccount;


    public UserInterface () {
        this.setTitle("Chat");
        this.setSize(600, 700);
        this.getContentPane().setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainWindow());
        this.setVisible(true);
    }



    public static void main(String ... args){

        Account a = new Account("Name", "pass");
        UserInterface b = new UserInterface();

    }


    private JPanel mainWindow(){
        JPanel mainWindow = new JPanel();
        mainWindow.setBackground(Color.CYAN);
        mainWindow.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainWindow.setPreferredSize(new Dimension(600, 700));
        mainWindow.setBorder(BorderFactory.createTitledBorder("Chat name"));

        JPanel chat = new JPanel();
        chat.setBackground(Color.WHITE);
        chat.setLayout(new FlowLayout(FlowLayout.CENTER));
        chat.setPreferredSize(new Dimension(470, 500));
        JScrollPane scroll = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setPreferredSize(new Dimension(450, 480));

        JTextArea historyArea = new JTextArea();
        historyArea.setEnabled(false);
        historyArea.add(scroll);
        chat.add(historyArea);
        mainWindow.add(chat);

        JPanel messagePanel = new JPanel();
        messagePanel.setBackground(Color.WHITE);
        messagePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        messagePanel.setPreferredSize(new Dimension(470, 60));
        JTextField userText = new JTextField();
        userText.setLayout(new FlowLayout(FlowLayout.CENTER));
        userText.setPreferredSize(new Dimension(390,50));
        JButton sendMessage = new JButton("Send");
        messagePanel.add(userText);
        messagePanel.add(sendMessage);
        mainWindow.add(messagePanel);

        userText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Клик по кнопке");
                historyArea.setText("Your message : "+userText.getText());

            }
        });

        sendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Клик по кнопке");
                historyArea.setText("Your message : "+userText.getText());

            }
        });





        return mainWindow;
    }





}
