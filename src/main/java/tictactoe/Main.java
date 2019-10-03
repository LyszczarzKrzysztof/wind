package tictactoe;


import windows.Wind;
import buttons.Butt;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        Wind wind = new Wind();
        wind.setTitle("My first window");

        Butt bPodajDate = new Butt();
        bPodajDate.setText("Podaj date");
        bPodajDate.setName("bPodajDate");
        bPodajDate.addActionListener(bPodajDate);
        wind.add(bPodajDate);

        Butt bWyjscie = new Butt();
        bWyjscie.setText("Wyjscie");
        bWyjscie.setName("bWyjscie");
        bWyjscie.setBounds(500-150,450,300,200);
        bWyjscie.addActionListener(wind);
        wind.add(bWyjscie);






        wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wind.setVisible(true);
    }
}
