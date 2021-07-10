package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class WindowStartVocabulary extends JFrame {
    //    private int voron = 0;
    private JLabel countLabel;
    private JButton WSExit;
    private JButton WSENglishLanguage;
    private JButton WSJava;

    public WindowStartVocabulary() {
        super("VOCABULARY");
        WSENglishLanguage = new JButton("English");
        WSJava = new JButton("Java");
        WSExit = new JButton("Exit");

        WSExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        WSENglishLanguage.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            }
        });
        WSJava.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            }
        });
        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());

        buttonsPanel.add(WSENglishLanguage);
        buttonsPanel.add(WSJava);
        buttonsPanel.add(WSExit);

        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
