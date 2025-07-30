package dev.julianos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static JLabel text = new JLabel("Wie viel Euro möchtest du Umwandeln ?");
    static JLabel ausgabe = new JLabel("");
    public static void main(String[] args) {
        ui();
    }

    public static void ui(){
        JFrame frame = new JFrame("Converter");
        frame.setSize(500,500);
        frame.setLocation(700, 300);
        JTextField input = new JTextField();
        input.setBounds(250,90,50,20);
        text.setBounds(5,50,300,100);
        ausgabe.setBounds(100,150,599,500);
        JButton dollar = new JButton("Dollar");
        dollar.setBounds(20,200,100,100);
        dollar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String textFromTextField = input.getText();
                    double money = Integer.parseInt(textFromTextField);
                    dollar(money);
                } catch (Exception error) {
                    text.setText("du hast einen Fehler gemacht");
                    input.setText("");
                }
            }
        });

        JButton yuan = new JButton("Yuan");
        yuan.setBounds(120,200,100,100);
        yuan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String textFromTextField = input.getText();
                    double money = Integer.parseInt(textFromTextField);
                    yuan(money);
                } catch (Exception error) {
                    text.setText("du hast einen Fehler gemacht");
                    input.setText("");
                }
            }
        });

        JButton naira = new JButton("Naira");
        naira.setBounds(220,200,100,100);
        naira.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String textFromTextField = input.getText();
                    double money = Integer.parseInt(textFromTextField);
                    naira(money);
                } catch (Exception error) {
                    text.setText("du hast einen Fehler gemacht");
                    input.setText("");
                }
            }
        });

        frame.add(dollar);
        frame.add(yuan);
        frame.add(naira);
        frame.add(text);
        frame.add(ausgabe);
        frame.add(input);


        frame.setDefaultLookAndFeelDecorated(true);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void dollar(double money){
        text.setText("Wie viel Euro möchtest du Umwandeln ?");
        double dollar = money * 1.14;
        ausgabe.setText("Deine " + money + " Euro währen " + dollar + " Dollar.");
        }
    public static void yuan(double money){
        text.setText("Wie viel Euro möchtest du Umwandeln ?");
        double dollar = money * 8.20;
        ausgabe.setText("Deine " + money + " Euro währen " + dollar + " Yuan.");
    }
    public static void naira(double money){
        text.setText("Wie viel Euro möchtest du Umwandeln ?");
        double dollar = money * 1769.10;
        ausgabe.setText("Deine " + money + " Euro währen " + dollar + " Naira.");
    }
    }