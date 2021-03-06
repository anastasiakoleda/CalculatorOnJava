package com.company;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Panel extends JPanel {

    private JButton numbers[] = new JButton[10];
    private Font font = new Font("SanSerif", Font.BOLD,20);
    private JTextField output = new JTextField();
    private JButton backspace = new JButton("<"), equ = new JButton("=");
    private JButton plus = new JButton("+"), minus = new JButton("-"),multi = new JButton("*"), div = new JButton("/");
    int firstValue = 0;
    String operation = "+";



    public Panel(){
        setLayout(null);

        backspace.setBounds(10,250,51,50);
        backspace.setFont(font);
        add(backspace);

        plus.setBounds(190,70,51,50);
        plus.setFont(font);
        add(plus);

        minus.setBounds(190,130,51,50);
        minus.setFont(font);
        add(minus);

        multi.setBounds(190,190,51,50);
        multi.setFont(font);
        add(multi);

        div.setBounds(190,250,51,50);
        div.setFont(font);
        add(div);

        equ.setBounds(130,250,51,50);
        equ.setFont(font);
        add(equ);

        numbers[0] = new JButton( "0");
        numbers[0].setBounds(70, 250, 50, 50);
        numbers[0].setFont(font);
        add(numbers[0]);

        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
               numbers[x * 3 + y + 1] = new JButton((x * 3 + y + 1)+ "");
               numbers[x * 3 + y + 1].setBounds(x * (50 + 10) + 10, y * (50 + 10) + 70, 50, 50);
               numbers[x * 3 + y + 1].setFont(font);
               add(numbers[x * 3 + y + 1]);
            }
        }

        output.setBounds(10,10,230,50);
        output.setFont(font);
        output.setEditable(false);
        add(output);

        ActionListener l = (ActionEvent e) -> {
           JButton b = (JButton) e.getSource();
           output.setText(output.getText() + b.getText()); //To the output line add old text and new text from the button
        };

        for (JButton b :  numbers){
            b.addActionListener(l);
        }

        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String temp = output.getText();
              output.setText(temp.substring(0,temp.length()-1));
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              firstValue = Integer.valueOf(output.getText());
              output.setText("");
              operation = "+";
            }
        });

        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             firstValue = Integer.valueOf(output.getText());
             output.setText("");
             operation = "*";
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(output.getText());
                output.setText("");
                operation = "/";
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(output.getText());
                output.setText("");
                operation = "-";
            }
        });

        equ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int secondValue = Integer.valueOf(output.getText());
                if("+".equals(operation)){
                    output.setText((firstValue+secondValue)+"");
                }
                if("-".equals(operation)){
                    output.setText((firstValue-secondValue)+"");
                }
                if("*".equals(operation)){
                    output.setText((firstValue*secondValue)+"");
                }
                if("/".equals(operation)){
                    output.setText((firstValue/secondValue)+"");
                }
                firstValue = 0;
                operation = "+";
            }
        });


    }

}
