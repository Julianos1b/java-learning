package dev.julianos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ui();
    }

    public static void ui(){
        JFrame frame = new JFrame("Converter");
        frame.setSize(500,500);
        frame.setLocation(700, 300);
        JLabel text = new JLabel("Wie viel Euro möchtest du Umwandeln ?");
        text.setBounds(50,50,300,100);
        frame.add(text);

        frame.setDefaultLookAndFeelDecorated(true);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}