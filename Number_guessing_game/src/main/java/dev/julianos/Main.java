package dev.julianos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import javax.swing.*;

public class Main {
    static JLabel text = new JLabel("Gebe eine Zahl an bitti");
    static JTextField textField = new JTextField();
    static JLabel versucheText = new JLabel("Versuche : 0");
    static int randomNumber = ThreadLocalRandom.current().nextInt(1, 100 + 1);
    static int Versuche = 0;
    public static void main(String[] args) {
        System.out.println("Errate die Zahl");
        openUi();
    }
    public static void openUi(){
        JFrame frame = new JFrame("Ratespiel");
        JButton button = new JButton("Raten!");
        frame.setSize(500, 500);
        frame.setLocation(100, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        text.setBounds(50,50,500,300);
        versucheText.setBounds(340,50,500,300);
        frame.add(text);
        frame.add(versucheText);
        textField.setBounds(50,150,200, 30);
        frame.add(textField);
        button.setBounds(270,150,200,30);
        frame.add(button);
        frame.setLayout(null);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String textFromTextField = textField.getText();
                    int number = Integer.parseInt(textFromTextField);
                    guess(number);
                } catch (Exception error) {
                    text.setText("NUR GANZE ZAHLEN DU DEPP");
                    textField.setText("");
                }
            }
        });
        frame.setVisible(true);
   }

    public static void guess(Integer number) {
        Versuche += 1;
        versucheText.setText("Versuche : " + Versuche);
        if(number==randomNumber) {
            versucheText.setText("");
            System.out.println("Richtig geraten!!!");
            System.out.println("Du hast das in " + Versuche + " Versuchen geschafft.");
            text.setText("Richtig geraten, du hast es in " + Versuche + " Versuchen geschafft");
        } else {
            System.out.println("Falsch!");
            if (number > randomNumber) {
                System.out.println("Niedriger!");
                text.setText("Falsch, Niedriger");
                textField.setText("");
            } else if (number < randomNumber) {
                System.out.println("Höher!");
                text.setText("Falsch, Höher");
                textField.setText("");
            }
        }
    }
}